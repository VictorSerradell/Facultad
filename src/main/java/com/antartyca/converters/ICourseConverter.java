package com.antartyca.converters;

import com.antartyca.domain.CoursePresenter;
import com.antartyca.domain.Students;
import com.antartyca.model.Course;

public interface ICourseConverter {

	CoursePresenter convert(com.antartyca.domain.Course courseDomain);

	com.antartyca.domain.Course convert(Course coursesDomain);

	Course convert(Students coursesDomain);

	Object convert(CoursePresenter c);

	

}
