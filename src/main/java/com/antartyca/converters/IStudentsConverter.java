package com.antartyca.converters;

import com.antartyca.model.Students;
import com.antartyca.domain.CourseDto;
import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsPresenterDto;

public interface IStudentsConverter {

	

	/*
	 * StudentsPresenter convertl(com.antartyca.model.Students studentsModel);
	 * 
	 * StudentsPresenter convert(StudentsPresenter studentsPresenter);
	 * 
	 * com.antartyca.model.Students convert(Students studentsModel);
	 * 
	 * Object convert(Course course);
	 * 
	 * Students convert(com.antartyca.domain.Students studentsDomain);
	 */

	
	com.antartyca.model.Students convert(StudentRegisterDto studentsDomain);
	StudentsPresenterDto convert(com.antartyca.model.Students studentsModel);

	

}
