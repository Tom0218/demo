package com.example.demo.entity;

public class  Cat extends Animal {
	
	

	@Override
	public void eat() {
		System.out.println(super.getName() +"�ߥ��b�Y�F��");
	}
	
	public void bit() {
		System.out.println(super.getName() +"���b�r");
	}
	

}
