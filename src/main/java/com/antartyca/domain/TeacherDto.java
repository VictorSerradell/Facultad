package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;

public class TeacherDto extends PersonDto implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private List<CourseDto>ListCourse;
	
	private List<CourseDto>ListCourseDepartmentHead;
	
	static boolean departmentHead;
	
	private TeacherPresenterDto subjects_teacher;
	

	public TeacherDto() {
		super();
	}

	public TeacherDto(List<CourseDto> listCourse, List<CourseDto> listCourseDepartmentHead,
			TeacherPresenterDto subjects_teacher) {
		super();
		ListCourse = listCourse;
		ListCourseDepartmentHead = listCourseDepartmentHead;
		this.subjects_teacher = subjects_teacher;
	}

	public List<CourseDto> getListCourse() {
		return ListCourse;
	}

	public void setListCourse(List<CourseDto> listCourse) {
		ListCourse = listCourse;
	}

	public List<CourseDto> getListCourseDepartmentHead() {
		return ListCourseDepartmentHead;
	}

	public void setListCourseDepartmentHead(List<CourseDto> listCourseDepartmentHead) {
		ListCourseDepartmentHead = listCourseDepartmentHead;
	}

	public static boolean isDepartmentHead() {
		return departmentHead;
	}

	public static void setDepartmentHead(boolean departmentHead) {
		TeacherDto.departmentHead = departmentHead;
	}

	public TeacherPresenterDto getSubjects_teacher() {
		return subjects_teacher;
	}

	public void setSubjects_teacher(TeacherPresenterDto subjects_teacher) {
		this.subjects_teacher = subjects_teacher;
	}

	@Override
	public String toString() {
		return "TeacherDto [ListCourse=" + ListCourse + ", ListCourseDepartmentHead=" + ListCourseDepartmentHead
				+ ", subjects_teacher=" + subjects_teacher + "]";
	}

}
