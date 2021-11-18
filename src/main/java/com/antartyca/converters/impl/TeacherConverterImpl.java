package com.antartyca.converters.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.ITeacherConverter;
import com.antartyca.domain.Course;
import com.antartyca.domain.CoursePresenter;
import com.antartyca.model.Teacher;
import com.antartyca.domain.TeacherPresenter;
@Service
public class TeacherConverterImpl implements ITeacherConverter{
	
	@Autowired
	private ICourseConverter courseConverter;
	
	@Override
	public TeacherPresenter convert(Teacher teacherModel) {
		
		TeacherPresenter teacherPresenter = new TeacherPresenter();
		
		teacherPresenter.setId(teacherModel.getId());
		teacherPresenter.setName(teacherModel.getName());
		teacherPresenter.setCourseList();
		
		/*
		 * List<CoursePresenter>courseListDomain = new ArrayList<>();
		 * 
		 * if(teacherModel.getCourseList() != null &&
		 * !teacherModel.getCourseList().isEmpty()) { courseListDomain =
		 * teacherModel.getCourseList() .stream().map(course
		 * ->courseConverter.convert(course)) .collect(Collectors.toList());
		 * 
		 * 
		 * }
		 */
		
		
		teacherPresenter.setCourseList();
		
		return teacherPresenter;
	}
	
	@Override
	public Teacher convert(com.antartyca.domain.Teacher teacherDomain) {
		
		Teacher teacherModel = new Teacher();
		
		
		teacherModel.setId(teacherDomain.getId());
		teacherModel.setName(teacherDomain.getName());
		teacherModel.setSurname(teacherDomain.getSurname());
		teacherModel.setDateOfBird(teacherDomain.getDateOfBird());
		
		return teacherModel;
		
		
	}
	
	@Override
	public Teacher convert(TeacherPresenter teacherPresenter) {
		
		Teacher teacherModel = new Teacher();
		
		
		teacherModel.setId(teacherPresenter.getId());
		teacherModel.setName(teacherPresenter.getName());
		//teacherModel.setCourseList((List<Course>) teacherPresenter.getCourseList());
		
		return teacherModel;
	}

}
