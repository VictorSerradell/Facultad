package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Students extends Person implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//Builder
	public Students() {
		super();
		
	}
	
	private String password;
	
	private int age;
	
	
	private List<Course> courseList;
	
	float globalAverageMedia;
	
	private StudentsPresenter subjects_students;
	
	
	//Getter & Setter

	public List<Course> getListCourse() {
		return courseList = courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public float getGlobalAverageMedia() {
		return globalAverageMedia;
	}

	public void setGlobalAverageMedia(float globalAverageMedia) {
		this.globalAverageMedia = globalAverageMedia;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getDateOfBird() {
		return dateOfBird;
	}
	public void setDateOfBird(Date dateOfBird) {
		this.dateOfBird = dateOfBird;
	}
	


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public StudentsPresenter getSubjects_students() {
		return subjects_students;
	}

	public void setSubjects_students(StudentsPresenter subjects_students) {
		this.subjects_students = subjects_students;
	}

	
	

}
