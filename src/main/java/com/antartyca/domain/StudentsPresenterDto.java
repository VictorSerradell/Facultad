package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;

public class StudentsPresenterDto implements Serializable{

	private static final long serialVersionUID = 2768314037708665420L;

	private String id;

	private String name;

	private String surname;

	private String fullName;

	private int age;

	private List<CourseDto> courseList;

	private List<CourseDto> studentsList;

	public StudentsPresenterDto() {
		super();
	}

	public StudentsPresenterDto(String id, String name, String surname, String fullName, int age,
			List<CourseDto> courseList, List<CourseDto> studentsList) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.fullName = fullName;
		this.age = age;
		this.courseList = courseList;
		this.studentsList = studentsList;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<CourseDto> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseDto> courseList) {
		this.courseList = courseList;
	}

	public List<CourseDto> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<CourseDto> studentsList) {
		this.studentsList = studentsList;
	}

	@Override
	public String toString() {
		return "StudentsPresenterDto [id=" + id + ", name=" + name + ", surname=" + surname + ", fullName=" + fullName
				+ ", age=" + age + ", courseList=" + courseList + ", studentsList=" + studentsList + "]";
	}

}
