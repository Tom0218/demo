package com.example.demo.entity;

import java.io.Serializable;

public class MealId implements Serializable{
	
	private String name ;
	
	private String cookingStyle;
	

	public MealId() {
		super();
	}
	
	public MealId(String name, String cookingStyle) {
		super();
		this.name = name;
		this.cookingStyle = cookingStyle;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getCookingStyle() {
		return cookingStyle;
	}


	public void setCookingStyle(String cookingStyle) {
		this.cookingStyle = cookingStyle;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private static final long serialVersionUID = 1L;

}
