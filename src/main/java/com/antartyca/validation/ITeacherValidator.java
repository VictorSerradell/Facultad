package com.antartyca.validation;

import com.antartyca.domain.TeacherRegisterDto;

public interface ITeacherValidator {
	
	public boolean validateTeacherRegister(TeacherRegisterDto teacher);

//	boolean validateTeacher(Teacher teacher);
//
//	boolean validateTeacher(TeacherPresenter teacher);
	


}
