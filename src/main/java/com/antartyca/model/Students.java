package com.antartyca.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Students")
public class Students extends Base{
	

	/*
	 * @Id
	 * 
	 * @GeneratedValue(generator = "UUID")
	 * 
	 * @GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator"
	 * )
	 */
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private int age;
	
	@Column
	private String password;
	
	
	
    @JoinTable(
    		name= "students_courses",
    		joinColumns = @JoinColumn(name= "FK_STUDENTS"),
    		inverseJoinColumns = @JoinColumn(name = "FK_COURSE")
            )
    @ManyToMany
	private List<Course>courseListS;


	//Getter & Setter
	
	
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



	public List<Course> getCourseList() {
		return courseListS;
	}


	public void setCourseList(List<Course> courseList) {
		this.courseListS = courseList;
	}


	
	

}
