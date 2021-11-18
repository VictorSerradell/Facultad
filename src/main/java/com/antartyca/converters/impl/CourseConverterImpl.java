package com.antartyca.converters.impl;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.ITeacherConverter;
import com.antartyca.domain.CoursePresenter;
import com.antartyca.domain.Students;
import com.antartyca.model.Course;
import com.antartyca.model.Teacher;

@Service("CourseConverterImpl")
public class CourseConverterImpl implements ICourseConverter {

	@Autowired
	private ITeacherConverter teacherConverter;
	
	
	


	@Override
	public CoursePresenter convert(com.antartyca.domain.Course courseModel) {
		CoursePresenter coursePresenter = new CoursePresenter();
		
		coursePresenter.setDepartament(courseModel.getDepartament());
		coursePresenter.setStudentsList(courseModel.getStudentsList());
		/* coursePresenter.setTeacherList(courseModel.getTeacherList()) */;
		coursePresenter.setCoordinator(courseModel.getCoordinator());
		
		List<Teacher> teacherListDomain = new ArrayList<>();
		
		if(courseModel.getTeacherList() != null && !courseModel.getTeacherList().isEmpty()) {
			teacherListDomain = courseModel.getTeacherList()
					.stream().map(teacher -> teacherConverter.convert(teacher))
					.collect(Collectors.toList());

		}
		
		coursePresenter.setTeacherList(teacherListDomain);
		
		return coursePresenter;
	}





	@Override
	public com.antartyca.domain.Course convert(Course courseDomain) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Course convert(Students coursesDomain) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Object convert(CoursePresenter c) {
		// TODO Auto-generated method stub
		return null;
	}













	


	
	
}
