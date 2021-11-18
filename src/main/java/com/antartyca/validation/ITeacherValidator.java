package com.antartyca.validation;

import com.antartyca.domain.Person;
import com.antartyca.domain.Teacher;
import com.antartyca.domain.TeacherPresenter;

public interface ITeacherValidator {

	boolean validateTeacher(Teacher teacher);

	boolean validateTeacher(TeacherPresenter teacher);
	


}
