package com.example.demo.entity;

public class Animal {
	
	
	public Animal() {
		super();
//		System.out.println("Animal �غc��k");
	}

	private String name = "�ʪ�";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name+"���b�Y");
	}
	
	public void sleep() {
		System.out.println(this.name+"���b��");
	}
	
}
