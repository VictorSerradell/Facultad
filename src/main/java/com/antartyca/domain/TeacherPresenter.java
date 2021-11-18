package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TeacherPresenter  implements Serializable  {
	

	/**
	 * 
	 */
	
	private static final long serialVersion = 1L;
	
	
	private String name;
	
	private String surname;
	
	private Long id;
	
	private Date dateOfBird;
	
	boolean departmentHead;
	
	private List<Course>courseList ;
	
	private List<Course>coordinator;

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

	public void setId(Long long1) {
		this.id = long1;
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

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList() {
		this.courseList = courseList;
	}

	public List<Course> getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(List<Course> coordinator) {
		this.coordinator = coordinator;
	}

	public static long getSerialversion() {
		return serialVersion;
	}

	
	
	
	
	
	
}
