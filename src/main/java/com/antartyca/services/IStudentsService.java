package com.antartyca.services;

import java.util.List;

import com.antartyca.domain.Course;
import com.antartyca.domain.CoursePresenter;
import com.antartyca.domain.Students;
import com.antartyca.domain.StudentsPresenter;

public interface IStudentsService {
	
	StudentsPresenter getStudents(String id);
	
	List<Course> getCourses(String name);

	List<Course> getCoursesByName(String name);

	StudentsPresenter getGlobalAverageMedia();


	StudentsPresenter createStudents(Students studentsDomain);

	com.antartyca.model.Students getListCourse(String id);

}
