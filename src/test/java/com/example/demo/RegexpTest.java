package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {
	@Test
	public void regexpTest(){
	}
	
	@Test
	public void regexpTest1(){
		String str = "0912-345-678";
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		String pattern2 = "\\d{4}-\\d{3}-\\d{3}";
		String pattern3 = "\\d{4} (-\\d{3}){2}";
		System.out.println(str.matches(pattern));////str�O�_�ŦXpattern�榡
		System.out.println(str.matches(pattern2));

	
	}
	
	@Test
	public void regexpTest2(){
		String pattern = "\\(\\d{2}\\)d{8}"; //(2�X)8�X,�]�t�p�A��
		System.out.println(pattern);
	}
	
	
	
	@Test
	public void regexpTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�q��");
		String phone = scan.next();
//		String pattern = "\\d{2}\\-\\d{7}";
//		String pattern1 = "\\d{2}\\-\\d{8}";
//		String pattern2 = "\\(\\d{2}\\)\\d{7}";
//		String pattern3 = "\\(\\d{2}\\)\\d{8}";
//		String mixpattern = "\\(d{2}\\)(\\d{7}||\\d{8})";
//		String mixpattern1 = "\\(\\d{2}\\)\\d{7,8}";
		String mixpattern2 = "(\\(\\d{2}\\)||\\d{2}-)\\d{7,8}";
		
		while(true) {
			if(phone.matches(mixpattern2)) {
				System.out.println("�ŦX�榡");
				break;
			} else {
				System.out.println("�榡����! �ЦA��J�@���q�ܸ��X");
				phone = scan.next();
			}
		}
	}
	
	@Test
	public void regexpTest4() {
		String str = "a";
		String str1 = "Ab";
		String pattern = "\\w";
	}
	
	@Test
	public void traing() {
		System.out.println("��J������");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String pattern1= "[A-Za-z&&[^ABDEFHabdefh\\d]]\\d{9}";
		String pattern2 = "[A-Za-z&&[^ABDEFHabdefh\\d]][1-2]\\d{8}";
		System.out.println(input.matches(pattern2));
	}
	
	@Test
	public void traing2() {
		System.out.println("�п�J������");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String pattaren = "[A-Za-z&&[^abdefhABDEFH\\d]][1-2]\\d{8}";
		while(true ) {
			if (input.matches(pattaren)) {
				System.out.println("�榡���T");
				break;
			}
			System.out.println("�榡���~");
			input = scan.next();
		}
	
	}
	
}
