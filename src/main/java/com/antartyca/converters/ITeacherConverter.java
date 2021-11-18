package com.antartyca.converters;

import com.antartyca.domain.Teacher;
import com.antartyca.domain.TeacherPresenter;

public interface ITeacherConverter {

	com.antartyca.model.Teacher convert(Teacher teacherModel);

	com.antartyca.model.Teacher convert(com.antartyca.domain.TeacherPresenter teacherPresenter);

	TeacherPresenter convert(com.antartyca.model.Teacher teacherModel);

}
