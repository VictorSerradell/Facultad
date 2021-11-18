package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;

public class TeacherRegisterDto implements Serializable {

	private static final long serialVersionUID = 7344966261985972510L;
	
	private String nombre;
	private String surname;
	private String pass;
	private Date date_of_bird;
	private boolean active;
	public TeacherRegisterDto() {
		super();
	}
	public TeacherRegisterDto(String nombre, String surname, String pass, Date date_of_bird, boolean active) {
		super();
		this.nombre = nombre;
		this.surname = surname;
		this.pass = pass;
		this.date_of_bird = date_of_bird;
		this.active = active;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getDate_of_bird() {
		return date_of_bird;
	}
	public void setDate_of_bird(Date date_of_bird) {
		this.date_of_bird = date_of_bird;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "TeacherRegisterDto [nombre=" + nombre + ", surname=" + surname + ", pass=" + pass + ", date_of_bird="
				+ date_of_bird + ", active=" + active + "]";
	}
	
}
