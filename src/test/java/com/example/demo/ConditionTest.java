package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import java.util.Random;
public class ConditionTest {
	
	@Test  
	public void ifTest() {
		int a = 5;
		if (a>6) {
			System.out.println("a大於6");
		} else {
			System.out.println("a小於6");
		}
	}
	
	@Test  
	public void ifTest1() {
		int a = 5;
		if (a>6) {
			System.out.println("a大於6");
		} else if (a>7) {
			System.out.println("a大於7");
		} else {
			System.out.println("a小於6");
		}
	}
	
	@Test  
	public void switchTest() {
		//小括號裡的資料型態 char bite short int string enum
		int a = 80;
		switch(a/10) {
		 case 9:
			 System.out.println("A");
			 break;
		 case 8:
			 System.out.println("B");
			 break;
		 case 7:
			 System.out.println("C");
			 break;
		 case 6:
			 System.out.println("D");
			 break;
		default:
			System.out.println("F");
			break;
		}
		
	}
	
	@Test  
	public void switchTest1() {
		//小括號裡的資料型態 char bite short int string enum
		int a = 80;
		
		double b = 95/10; //若被除數為int則print出來的也是int
		double c = 95.0/10;//被除數為浮點數.0或加D(95D)則會以double來除10
		System.out.println(b);
		System.out.println(c);
	}
	
	@Test 
	public void scannerTest() {
			Scanner  scan = new Scanner(System.in);
			System.out.println("請輸入文字");
			String a = scan.next();
			System.out.println("輸入的文字是"+a);
		}
	
	@Test 
	public void scannerTest1() {
		Scanner  scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		//以空格當多次輸入的間隔---------------------------
		String a = scan.next();
		String b = scan.next();
		System.out.println("輸入的文字是"+a + b);
	}
	
	@Test 
	public void scannerTest2() {
		Scanner  scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		//nextLine輸出整行-------------------------------
		String a = scan.nextLine();
		System.out.println("輸入的文字是"+a );
	}
	
	
	@Test 
	public void scannerTest3() {
		System.out.println("請輸入數字");
		Scanner  scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("輸入的數字是"+a );
	}
	
}

	

	

