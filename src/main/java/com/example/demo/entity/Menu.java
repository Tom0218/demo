package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//託管:在城市建立時會順便建立類別
//entity只是一個媒介用於存放資料
//@TABLE的用意在於將類別Menu指定到name為menu的這個TABLE
//將entity給SpringBoot託管，對資料庫欄位作對應

@Entity  
@Table(name = "menu")	
public class Menu {
	
	@Id		//指定PrimaryKey
	@Column(name = "name")	//指定到欄位名稱為name的欄位
	private String name;
	
	@Column(name = "price")
	private int price;
	
	//預設建構方法、帶有屬性的建構方法、各自的get,set
	public Menu() {
		super();
	}

	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
