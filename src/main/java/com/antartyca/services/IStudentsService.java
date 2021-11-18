package com.antartyca.services;

import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsPresenterDto;

public interface IStudentsService {
	
	StudentsPresenterDto getStudents(Long id);
	
	//List<Course> getCourses(String name);

	//List<Course> getCoursesByName(String name);

	//StudentsPresenter getGlobalAverageMedia();


	StudentsPresenterDto createStudents(StudentRegisterDto studentsDomain);

	//com.antartyca.model.Students getListCourse(Long id);

}
