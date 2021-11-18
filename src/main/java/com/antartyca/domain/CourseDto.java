package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;

import com.antartyca.enums.DepartamentEnum;

public class CourseDto extends BaseDto implements Serializable{
	
	private static final long serialVersionUID = -6266139770573395648L;

	private String name;
	
	private DepartamentEnum departament;
	
	private List<TeacherDto>teacherList;
	
	private List<StudentsDto>studentsList;
	
	private List<CourseDto>courseList;
	
	private String coordinator;
	
	private CoursePresenterDto subjects_course;
	
	public CourseDto() {
		super();
	}

	public CourseDto(String name, DepartamentEnum departament, List<TeacherDto> teacherList,
			List<StudentsDto> studentsList, List<CourseDto> courseList, String coordinator,
			CoursePresenterDto subjects_course) {
		super();
		this.name = name;
		this.departament = departament;
		this.teacherList = teacherList;
		this.studentsList = studentsList;
		this.courseList = courseList;
		this.coordinator = coordinator;
		this.subjects_course = subjects_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartamentEnum getDepartament() {
		return departament;
	}

	public void setDepartament(DepartamentEnum departament) {
		this.departament = departament;
	}

	public List<TeacherDto> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<TeacherDto> teacherList) {
		this.teacherList = teacherList;
	}

	public List<StudentsDto> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<StudentsDto> studentsList) {
		this.studentsList = studentsList;
	}

	public List<CourseDto> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseDto> courseList) {
		this.courseList = courseList;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public CoursePresenterDto getSubjects_course() {
		return subjects_course;
	}

	public void setSubjects_course(CoursePresenterDto subjects_course) {
		this.subjects_course = subjects_course;
	}

	@Override
	public String toString() {
		return "CourseDto [name=" + name + ", departament=" + departament + ", teacherList=" + teacherList
				+ ", studentsList=" + studentsList + ", courseList=" + courseList + ", coordinator=" + coordinator
				+ ", subjects_course=" + subjects_course + "]";
	}

}
