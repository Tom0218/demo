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
		System.out.println("The str2 of lenght is " + str2.length());///空白也有長度
		System.out.println("=============");
		System.out.println("str1 is empty :" + str1.isEmpty());
		System.out.println("str2 is empty :" + str2.isEmpty());
		System.out.println("=============");
		//isBlank	1.長度為0;	2.字串內容由全空白組成	滿足條件1或2回傳true
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
		System.out.println("color是空字串:"+color == null);
		System.out.println("=============");
		//若先判斷isBlank則會報錯，引為只要color是null就會報錯
		if(color == null || color.isBlank()) {
			System.out.println("color是空字串:");
		} else {
			System.out.println("color不是空字串:");
		}
		/////此方法較好用
		if(StringUtils.hasText(null)) {
			System.out.println("color是空字串:");
		} else {
			System.out.println("color不是空字串:");
		}
	}
	
	@Test
	public void stringTest3() {
		int count = 0;
		int index = 0;
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼清新脫俗";
		System.out.println(str.indexOf("小龍女",0));
		////;;無窮迴圈
		for(;;) {
			if( str.indexOf("小龍女",index)>=0) {
				count++;
				index = str.indexOf("小龍女",index)+3;/////小龍女3個字
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
		String keyWord = "小龍女";
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼清新脫俗";
		while(str.indexOf(keyWord,index) != -1) {
			if(str.indexOf(keyWord,index)>0) {
				count+=1;
				index = str.indexOf("小龍女",index) + keyWord.length();
			} 
		}
		System.out.println(count);
	}
	
	@Test
	public void stringTest5() {
		int count = 0;
		int index = 0;
		String str = "神鵰俠侶3是楊過與小龍女的故事愛，我不喜歡小龍女的3甲仙愛，雖然小龍女在3楊過眼清3新脫俗3";
		Scanner scan = new Scanner(System.in);
		System.out.println("搜尋字串");
		String userinput = scan.next();
		while(str.indexOf(userinput,index)!= -1){
			if(str.indexOf(userinput,index)>=0) {
				count++;
				index = str.indexOf(userinput,index)+userinput.length();
			} 
		}
		System.out.println(userinput+"出現的次數為"+count);
	
	}
	
	@Test
	public void replaceTest() {
		String str = "神鵰俠侶3是楊過與小龍女的故事愛，我不喜歡小龍女的3甲仙愛，雖然小龍女在3楊過眼清3新脫俗3";
		str = str.replace("小龍女","小籠包" );
		System.out.println(str);
		System.out.println("=============");
		str.replaceAll("小籠包", "小籠湯包");
	}
	
	@Test
	public void splitTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事愛，我不喜歡小龍女的甲仙愛，雖然小龍女在楊過眼清新脫俗";
		String[] array = str.split("小龍女");
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
		System.out.println("trim前 "+str.equals(str1));
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println("trim後 "+str.equals(str1));
	}
	
	@Test
	public void substringTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事";
		String subStr = str.substring(5);
		String subStr1 = str.substring(5,8);
		System.out.println(subStr);
		System.out.println(subStr1);
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");//附加
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
		System.out.println(sb.toString().equals(sb1.toString()));//轉字串做比較
	}
	
	@Test
	public void stringBufferTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String userInput = scan.next();
		
		while( userInput.length() <= 2) {
			System.out.println("字數至少3個，plz try again");
			System.out.println("請輸入文字");
			userInput = scan.next();
			continue;
		}
			StringBuffer sb = new StringBuffer(userInput);
			System.out.println(sb.reverse());
			if(userInput.equals(sb.reverse().toString())) { ////要做比較要轉回字串
				System.out.println("是迴文");
			} else {
				System.out.println("不是回文");
			}
	
	}
	
	@Test 
	public void listTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字");
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
		System.out.println("請輸入電話號碼ex:02-0000000或(02)0000");
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			String pattern = "(\\d{2}-||\\(\\d\\)\\d{7,8})";
			while(true) {
				if(input.matches(pattern)) {
					System.out.println("符合格式");
					break;
				}
				System.out.print("格式錯誤");
			}
	}
		
		
}	
