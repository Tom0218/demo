package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	@Test
	public void arrayTest() {
		int[] a = new int[10];
		System.out.println(a);
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 5;
		System.out.println(a[1]);
		System.out.println("=======================");
		int [] degee = {25,20,10,68,10};
		
		for(int item: degee) {
			System.out.println(item);
		}
		
	}
	
	@Test
	public void listTest() {
//		String str = new String("ABC");
	///List<資料型態>變數名稱 = new ArrayList<可省略資料型態>();
		List<String>strList = new ArrayList<>();
		strList.add("A");
		strList.add("A");
		strList.add("D");
		strList.add("B");
		//有序的
		System.out.println(strList);
		System.out.println("===============");
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===============");
		////////長度無法更改
		List<String>strList1 = List.of("A","S","D","F","G");
		List<String>strList2 = Arrays.asList("A1","S1","D1","F1","G1");
		///執行下一行城市會報錯，因為List.of用法產生的List長度為固定無法增刪。
//		strList1.add("G1");
		///執行下一行城市會報錯，因為 Arrays.asList用法產生的List長度為固定無法增刪。
//		strList2.add("G2");
		System.out.println("===============");
		//因為容納的空間變為動態的，所以縱使List.of儲存的空間是固定的
		List<String>strList3 = new ArrayList<>(List.of("A","S","D","F","G"));
		List<String>strList4 = new ArrayList<>(Arrays.asList("A","S","D","F","G"));
	}
	
	@Test
	public void foreachTest() {
		List<String>strList = new ArrayList<>(List.of("A","S","D","F","G"));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===============");
		//for(資料型態 自訂變數 : 對象變數)
		for(String item : strList) {
			System.out.println(item);
		}
		System.out.println("===============");
		strList.forEach(item ->{///讓打
			System.out.println(item);
		});
	}
	
	@Test
	public void foreachTest2() {
		//找出小於20的質數，將其加到一個list，會後由大到小列印出
		System.out.println("請輸入數字");
		Scanner  scan = new Scanner(System.in);
		int userinput = scan.nextInt();
		List<Integer>intList3 = new ArrayList<>();
		for(int i = 2; i < 21; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= Math.sqrt(i+1); j++) {
				if(i%j ==0 && i!=j) {
					isPrime = false;
					break;
				} 
			}
			if(isPrime){
				intList3.add(i);
			}
		}
		System.out.println(intList3);
	}
	
	@Test
	public void listTest1() {
		int[] a = new int[3];
		Integer[] b = new Integer[3];
		String[] c = new String[3];
		List<Integer>intList = new ArrayList<>();
		List<String>strList = new ArrayList<>();
	}

	@Test
	public void listTest2() {
		int[] a = new int[3];
		Integer[] b = new Integer[3];
		String[] c = new String[3];
		List<Integer>intList = new ArrayList<>();
		List<String>strList = new ArrayList<>();
	}


}
	
	
	

