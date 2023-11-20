package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public  class  Dog implements RunService {

///只有在class底下的"屬性"才可以加private
	/// 若為 private則無法直接使用
	
	////若要給預設值直接加"="即可private String name = "tom";
	private   String name = "apple";

	private   String color;

	private   int age;
	
////預設建構方法
	public  Dog(){    
		super();////用於繼承
	}
	
	////自定義建構方法
	public  Dog(String name,String color,int age) { 
		super();////用於繼承
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public Dog(String name,String color) { 
		super();////用於繼承
		this.name = name;
		this.color = color;
	}
	
	
////////////////////////////////////////////////屬性為隱藏方法為公開source(Generate getter and setter
	/////有資料型態要return
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
		System.out.println("小狗在跑");
		
	}

}
