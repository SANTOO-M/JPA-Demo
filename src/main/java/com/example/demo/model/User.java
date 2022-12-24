package com.example.demo.model;

import jakarta.persistence.*; 
@Entity
@Table(name = "USERS")
public class User {
	@Id
	private int id;
	private String name;
	
	public String toString() {
		return name+" : "+ id;
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

}
