package com.antartyca.services.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.domain.CourseDto;
import com.antartyca.domain.CoursePresenterDto;
import com.antartyca.repositories.IcourseRepository;
import com.antartyca.services.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
	
//	@Autowired
//	private ICourseConverter courseConverter;
//	
//	@Autowired
//	private IcourseRepository courseRepository;
//	
//	
//	//Create Course
//	@Override
//	public Course createCourses(com.antartyca.domain.Students coursesDomain) {
//		
//		com.antartyca.model.Course coursesModel = courseConverter.convert(coursesDomain);
//		
//		coursesModel = courseRepository.save(coursesModel);
//		
//		Course coursesPresenter = courseConverter.convert(coursesModel);
//		
//		return coursesPresenter;
//	}
//	
//	// Get Course
//	@Override
//	public com.antartyca.domain.CoursePresenter getCourse(String id) {
//		
//		Optional<Course> courseOpt = courseRepository.findById(id);
//		Course courseModel;
//		
//		try {
//			courseModel = courseOpt.orElseThrow();
//		}catch (NoSuchElementException nsee) {
//			return null;
//		}
//		
//		com.antartyca.domain.CoursePresenter coursePresenter = courseConverter.convert(courseModel);
//				return coursePresenter;
//		
//	}
//	
//	
//	
//	
//	
//	
//	  @Override 
//	  public List<CoursePresenter> getStudentsList(String name){
//	  
//	  List<Course> courseListModel = courseRepository.getStudentsList();
//	  List<CoursePresenter> courseListDomain = courseListModel.stream() .map(c ->
//	  courseConverter.convert(c)) .collect(Collectors.toList());
//	  
//	  return courseListDomain; }
//	  
//	  
//	  //Get list_Students
//	  @Override
//	  public List<Course> getStudentsList() {
//		List<Course> courseListModel = courseRepository.getStudentsList();
//		List<CoursePresenter> courseListDomain = courseListModel.stream()
//				.map(c -> courseConverter.convert(c))
//				.collect(Collectors.toList());
//		
//		return courseListModel;
//	}
//	  
//
//	  @Override
//	  public List<Course> getTeacherList() {
//		  List<Course> courseListModel = courseRepository.getTeacherList();
//			List<CoursePresenter> courseListDomain = courseListModel.stream()
//					.map(c -> courseConverter.convert(c))
//					.collect(Collectors.toList());
//			
//			return courseListModel;
//	}
//
//	
//	
	

}
