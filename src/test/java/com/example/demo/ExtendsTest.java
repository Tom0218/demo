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
		System.out.println("父類別 Animal name :" + anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("小鳥");
		System.out.println("子類別 Bird name :" + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
		Cat cat = new Cat();
		cat.setName("胖胖");
		cat.eat();
		cat.bit();
		
	}
	
	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		a1.getC().getCity();//因為類別預設為null所以在A1中類別C給予預設值(new C())之前執行會跳錯
	}
	
	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		////因為A1中c已經有預設值，變成c的屬性為null;
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
		////以父類別接收只能使用父類別的方法，實際在子類別執行
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
