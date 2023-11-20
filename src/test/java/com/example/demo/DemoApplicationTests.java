package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//與src/main專案無關把springboot註解調
//用來初步驗證src/main是否符合需求，這便用不到
//@SpringBootTest 
public class DemoApplicationTests {
	//@Test讓程式碼可以單獨去跑
	@Test  
	//一般來說權限無法跨專案除非特殊方法
	//權限+回傳資料型態+方法名稱
	//在test中資料型態一定是void
	//小括號的用意是讓你帶參數，大括號是邏輯區塊一個順序
	//java在整數預設資料型態為int
	//浮點數預設double
	//黃蚯蚓出現情況1.宣告了但沒使用
	public void fitstTest() {
		int a = 5;
		/////////long整數後面選告為long，+L
		long b = 1234567890434453464L;
		System.out.println(a);
		
		//宣告類別方法 new 類別本身()
		String str = new String("abc");
		String str1 = "ABC";
		System.out.println("str: "+str);
		System.out.println("str: "+str1);
		System.out.println(str + str1);
	}
	

}
