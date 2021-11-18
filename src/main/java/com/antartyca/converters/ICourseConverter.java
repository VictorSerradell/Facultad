package com.antartyca.converters;

import com.antartyca.domain.CoursePresenterDto;
import com.antartyca.domain.StudentsDto;
import com.antartyca.model.Course;

public interface ICourseConverter {

	CoursePresenterDto convert(com.antartyca.domain.CourseDto courseDomain);

	com.antartyca.domain.CourseDto convert(Course coursesDomain);

	Course convert(StudentsDto coursesDomain);

	Object convert(CoursePresenterDto c);

	

}
