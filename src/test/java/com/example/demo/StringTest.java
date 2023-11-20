package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {
	
	private static final Object strArray = null;

	@Test
	public void stringTest() {
		String str = "ABC";
		String str1 = new String("ABC");
		String str2 = "ABC";
		System.out.println(str==str1);
		System.out.println(str == str2);
		System.out.println("=============");
		System.out.println(str.equals(str1));
	
	}
	
	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		System.out.println("The str of lenght is " + str.length());
		System.out.println("The str1 of lenght is " + str1.length());
		System.out.println("The str2 of lenght is " + str2.length());///�ťդ]������
		System.out.println("=============");
		System.out.println("str1 is empty :" + str1.isEmpty());
		System.out.println("str2 is empty :" + str2.isEmpty());
		System.out.println("=============");
		//isBlank	1.���׬�0;	2.�r�ꤺ�e�ѥ��ťղզ�	��������1��2�^��true
		System.out.println("str1 isBlank :" + str1.isBlank());
		System.out.println("str2 isBlank :" + str2.isBlank());
	}	
	
	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String name = dog.getName();
		String color = dog.getColor();
		System.out.println(name);
		System.out.println(color);
		System.out.println("=============");
		System.out.println(name.length());
		System.out.println(color.length());
		System.out.println("color�O�Ŧr��:"+color == null);
		System.out.println("=============");
		//�Y���P�_isBlank�h�|�����A�ެ��u�ncolor�Onull�N�|����
		if(color == null || color.isBlank()) {
			System.out.println("color�O�Ŧr��:");
		} else {
			System.out.println("color���O�Ŧr��:");
		}
		/////����k���n��
		if(StringUtils.hasText(null)) {
			System.out.println("color�O�Ŧr��:");
		} else {
			System.out.println("color���O�Ŧr��:");
		}
	}
	
	@Test
	public void stringTest3() {
		int count = 0;
		int index = 0;
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L���M�s��U";
		System.out.println(str.indexOf("�p�s�k",0));
		////;;�L�a�j��
		for(;;) {
			if( str.indexOf("�p�s�k",index)>=0) {
				count++;
				index = str.indexOf("�p�s�k",index)+3;/////�p�s�k3�Ӧr
			} else {
				break;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void stringTest4() {
		int count = 0;
		int index = 0; 
		String keyWord = "�p�s�k";
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L���M�s��U";
		while(str.indexOf(keyWord,index) != -1) {
			if(str.indexOf(keyWord,index)>0) {
				count+=1;
				index = str.indexOf("�p�s�k",index) + keyWord.length();
			} 
		}
		System.out.println(count);
	}
	
	@Test
	public void stringTest5() {
		int count = 0;
		int index = 0;
		String str = "����L�Q3�O���L�P�p�s�k���G�ƷR�A�ڤ����w�p�s�k��3�ҥP�R�A���M�p�s�k�b3���L���M3�s��U3";
		Scanner scan = new Scanner(System.in);
		System.out.println("�j�M�r��");
		String userinput = scan.next();
		while(str.indexOf(userinput,index)!= -1){
			if(str.indexOf(userinput,index)>=0) {
				count++;
				index = str.indexOf(userinput,index)+userinput.length();
			} 
		}
		System.out.println(userinput+"�X�{�����Ƭ�"+count);
	
	}
	
	@Test
	public void replaceTest() {
		String str = "����L�Q3�O���L�P�p�s�k���G�ƷR�A�ڤ����w�p�s�k��3�ҥP�R�A���M�p�s�k�b3���L���M3�s��U3";
		str = str.replace("�p�s�k","�pŢ�]" );
		System.out.println(str);
		System.out.println("=============");
		str.replaceAll("�pŢ�]", "�pŢ���]");
	}
	
	@Test
	public void splitTest() {
		String str = "����L�Q�O���L�P�p�s�k���G�ƷR�A�ڤ����w�p�s�k���ҥP�R�A���M�p�s�k�b���L���M�s��U";
		String[] array = str.split("�p�s�k");
		for(String item : array) {
			System.out.println(item);
		}
		System.out.println("==========");
		String str1 = "ABCD";
		String array1[] = str1.split("");
		System.out.println(array1);
		for(String item : array1) {
			System.out.println(item);
		};
		
	}
	
	@Test
	public void trimTest() {
		String str = "ABC DEF";
		String str1 = " ABC DEF ";
		System.out.println("trim�e "+str.equals(str1));
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println("trim�� "+str.equals(str1));
	}
	
	@Test
	public void substringTest() {
		String str = "����L�Q�O���L�P�p�s�k���G��";
		String subStr = str.substring(5);
		String subStr1 = str.substring(5,8);
		System.out.println(subStr);
		System.out.println(subStr1);
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");//���[
		sb.append("GGG");
		sb.append("DEF").append("FGI");
		System.out.println(sb);
	}
	
	@Test
	public void stringBufferTest1() {
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb == sb1);
		System.out.println("==========");
		System.out.println(sb.toString().equals(sb1.toString()));//��r�갵���
	}
	
	@Test
	public void stringBufferTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��r");
		String userInput = scan.next();
		
		while( userInput.length() <= 2) {
			System.out.println("�r�Ʀܤ�3�ӡAplz try again");
			System.out.println("�п�J��r");
			userInput = scan.next();
			continue;
		}
			StringBuffer sb = new StringBuffer(userInput);
			System.out.println(sb.reverse());
			if(userInput.equals(sb.reverse().toString())) { ////�n������n��^�r��
				System.out.println("�O�j��");
			} else {
				System.out.println("���O�^��");
			}
	
	}
	
	@Test 
	public void listTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�Ʀr");
		int inputInt = scan.nextInt();
		inputInt++;
		String str = String.valueOf(inputInt);
		String[] strArray = str.split("");
//		List<Integer> intList = new ArrayList<>(Arrays.asList(strArray));
		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
//		
	}
	
	@Test 
	public void test() {
		System.out.println("�п�J�q�ܸ��Xex:02-0000000��(02)0000");
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			String pattern = "(\\d{2}-||\\(\\d\\)\\d{7,8})";
			while(true) {
				if(input.matches(pattern)) {
					System.out.println("�ŦX�榡");
					break;
				}
				System.out.print("�榡���~");
			}
	}
		
		
}	
