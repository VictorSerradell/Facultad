package com.antartyca.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.IStudentsConverter;
import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsPresenterDto;
import com.antartyca.model.Students;
import com.antartyca.repositories.IStudentsRepository;
import com.antartyca.services.IStudentsService;

@Service
public class StudentsServiceImpl implements IStudentsService {
	
	@Autowired
	private IStudentsConverter studentsConverter;
//	
	@Autowired
	private IStudentsRepository studentsRepository;
//	
//	@Autowired
//	private IcourseRepository courseRepository;
//	
//	@Autowired
//	private ICourseConverter CourseConverter;
	
	
	//Create
	@Override
	public StudentsPresenterDto createStudents(StudentRegisterDto studentsDomain) {
		
		Students studentsModel = studentsConverter.convert(studentsDomain);
		
		studentsModel = studentsRepository.save(studentsModel);
		
		StudentsPresenterDto studentsPresenter = studentsConverter.convert(studentsModel);
		
		return studentsPresenter ;
	}
	
	@Override
	public StudentsPresenterDto getStudents(Long id) {
		StudentsPresenterDto result = null;
		Optional<Students> studentOpt = studentsRepository.findById(id);
		if(!studentOpt.isEmpty() && studentOpt.isPresent()) {
			result = studentsConverter.convert(studentOpt.get());
		}
		
		return result;
	}


	
//	// Get Students_List
//	
//	@Override
//	public com.antartyca.model.Students getListCourse(Long id){
//		
//		Optional<com.antartyca.model.Students> studentsOpt = studentsRepository.findById(id);
//		
//		//com.antartyca.model.Students studentsModel;
//		
//		try {
//		//	studentsModel = studentsOpt.orElseThrow();
//			
//		}catch ( NoSuchElementException nsee) {
//			return null;
//		}
//		return studentsRepository.save(studentsOpt.get()); 
//		
//		/*
//		 * com.antartyca.model.Students studentsPresenter =
//		 * studentsConverter.convert(studentsModel);
//		 */
//		
//		/* return studentsPresenter; */
//		
//	}
//	
//	// Get Courses_List
//
//	@Override
//	public List<com.antartyca.domain.Course> getCourses(String name) {
//		
//		
//		List<Course> courseListModel = courseRepository
//				.findByNameAndActiveTrueOrderBySurnameAsc(name);
//		
//		List<com.antartyca.domain.Course> courseListDomain = 
//				courseListModel.stream()
//				.map(c -> CourseConverter.convert(c))
//				.collect(Collectors.toList());
//				
//
//		return courseListDomain;
//	}
//	
//	//Get getGlobalAverageMedia
//	
//	@Override
//	public StudentsPresenter getGlobalAverageMedia() {
//		return null;
//		
//	}
//
//
//

//
//	
//
//
//	@Override
//	public List<com.antartyca.domain.Course> getCoursesByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	
//	
//	
//	
//	
	
	
	

	


	

	
	
	
	
	
	

}
