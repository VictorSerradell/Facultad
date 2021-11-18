package com.antartyca.services.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.IStudentsConverter;
import com.antartyca.converters.impl.CourseConverterImpl;
import com.antartyca.domain.CoursePresenter;
import com.antartyca.domain.Students;
import com.antartyca.domain.StudentsPresenter;
import com.antartyca.model.Course;
import com.antartyca.repositories.IStudentsRepository;
import com.antartyca.repositories.IcourseRepository;
import com.antartyca.services.IStudentsService;

@Service("studentsServiceImpl")
public class StudentsServiceImpl implements IStudentsService {
	
	@Autowired
	private IStudentsConverter studentsConverter;
	
	@Autowired
	private IStudentsRepository studentsRepository;
	
	@Autowired
	private IcourseRepository courseRepository;
	
	@Autowired
	private ICourseConverter CourseConverter;
	
	
	//Create
	@Override
	public StudentsPresenter createStudents(com.antartyca.domain.Students studentsDomain) {
		com.antartyca.model.Students studentsModel = studentsConverter.convert(studentsDomain);
		
		studentsModel = studentsRepository.save(studentsModel);
		
		StudentsPresenter studentsPresenter = studentsConverter.convert(studentsModel);
		
		return studentsPresenter ;
	}

	
	// Get Students_List
	
	@Override
	public com.antartyca.model.Students getListCourse(String id){
		
		Optional<com.antartyca.model.Students> studentsOpt = null;
		com.antartyca.model.Students studentsModel;
		
		try {
			studentsModel = studentsOpt.orElseThrow();
			
		}catch ( NoSuchElementException nsee) {
			return null;
		}
		return studentsRepository.save(studentsModel); 
		
		/*
		 * com.antartyca.model.Students studentsPresenter =
		 * studentsConverter.convert(studentsModel);
		 */
		
		/* return studentsPresenter; */
		
	}
	
	// Get Courses_List

	@Override
	public List<com.antartyca.domain.Course> getCourses(String name) {
		
		
		List<Course> courseListModel = courseRepository
				.findByNameAndActiveTrueOrderBySurnameAsc(name);
		
		List<com.antartyca.domain.Course> courseListDomain = 
				courseListModel.stream()
				.map(c -> CourseConverter.convert(c))
				.collect(Collectors.toList());
				

		return courseListDomain;
	}
	
	//Get getGlobalAverageMedia
	
	@Override
	public StudentsPresenter getGlobalAverageMedia() {
		return null;
		
	}



	@Override
	public StudentsPresenter getStudents(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	


	@Override
	public List<com.antartyca.domain.Course> getCoursesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
	
	
	
	

	


	

	
	
	
	
	
	

}
