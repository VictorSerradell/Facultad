package com.antartyca.validation;

import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsDto;
import com.antartyca.domain.StudentsPresenterDto;

public interface IStudentsValidator {
	
	public boolean validateStudents(StudentsPresenterDto students);
	
	boolean validateStudents(StudentsDto students);
	
	public boolean validateStudentRegister(StudentRegisterDto strudent);

}
