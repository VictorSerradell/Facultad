package com.antartyca.services;

import com.antartyca.domain.Teacher;
import com.antartyca.domain.TeacherPresenter;

import java.util.Date;
import java.util.List;

public interface ITeacherService {

	TeacherPresenter getTeacher(String id);

	TeacherPresenter createTeacher(Teacher teacherDomain);

	List<TeacherPresenter> getTeacherByName(String name);

	List<TeacherPresenter> listTeachers();

	TeacherPresenter activate(String personId);

	List<TeacherPresenter> findByFirstnameLike(String secondName);

	List<TeacherPresenter> findByStartDateBetween(Date dateOfBird);

	List<TeacherPresenter> findByFirstSecondNameLike(String secondName);

}
