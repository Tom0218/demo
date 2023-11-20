package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(value = BbbId.class)
@Table(name = "bbb")
public class Bbb {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Id
	@Column(name = "a_id")
	private String aId;
	
	@Column(name = "city")
	private String city;

	public Bbb() {
		super();
	}

	public Bbb(String id, String aId, String city) {
		super();
		this.id = id;
		this.aId = aId;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
