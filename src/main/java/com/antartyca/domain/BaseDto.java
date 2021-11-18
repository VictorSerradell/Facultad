package com.antartyca.domain;

import java.io.Serializable;
import java.util.Date;

public class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Long id;
	public Date creation;
	public Date update;
	public boolean active;
	
	
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
	
	
}
