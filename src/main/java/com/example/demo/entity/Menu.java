package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//�U��:�b�����إ߮ɷ|���K�إ����O
//entity�u�O�@�ӴC���Ω�s����
//@TABLE���ηN�b��N���OMenu���w��name��menu���o��TABLE
//�Nentity��SpringBoot�U�ޡA���Ʈw���@����

@Entity  
@Table(name = "menu")	
public class Menu {
	
	@Id		//���wPrimaryKey
	@Column(name = "name")	//���w�����W�٬�name�����
	private String name;
	
	@Column(name = "price")
	private int price;
	
	//�w�]�غc��k�B�a���ݩʪ��غc��k�B�U�۪�get,set
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
