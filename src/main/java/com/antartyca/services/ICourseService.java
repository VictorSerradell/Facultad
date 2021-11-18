package com.antartyca.services;

import java.util.List;

import com.antartyca.domain.Course;
import com.antartyca.domain.CoursePresenter;
import com.antartyca.domain.Students;

public interface ICourseService {

	Course createCourses(Students coursesDomain);

	CoursePresenter getCourse(String id);

	List<Course> getStudentsList();

	List<Course> getTeacherList();

	List<CoursePresenter> getStudentsList(String name);

}
