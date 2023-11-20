package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.A1;
import com.example.demo.entity.Animal;
import com.example.demo.entity.Bird;
import com.example.demo.entity.C;
import com.example.demo.entity.Car;
import com.example.demo.entity.Cat;
import com.example.demo.entity.Dog;

public class ExtendsTest {
	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("�����O Animal name :" + anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("�p��");
		System.out.println("�l���O Bird name :" + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
		Cat cat = new Cat();
		cat.setName("�D�D");
		cat.eat();
		cat.bit();
		
	}
	
	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		a1.getC().getCity();//�]�����O�w�]��null�ҥH�bA1�����OC�����w�]��(new C())���e����|����
	}
	
	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		////�]��A1��c�w�g���w�]�ȡA�ܦ�c���ݩʬ�null;
		String city = a1.getC().setCity("tainan");;
		System.out.println(city);
	}
	
	@Test
	public void extendsTest3() {
		C c = new C("aaa","bbb","ccc");
		
		A1 a1 = new A1();
		a1.setC(c);
		a1.setAddress("DDD");
		System.out.println("======");
		System.out.println("city: "+ a1.getC().getCity());
		System.out.println("state: " + a1.getC().getState());
		System.out.println("country: " + a1.getC().getCountry());
		System.out.println("address: " + a1.getAddress());
		
	}
	
	@Test
	public void animalEat() {
		Animal anim = new Animal();
		Bird bird = new Bird();
		Cat cat = new Cat();
		bird.eat();
		anim.eat();
		cat.eat();
		System.out.println("==============");
		////�H�����O�����u��ϥΤ����O����k�A��ڦb�l���O����
		Animal animm = new Animal();
		Animal birdd = new Bird();
		Animal catt = new Cat();
		animm.eat();
		birdd.eat();
		catt.eat();
		System.out.println("==============");
		
	}
	
	@Test
	public void interfaceTest() {
		Car car = new Car();
		Dog dog = new Dog();
		car.run();
		dog.run();
	}
	
	
	

}
