package com.antartyca.domain;

import java.io.Serializable;
import java.util.List;

public class StudentsDto extends PersonDto implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String password;
	
	private int age;
	
	private List<CourseDto> courseList;
	
	float globalAverageMedia;
	
	private StudentsPresenterDto subjects_students;

	public StudentsDto() {
		super();
	}

	public StudentsDto(String password, int age, List<CourseDto> courseList, float globalAverageMedia,
			StudentsPresenterDto subjects_students) {
		super();
		this.password = password;
		this.age = age;
		this.courseList = courseList;
		this.globalAverageMedia = globalAverageMedia;
		this.subjects_students = subjects_students;
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

	public List<CourseDto> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseDto> courseList) {
		this.courseList = courseList;
	}

	public float getGlobalAverageMedia() {
		return globalAverageMedia;
	}

	public void setGlobalAverageMedia(float globalAverageMedia) {
		this.globalAverageMedia = globalAverageMedia;
	}

	public StudentsPresenterDto getSubjects_students() {
		return subjects_students;
	}

	public void setSubjects_students(StudentsPresenterDto subjects_students) {
		this.subjects_students = subjects_students;
	}

	@Override
	public String toString() {
		return "StudentsDto [password=" + password + ", age=" + age + ", courseList=" + courseList
				+ ", globalAverageMedia=" + globalAverageMedia + ", subjects_students=" + subjects_students + "]";
	}
	
}
