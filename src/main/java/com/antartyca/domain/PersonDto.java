package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;

public class PersonDto extends BaseDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//Builder
	public PersonDto() {
		super();
		
	}


	public String name;
	public String surname;
	public String dni;
	public Date dateOfBird;
	
	
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
	
	
}
