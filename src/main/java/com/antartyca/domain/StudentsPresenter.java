package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;



public class StudentsPresenter implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersion = 1L;
	
	private String id;
	
	private String name;
	
	private String surname;
	
	private String fullName;
	
	private int age;
	
	private List<Course> courseList;
	
	private List<Course> studentsList;
	
	
	//Getter & Setter
	
	public List<Course> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Course> courseListDomain) {
		this.studentsList = studentsList;
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
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList() {
		this.courseList = courseList;
	}
	public static long getSerialversion() {
		return serialVersion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
