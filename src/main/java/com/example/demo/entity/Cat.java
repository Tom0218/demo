package com.example.demo.entity;

public class  Cat extends Animal {
	
	

	@Override
	public void eat() {
		System.out.println(super.getName() +"貓正在吃東西");
	}
	
	public void bit() {
		System.out.println(super.getName() +"正在咬");
	}
	

}
