package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {

	@Test
	public void switchTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績");
		int input = scan.nextInt();

		switch (input / 10) {
		case 10:
			System.out.println("您的級別是:A+");
			break;
		case 9:
			System.out.println("您的級別是:A");
			break;
		case 8:
			System.out.println("您的級別是:B");
			break;
		case 7:
			System.out.println("您的級別是:C");
			break;
		case 6:
			System.out.println("您的級別是:D");
			break;
		default:
			System.out.println("您的級別是:F");

		}
	}

	@Test
	public void switchweekDayTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入星期");
		String input = scan.next();
		int startDay = 0;
				switch (input) {
					case "日": case"7":
						startDay = 7;
						break;
					case "六": case"6": 
						startDay = 6;
						break;
					case "五": case"5":
						startDay = 5;
						break;
					case "四": case"4" :
						startDay = 4;
						break;
					case "三": case"3":
						startDay = 3;
						break;
					case "二": case"2":
						startDay = 2;
						break;
					case "一": case"1":
						startDay = 1;
						break;
				}
				System.out.println("請以數字型態輸入天數");
				int input2 = scan.nextInt();
				int afterDay = (startDay + input2) % 7;
				String answer = "";
				while(true) {
				
					switch (afterDay) {
					case 0: 
						answer = "日";
						break;
					case 1:
						answer = "一";
						break;
					case 2:
						answer = "二";
						break;
					case 3:
						answer = "三";
						break;
					case 4:
						answer = "四";
						break;
					case 5:
						answer = "五";
						break;
					case 6:
						answer = "六";
						break;
					}
					System.out.printf("今天是星期%s,%d天後是星期%s", input, input2, answer);			
				}
			} 
		
	@Test
	public void switchweekDayTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入星期");
		String input = scan.next();
		System.out.println("請輸入天數");
		int input2 = scan.nextInt();
		int startDay = 0;

		switch (input) {
			case "一":
				startDay = 1;
				break;
			case "二":
				startDay = 2;
				break;
			case "三":
				startDay = 3;
				break;
			case "四":
				startDay = 4;
				break;
			case "五":
				startDay = 5;
				break;
			case "六":
				startDay = 6;
				break;
			case "日":
				startDay = 7;
				break;
		}
		int days = (startDay + input2) % 7;
		switch (days) {
		case 1:
			System.out.printf("今天是星期%s,%d天後是星期一", input, input2);
			break;
		case 2:
			System.out.printf("今天是星期%s,%d天後是星期二", input, input2);
			break;
		case 3:
			System.out.printf("今天是星期%s,%d天後是星期三", input, input2);
			break;
		case 4:
			System.out.printf("今天是星期%s,%d天後是星期四", input, input2);
			break;
		case 5:
			System.out.printf("今天是星期%s,%d天後是星期五", input, input2);
			break;
		case 6:
			System.out.printf("今天是星期%s,%d天後是星期六", input, input2);
			break;
		default:
			System.out.printf("今天是星期%s,%d天後是星期日", input, input2);
			break;
		}
	}

	@Test
	public void switchweekDayTest5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是星期幾?");
		int inputint = scan.nextInt();
		String weekday = switchDay(inputint);/////////////////// 使用方法，並把參數匯入

		System.out.println("請輸入天數:");
		int days = scan.nextInt();
		String answer = switchDay((inputint + days) % 7);/////////////////// 使用方法，並把參數匯入
		System.out.printf("今天是星期%s,%d天後是星期%s", weekday, days, answer);
	}
	
	public String switchDay(int inputint) {
		String weekday = "";///// 初始化
		switch (inputint) {
		case 6:
			weekday = "六";
			break;
		case 5:
			weekday = "五";
			break;
		case 4:
			weekday = "四";
			break;
		case 3:
			weekday = "三";
			break;
		case 2:
			weekday = "二";
			break;
		case 1:
			weekday = "一";
			break;
		}
		return weekday;//// 回傳結果
	}

	@Test
	public void whileBreak() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println(""); // 在外部循环的末尾打印一个换行
		}
	}

	@Test
	public void guessNumber() {
		/////// 公式(區間上限-區間下限+1)+區間下限////////亂數方法1
//	double random = Math.random()*(99-1+1)+1;
		/////// 公式(區間上限-區間下限+1)+區間下限////////亂數方法1

		/////////////////////////////////////////// 亂數方法2
//	Random ran = new Random();//Random類癟裡的nextInt(整數i):會產生0~小於輸入整數i的直
//	int a = ran.nextInt(99)+1;/////////////第二步
		/////////////////////////////////////////// 亂數方法2
		Random ran = new Random();
		int a = ran.nextInt(99) + 1;
		System.out.printf("答案是%d", a);
//	System.out.println("請在1~100間猜數字?");
		int maxNum = 99;
		int minNum = 1;
		while (true) {
			System.out.printf("請猜%d~%d", minNum, maxNum);
			Scanner scan = new Scanner(System.in);
			int inputint = scan.nextInt();

			if (inputint < minNum || inputint > maxNum) {
				System.out.println("超出範圍");
				continue;
			}
			if (inputint == a) {
				System.out.printf("bingo答案是%d", a);
				break;
			}
			if (inputint < a) {
				minNum = inputint;
			} else {
				maxNum = inputint;
			}
		}

	}

	@Test
	public void salery() {

		int hourPay = 150;
		int hours = 0;

		if (hours > 50) {

		}
	}
	
	@Test
	public void test() {
		System.out.print("請輸入星期幾(int)");
		Scanner scan = new Scanner(System.in);
		int inputint = scan.nextInt();
		String weekDay = switchDay2(inputint);
		int inputint2 = scan.nextInt();
		String answer = switchDay2((inputint+inputint2)%7);
		System.out.printf("今天是星期%s，%d天後是%w",weekDay,inputint2,answer);	}
	
	public String switchDay2(int input ) {
		String startDay = ""; 
		switch(input) {
			case 1:
				startDay = "一";
				break;
			case 2:
				startDay = "二";
				break;
			case 3:
				startDay = "三";
				break;
			case 4:
				startDay = "四";
				break;
			case 5:
				startDay = "五";
				break;
			case 6:
				startDay = "六";
				break;
			default:
				startDay = "日";
				break;
		}
		return startDay;
		
	}

}
