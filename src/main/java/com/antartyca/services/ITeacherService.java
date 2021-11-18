package com.antartyca.services;

import com.antartyca.domain.TeacherPresenterDto;
import com.antartyca.domain.TeacherRegisterDto;

public interface ITeacherService {

//	TeacherPresenter getTeacher(String id);
//
	TeacherPresenterDto createTeacher(TeacherRegisterDto teacherDomain);
//
//	List<TeacherPresenter> getTeacherByName(String name);
//
//	List<TeacherPresenter> listTeachers();

	TeacherPresenterDto activate(Long teacherId, boolean active);

//	List<TeacherPresenter> findByFirstnameLike(String secondName);
//
//	List<TeacherPresenter> findByStartDateBetween(Date dateOfBird);
//
//	List<TeacherPresenter> findByFirstSecondNameLike(String secondName);

}
