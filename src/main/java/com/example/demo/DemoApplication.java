package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//後面exclude = {SecurityAutoConfiguration.class}排除spring security的登入
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		int x = 5;
//		int y = 6;
//		System.out.println(x);
//		System.out.print(x);
//		System.out.println("");
//		System.out.printf("x = %d"+"\n"+"y = %d",x,y);
//		char a = 'a';
//		char aa = 97;
//		System.out.print("\n"+"a ="+a+"\t aa=" + aa + "\n");
//		String str = "This is a string";
//		System.out.println(str +x);
//		Integer xx = 5;

//		int z ;
//		long zz ;
//		z = 103;
//		System.out.println("列印103的值\t"+ z);
//		z = 0b111;
//		System.out.println("列印0b111的值\t"+ z);
//		zz = 022;
//		System.out.println("印出022的值\t"+ zz);
//		zz = 0x2B;
//		System.out.println("印出0x2B的值\t"+ zz);
//		
//		byte b = 127;
//		short s = 32767;
//		int i = 2147483647;
//		long l = 9223372036854775807L;
//		
//		float f = 3.0f;////字尾加f
//		
//		double d = 3.0;
//		
////		char = c;
//
//		System.out.println("x\n x");
//		System.out.println("x\t x");

//		int i = 0;
//		String str ="x";
//		String str1 = new String();  //初始化
///////////////////////////////////////////////////////////		
//		int x;
//		int z;
//		x= 120;
//		z= x* 8* 300;
//		System.out.println("一年可賺 :"+ z);
//		
//		int y = 9000*12;
//		int s = z-y;
//		System.out.println("一年可存 :"+ s);
/////////////////////////////////////////////////////////////////
//		String x = "是";
//		String y = "否";
//		System.out.println(5 < 4 ? x:y);//////(true顯示x:false顯示y)///三元運算子亦可用於vue
//////////////////////////////////////////////////////////////////
//		int x, y, value;
//		x = y = 10;
//		value = ++x * 10;
//		System.out.println("x= " + x + "\n遞增放前面++y\t++x*10=" + value);
//		value = y++ * 10;
//		System.out.println("y=" + y + "\n遞增放後面y++\ty++*10=" + value);
		/////////////////////////////////////////////////////////////////////////////
//		Scanner scan = new Scanner(System.in);////////System.in表示螢幕輸入，執行後終端機會等待user輸入進而印出來
//		int x,y;
//		String str;
//		x = scan.nextInt();//只能輸入數字型態的資料
//		y = scan.nextInt();
//		str = scan.next();///////////注意字串別加到int!!!
//		System.out.println(x+"\t"+y+"\t"+str);/////////////在輸入時以空白間區分
		//////////////////////////////////////////////////////////////////////////////
	}
}
