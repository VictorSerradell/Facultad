package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TeacherPresenterDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String surname;
	
	private Long id;
	
	private Date dateOfBird;
	
	boolean departmentHead;
	
	private List<CourseDto>courseList ;
	
	private List<CourseDto>coordinator;

	public TeacherPresenterDto() {
		super();
	}

	public TeacherPresenterDto(String name, String surname, Long id, Date dateOfBird, boolean departmentHead,
			List<CourseDto> courseList, List<CourseDto> coordinator) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.dateOfBird = dateOfBird;
		this.departmentHead = departmentHead;
		this.courseList = courseList;
		this.coordinator = coordinator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOfBird() {
		return dateOfBird;
	}

	public void setDateOfBird(Date dateOfBird) {
		this.dateOfBird = dateOfBird;
	}

	public boolean isDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(boolean departmentHead) {
		this.departmentHead = departmentHead;
	}

	public List<CourseDto> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseDto> courseList) {
		this.courseList = courseList;
	}

	public List<CourseDto> getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(List<CourseDto> coordinator) {
		this.coordinator = coordinator;
	}

	@Override
	public String toString() {
		return "TeacherPresenterDto [name=" + name + ", surname=" + surname + ", id=" + id + ", dateOfBird="
				+ dateOfBird + ", departmentHead=" + departmentHead + ", courseList=" + courseList + ", coordinator="
				+ coordinator + "]";
	}

}
