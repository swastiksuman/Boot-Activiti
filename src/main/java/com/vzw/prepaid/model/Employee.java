package com.vzw.prepaid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String designation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	public Employee() {
		
	}
}