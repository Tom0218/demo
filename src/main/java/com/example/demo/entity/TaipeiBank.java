package com.example.demo.entity;

public class TaipeiBank {
	
	private String branch;
	
	private String user;
	
	private int balance  ;

	
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		this.balance = balance;
		return balance;
	}
	
	public int saving (int amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("�s�ڥ��ѡA���������\n");	
		}
		return  balance;
	}
	
	public int withdraw (int amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.printf("���ڦ��\�A�`�l�B��%d\n",balance);
		} else {
			System.out.println("�l�B����");
		}
		return balance ;
	}
	
	////�i�ܰѼƳ]�p
	public String saving1(String a,int...inte) {  //����k���I���A�榡���}�C�ҥH��ƱƦC�覡���T�w�L�k�����B�H���ܼƦ�m�����T��...
		return"";
	};
	

}
