package com.example.demo.entity;

public class Bird  extends Animal {
	
	
//	private TaipeiBank bank;
//	private String Branch;
//	private String user;
	
	

	//複寫 or 重新定義
	@Override
	public void eat() {
		System.out.println(super.getName()+"鳥正在吃東西");
	}
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleep() {
		System.out.println(super.getName()+"正在睡中午");
	}
	
	public void flying() {
		System.out.println(super.getName()+"飛走了");
	}
	
	
	

}
