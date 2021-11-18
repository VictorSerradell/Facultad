package com.antartyca.validation;

import org.springframework.stereotype.Service;

import com.antartyca.domain.Students;
import com.antartyca.domain.StudentsPresenter;
import com.antartyca.repositories.IStudentsRepository;
@Service
public class StudentsValidatorImpl implements IStudentsValidator{

	public boolean validateStudents(Students students) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateStudents(StudentsPresenter students) {
		// TODO Auto-generated method stub
		return false;
	}



}
