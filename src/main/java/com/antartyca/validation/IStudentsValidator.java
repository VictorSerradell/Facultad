package com.antartyca.validation;

import com.antartyca.domain.Students;
import com.antartyca.domain.StudentsPresenter;

public interface IStudentsValidator {
	
	public boolean validateStudents(StudentsPresenter students);
	
	boolean validateStudents(Students students);

}
