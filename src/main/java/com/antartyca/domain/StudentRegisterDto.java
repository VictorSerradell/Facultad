package com.antartyca.domain;

import java.io.Serializable;

public class StudentRegisterDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String surname;
	private String pass;
	private int edad;
	public StudentRegisterDto(String nombre, String surname, String pass, int edad) {
		super();
		this.nombre = nombre;
		this.surname = surname;
		this.pass = pass;
		this.edad = edad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "StudentRegisterDto [nombre=" + nombre + ", surname=" + surname + ", pass=" + pass + ", edad=" + edad
				+ "]";
	}
	
}
