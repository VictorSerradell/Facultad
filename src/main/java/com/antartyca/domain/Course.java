package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Course extends Base implements Serializable {
	
	public Course() {
		super();
		
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String name;
	
	private Enum departament;
	
	private List<Teacher>teacherList;
	
	private List<Students>studentsList;
	
	private List<Course>courseList;
	
	private String coordinator;
	
	
	private CoursePresenter subjects_course;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum getDepartament() {
		return departament;
	}

	public Enum setDepartament(Enum departament) {
		return this.departament = departament;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public List<Students> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}


	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
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

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CoursePresenter getSubjects_course() {
		return subjects_course;
	}

	public void setSubjects_course(CoursePresenter subjects_course) {
		this.subjects_course = subjects_course;
	}

}
