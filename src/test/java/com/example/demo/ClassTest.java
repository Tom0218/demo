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
		//�_��(�P�_)����
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
			System.out.println("���ڽЫ�(1)  �s�ڽЫ�(2) �����Ы�(3)");
			Scanner scan = new Scanner(System.in);
			
			int userInput = scan.nextInt();
			switch(userInput) {
				case 3:
					ATM = false;
					break;
				case 2:
					System.out.println("�п�J�s�ڪ��B");
					int save = scan.nextInt(); 
					int b = bank.saving(save);
					System.out.println(b);
					System.out.printf("�`�s�ڬ�%d\n",bank.getBalance());
					break;
				case 1:
					System.out.println("�п�J���ڪ��B");
					int withdraw = scan.nextInt(); 
					int a = bank.withdraw(withdraw);
					System.out.println(a);
					System.out.printf("�`�s�ڬ�%d\n",bank.getBalance());
					break;
				
			}				
		}
	}
	
	@Test
	public void classTest4() {
		//�C��new���|���ͤ@�ӰO�����m;
		Dog dog = new Dog();
		Dog doggy = new Dog();
		System.out.println(dog);
		System.out.println(doggy);
		System.out.println(doggy);
	
	}
	
	@Test
	public void classTest5() {
													/////�Cnew�@�����O���|���ͤ@�ӰO�����m
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
		System.out.println("a2 == b2 = "+(a2==b2));			/////�Cnew�@�����O���|���ͤ@�ӰO�����m
		System.out.println("============");					/// == �Φb�K�Ӹ�ƫ��A�H�ΰO�����m�����
		
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
		///�غc��k,��֩I�sset
		Dog dogg = new Dog("QQQ","GGG",3);
		System.out.println(dogg);
		
	}
	
	@Test
	public void classTest7() {
		Dog dog = new Dog();
		dog.setAttributes(null, null, 0);;
		Dog.setAttributes2(); //�bDog���O��setAttributes2�[�WStatic�A�i�H�ϥ����O�W�٩Τ�k�����s��
		
		System.out.println("============");
		
	}
	
	
	
}
