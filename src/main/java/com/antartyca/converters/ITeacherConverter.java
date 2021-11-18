package com.antartyca.converters;

import com.antartyca.domain.TeacherPresenterDto;
import com.antartyca.domain.TeacherRegisterDto;
import com.antartyca.model.Teacher;

public interface ITeacherConverter {

	public Teacher convert(TeacherRegisterDto teacherModel);
//
//	com.antartyca.model.Teacher convert(com.antartyca.domain.TeacherPresenterDto teacherPresenter);

	public TeacherPresenterDto convert(Teacher teacherModel);

}
