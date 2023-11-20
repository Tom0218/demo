package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aaa")
public class Aaa {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "city")
	private String city;

	public Aaa() {
		super();
	}

	public Aaa(String id, String city) {
		super();
		this.id = id;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getId() {
		return id;
	}
	
	

}
