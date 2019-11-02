package com.springboot.database.springjdbcjpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="findAll", query="select p from Person p")
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	private String name;
	private String Location;
	private Date birthDate;
	
	public Person() {
		
	}
	
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		Location = location;
		this.birthDate = birthDate;
	}
	
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
		this.birthDate = birthDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", Location=" + Location + ", birthDate=" + birthDate + "]";
	}

}
