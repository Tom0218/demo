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
			System.out.println("存款失敗，須為正整數\n");	
		}
		return  balance;
	}
	
	public int withdraw (int amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.printf("提款成功，總餘額為%d\n",balance);
		} else {
			System.out.println("餘額不足");
		}
		return balance ;
	}
	
	////可變參數設計
	public String saving1(String a,int...inte) {  //此方法缺點為，格式為陣列所以資料排列方式為固定無法替換、以及變數位置不明確為...
		return"";
	};
	

}
