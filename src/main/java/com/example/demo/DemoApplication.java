package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//�᭱exclude = {SecurityAutoConfiguration.class}�ư�spring security���n�J
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
//		System.out.println("�C�L103����\t"+ z);
//		z = 0b111;
//		System.out.println("�C�L0b111����\t"+ z);
//		zz = 022;
//		System.out.println("�L�X022����\t"+ zz);
//		zz = 0x2B;
//		System.out.println("�L�X0x2B����\t"+ zz);
//		
//		byte b = 127;
//		short s = 32767;
//		int i = 2147483647;
//		long l = 9223372036854775807L;
//		
//		float f = 3.0f;////�r���[f
//		
//		double d = 3.0;
//		
////		char = c;
//
//		System.out.println("x\n x");
//		System.out.println("x\t x");

//		int i = 0;
//		String str ="x";
//		String str1 = new String();  //��l��
///////////////////////////////////////////////////////////		
//		int x;
//		int z;
//		x= 120;
//		z= x* 8* 300;
//		System.out.println("�@�~�i�� :"+ z);
//		
//		int y = 9000*12;
//		int s = z-y;
//		System.out.println("�@�~�i�s :"+ s);
/////////////////////////////////////////////////////////////////
//		String x = "�O";
//		String y = "�_";
//		System.out.println(5 < 4 ? x:y);//////(true���x:false���y)///�T���B��l��i�Ω�vue
//////////////////////////////////////////////////////////////////
//		int x, y, value;
//		x = y = 10;
//		value = ++x * 10;
//		System.out.println("x= " + x + "\n���W��e��++y\t++x*10=" + value);
//		value = y++ * 10;
//		System.out.println("y=" + y + "\n���W��᭱y++\ty++*10=" + value);
		/////////////////////////////////////////////////////////////////////////////
//		Scanner scan = new Scanner(System.in);////////System.in��ܿù���J�A�����׺ݾ��|����user��J�i�ӦL�X��
//		int x,y;
//		String str;
//		x = scan.nextInt();//�u���J�Ʀr���A�����
//		y = scan.nextInt();
//		str = scan.next();///////////�`�N�r��O�[��int!!!
//		System.out.println(x+"\t"+y+"\t"+str);/////////////�b��J�ɥH�ťն��Ϥ�
		//////////////////////////////////////////////////////////////////////////////
	}
}
