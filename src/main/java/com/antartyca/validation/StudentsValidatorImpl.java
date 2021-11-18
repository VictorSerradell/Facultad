package com.antartyca.validation;

import org.springframework.stereotype.Service;

import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsDto;
import com.antartyca.domain.StudentsPresenterDto;

@Service
public class StudentsValidatorImpl implements IStudentsValidator{

	public boolean validateStudents(StudentsDto students) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateStudents(StudentsPresenterDto students) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateStudentRegister(StudentRegisterDto student) {
		
		if(student.getNombre().length() < 5) {
			//throw new Exception("El nombre debe ser mayor a 5 letras.");
			return false;
		}
		
		if(student.getEdad() > 18 ) {
			//throw new Exception("debeser mayor de edad");
			return false;
		}
		
		return true;
	}



}
