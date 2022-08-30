package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="feedbck")
public class Feedback {
	@Override
	public String toString() {
		return "Feedback [id=" + id + ",  name=" + name + ", email=" + email + ", feedback=" + feedback + "]";
	}

	@Id @GeneratedValue
	private int id;
	private String name;
	private String email;
	private String feedback;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(String name, String email, String feedback) {
		super();
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}

	
	
}
