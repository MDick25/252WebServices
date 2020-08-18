package com.Legends.WebServices.LegendsWebServices.model;


import javax.persistence.Column;

public class NamedEntity extends Entity {
	
	@Column(name = "name")
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	@Override
	public String toString() {
		return this.getName();
	}
	
	
	

}
