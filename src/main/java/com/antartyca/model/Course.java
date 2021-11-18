package com.antartyca.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import com.antartyca.model.Students;
import com.antartyca.model.Teacher;


@Entity
@Table(name = "course")
public class Course extends Base{

	@Id
	/*
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
	private Enum departament;
	
	@ManyToMany(mappedBy = "courseList")
	private List<Teacher> listTeacher;
	
	@ManyToMany(mappedBy ="courseListS" )
	private List<Students> listStudents;
	
	
	@ManyToOne
	@JoinColumn
	private Teacher coordinador;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="teacher_id", nullable = true)
    private Teacher coordinator;
	

	//Getter & Setter

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

	public List<Teacher> getListTeacher() {
		return listTeacher;
	}

	public void setListTeacher(List<Teacher> list) {
		this.listTeacher = list;
	}

	public List<Students> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<Students> list) {
		this.listStudents = list;
	}

	public Teacher getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Teacher coordinador) {
		this.coordinador = coordinador;
	}

	

	
	
	
	
	
	
}
