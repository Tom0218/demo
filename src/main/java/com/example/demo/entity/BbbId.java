package com.example.demo.entity;

import java.io.Serializable;

public class BbbId implements Serializable {
	
	
	private String id;
	
	private String aId;

	public BbbId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbbId(String id, String aId) {
		super();
		this.id = id;
		this.aId = aId;
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

	private static final long serialVersionUID = 1L;
}
