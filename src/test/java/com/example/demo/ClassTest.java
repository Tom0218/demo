package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

public class ClassTest {
	
	@Test
	public void classText() {
		
		Dog doggy = new Dog();
		doggy.setName("tom");
		System.out.println(doggy.getName());
		
		 doggy.setName("alley");
		System.out.println(doggy.getName());
		
		
		System.out.println("====================");
	}
	
	@Test
	public void classTest1() {
		Dog dog = new Dog();
		dog.setAttributes( "gee","red",2);
	}
	
	@Test
	public void classTest2() {
		
		TaipeiBank bank = new TaipeiBank();
		//System.out.println(bank.getBalance());
		//斷言(判斷)測試
		Assert.isTrue(bank.getBalance()==1000,"saving error!!");
		
		bank.saving(-500);
		Assert.isTrue(bank.getBalance()==1000,"saving error!!");
		//System.out.println(bank.getBalance());
		
		bank.saving(500);
		Assert.isTrue(bank.getBalance()==1500,"saving error!!");
		//System.out.println(bank.getBalance());
	}
	
	@Test
	public void classTest3() {
		//withdraw
		TaipeiBank bank = new TaipeiBank();
		boolean ATM = true;
		while(ATM) {
			System.out.println("提款請按(1)  存款請按(2) 結束請按(3)");
			Scanner scan = new Scanner(System.in);
			
			int userInput = scan.nextInt();
			switch(userInput) {
				case 3:
					ATM = false;
					break;
				case 2:
					System.out.println("請輸入存款金額");
					int save = scan.nextInt(); 
					int b = bank.saving(save);
					System.out.println(b);
					System.out.printf("總存款為%d\n",bank.getBalance());
					break;
				case 1:
					System.out.println("請輸入提款金額");
					int withdraw = scan.nextInt(); 
					int a = bank.withdraw(withdraw);
					System.out.println(a);
					System.out.printf("總存款為%d\n",bank.getBalance());
					break;
				
			}				
		}
	}
	
	@Test
	public void classTest4() {
		//每個new都會產生一個記憶體位置;
		Dog dog = new Dog();
		Dog doggy = new Dog();
		System.out.println(dog);
		System.out.println(doggy);
		System.out.println(doggy);
	
	}
	
	@Test
	public void classTest5() {
													/////每new一個類別都會產生一個記憶體位置
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		System.out.println("============");
		
		Integer a1 = 10;
		Integer b1 = 10;
		System.out.println(a1 == b1);
		System.out.println("============");
		Integer a2 = new Integer(20);
		Integer b2 = new Integer(20);
		System.out.println("a2 == b2 = "+(a2==b2));			/////每new一個類別都會產生一個記憶體位置
		System.out.println("============");					/// == 用在八個資料型態以及記憶體位置做比較
		
		boolean boo1 = false;
		boolean boo2 = false;
		System.out.println(boo1 == boo2);
		
	}
	
	@Test
	public void classTest6() {
		Dog dog = new Dog();
		dog.setName("Lily");
		dog.setColor("blue");
		dog.setAge(2);
		///建構方法,減少呼叫set
		Dog dogg = new Dog("QQQ","GGG",3);
		System.out.println(dogg);
		
	}
	
	@Test
	public void classTest7() {
		Dog dog = new Dog();
		dog.setAttributes(null, null, 0);;
		Dog.setAttributes2(); //在Dog類別的setAttributes2加上Static，可以使用類別名稱或方法直接存取
		
		System.out.println("============");
		
	}
	
	
	
}
