package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;

import com.antartyca.enums.DepartamentEnum;
import com.antartyca.model.Teacher;

public class CoursePresenterDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	
	private String name;
	
	private DepartamentEnum departament;
	
	private List<CourseDto> courseList;
	
	private List<com.antartyca.model.Teacher> teacherList;	
	
	private List<StudentsDto> studentsList;
	
	private String coordinator;

	public CoursePresenterDto() {
		super();
	}

	public CoursePresenterDto(String id, String name, DepartamentEnum departament, List<CourseDto> courseList,
			List<Teacher> teacherList, List<StudentsDto> studentsList, String coordinator) {
		super();
		this.id = id;
		this.name = name;
		this.departament = departament;
		this.courseList = courseList;
		this.teacherList = teacherList;
		this.studentsList = studentsList;
		this.coordinator = coordinator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<CourseDto> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseDto> courseList) {
		this.courseList = courseList;
	}

	public List<com.antartyca.model.Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<com.antartyca.model.Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public List<StudentsDto> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<StudentsDto> studentsList) {
		this.studentsList = studentsList;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	@Override
	public String toString() {
		return "CoursePresenterDto [id=" + id + ", name=" + name + ", departament=" + departament + ", courseList="
				+ courseList + ", teacherList=" + teacherList + ", studentsList=" + studentsList + ", coordinator="
				+ coordinator + "]";
	}
	
}
