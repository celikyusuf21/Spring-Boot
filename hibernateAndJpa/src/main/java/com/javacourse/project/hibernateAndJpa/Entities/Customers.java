package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;

@Entity  // Entity is database object
@Table(name="customers")  // Database Annotation 
public class Customers {
	
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Id Column is Aoutomatic 
	private int id;
	
	@Column(name="company")
	private String company;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="first_name")
	private String first_name;
	
	
	public Customers(int id, String company, String last_name, String first_name) {
		super();
		this.id = id;
		this.company = company;
		this.last_name = last_name;
		this.first_name = first_name;
	}
	
	public Customers() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	
}
