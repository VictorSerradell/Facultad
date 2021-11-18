package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;

public class CoursePresenter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	
	private String name;
	
	private Enum departament;
	
	private List<Course> courseList;
	
	private List<com.antartyca.model.Teacher> teacherList;	
	
	private List<Students> studentsList;
	
	private String coordinator;
	
	//Getter & Setter
	
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
	public Enum getDepartament() {
		return departament;
	}
	public void setDepartament(Enum departament) {
		this.departament = departament;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> list) {
		this.courseList = list;
	}
	public List<Students> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}
	public List<com.antartyca.model.Teacher> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<com.antartyca.model.Teacher> teacherListDomain) {
		this.teacherList = teacherListDomain;
	}

	public String getCoordinator() {
		return coordinator;
	}
	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
