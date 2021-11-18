package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Teacher extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Teacher() {
		super();
		
	}
	
	
	private List<Course>ListCourse;
	
	private List<Course>ListCourseDepartmentHead;
	
	static boolean departmentHead;
	
	private TeacherPresenter subjects_teacher;

	public List<Course> getListCourse() {
		return ListCourse;
	}
	
	
	public void setListCourse(List<Course> listCourse) {
		ListCourse = listCourse;
	}

	public List<Course> getListCourseDepartmentHead() {
		return ListCourseDepartmentHead;
	}

	public List<Course> setListCourseDepartmentHead(List<Course> listCourseDepartmentHead) {
		return ListCourseDepartmentHead = listCourseDepartmentHead;
	}

	public static boolean isDepartmentHead() {
		try {
			return departmentHead;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void setDepartmentHead(boolean departmentHead) {
		this.departmentHead = departmentHead;
	}


	public TeacherPresenter getSubjects_teacher() {
		return subjects_teacher;
	}


	public void setSubjects_teacher(TeacherPresenter subjects_teacher) {
		this.subjects_teacher = subjects_teacher;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
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


	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
