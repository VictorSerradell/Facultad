package com.antartyca.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "teacher")
public class Teacher extends Base{

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
	private Date dateOfBird;
	
	@Column
	private String password;
	
	
	@ManyToMany
    @JoinTable(
    		name= "teacher_subjects",
    		joinColumns = @JoinColumn(name= "teacher_id"),
    		inverseJoinColumns = @JoinColumn(name = "course_id")
            )
	private Set<Course> courseList;
	
	@ManyToMany
	@JoinColumn(name = "subjects_teacher")
	private List<Students> studentsList;
	
	//@OneToMany(mappedBy = "coordinator",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private Set<Subject> coordinatorList;

	private boolean active;
   
	
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


	public Date getDateOfBird() {
		return dateOfBird;
	}

	public void setDateOfBird(Date dateOfBird) {
		this.dateOfBird = dateOfBird;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(Set<Course> list) {
		this.courseList = list;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Students> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}

	/*
	 * public Set<Subject> getCoordinatorList() { return coordinatorList; }
	 * 
	 * public void setCoordinatorList(Set<Subject> coordinatorList) {
	 * this.coordinatorList = coordinatorList; }
	 */
	
	
	
}
