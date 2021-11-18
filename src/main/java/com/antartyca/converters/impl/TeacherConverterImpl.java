package com.antartyca.converters.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.ITeacherConverter;
import com.antartyca.domain.TeacherPresenterDto;
import com.antartyca.domain.TeacherRegisterDto;
import com.antartyca.model.Teacher;


@Service
public class TeacherConverterImpl implements ITeacherConverter{
	
	@SuppressWarnings("unused")
	@Autowired
	private ICourseConverter courseConverter;

	@Override
	public Teacher convert(TeacherRegisterDto teacherRegister) {

		Teacher teacherModel = new Teacher();
		
		teacherModel.setName(teacherRegister.getNombre());
		teacherModel.setSurname(teacherRegister.getSurname());
		teacherModel.setDateOfBird(teacherRegister.getDate_of_bird());
		
		return teacherModel;
	}
	
	@Override
	public TeacherPresenterDto convert(Teacher teacherModel) {
		
		TeacherPresenterDto teacherPresenter = new TeacherPresenterDto();
		
		teacherPresenter.setId(teacherModel.getId());
		teacherPresenter.setName(teacherModel.getName());
		//teacherPresenter.setCourseList();
		
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
		
		
		//teacherPresenter.setCourseList();
		
		return teacherPresenter;
	}
	
//	@Override
//	public Teacher convert(com.antartyca.domain.TeacherDto teacherDomain) {
//		
//		Teacher teacherModel = new Teacher();
//		
//		
//		teacherModel.setId(teacherDomain.getId());
//		teacherModel.setName(teacherDomain.getName());
//		teacherModel.setSurname(teacherDomain.getSurname());
//		teacherModel.setDateOfBird(teacherDomain.getDateOfBird());
//		
//		return teacherModel;
//		
//		
//	}
//	
//	@Override
//	public Teacher convert(TeacherPresenterDto teacherPresenter) {
//		
//		Teacher teacherModel = new Teacher();
//		
//		
//		teacherModel.setId(teacherPresenter.getId());
//		teacherModel.setName(teacherPresenter.getName());
//		//teacherModel.setCourseList((List<Course>) teacherPresenter.getCourseList());
//		
//		return teacherModel;
//	}

}
