package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public  class  Dog implements RunService {

///�u���bclass���U��"�ݩ�"�~�i�H�[private
	/// �Y�� private�h�L�k�����ϥ�
	
	////�Y�n���w�]�Ȫ����["="�Y�iprivate String name = "tom";
	private   String name = "apple";

	private   String color;

	private   int age;
	
////�w�]�غc��k
	public  Dog(){    
		super();////�Ω��~��
	}
	
	////�۩w�q�غc��k
	public  Dog(String name,String color,int age) { 
		super();////�Ω��~��
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public Dog(String name,String color) { 
		super();////�Ω��~��
		this.name = name;
		this.color = color;
	}
	
	
////////////////////////////////////////////////�ݩʬ����ä�k�����}source(Generate getter and setter
	/////����ƫ��A�nreturn
	public String getName() {
		return name;
	}


	public String setName(String name) {
		return this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAttributes(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	} 

	public  static void setAttributes2() {
		System.out.println("=========");
	}

	@Override
	public void run() {
		System.out.println("�p���b�]");
		
	}

}
