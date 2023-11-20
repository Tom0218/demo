package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Aaa;
import com.example.demo.entity.MealId;
import com.example.demo.entity.meal;
import com.example.demo.repository.AaaDao;
import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;

@SpringBootTest
public class MealServiceTest {
	
	@Autowired
	private MealService mealService;
	
	@Autowired
	private MealDao mealDao;
	
	@Autowired
	private AaaDao aaaDao;
	
	
	@Test
	public void addMeal() {
//		mealService.addMeal(new meal("beef","BBQ",180));
//		mealService.addMeal(new meal("beef","fry",150));
//		mealService.addMeal(new meal("pork","fried",220));
//		mealService.addMeal(new meal("chicken","stew",260));
//		mealService.addMeal(new meal("chicken","BBQ",120));
		mealService.addMeal(new meal("chicken","steam",520));
	}
	
	@Test
	public void addMealTest() {
		//name不符條件
		meal result = mealService.addMeal(new meal("","bbq",180));
		Assert.isTrue(result == null, "addMeal error !!");
		//cooking條件不符
		result = mealService.addMeal(new meal("beef","",180));
		Assert.isTrue(result == null, "addMeal error !!");
		//price條件不符
		result = mealService.addMeal(new meal("beef","bbq",0));
		Assert.isTrue(result == null, "addMeal error !!");
		//正常新增
		result = mealService.addMeal(new meal("chicken","bbq",180));
		Assert.isTrue(result != null, "addMeal error !!");
		//再新增已存在的meal
		result = mealService.addMeal(new meal("beef","bbq",180));
		Assert.isTrue(result == null, "addMeal error !!");
		//刪除測試資料
		mealDao.deleteById(new MealId("beef","bbq"));
		
	}
	
	@Test
	public void limitTest() {
		List<meal> res = mealDao.findTop2ByName("chicken");
		System.out.println(res.size());
		Assert.isTrue(res.size()==2,"find limit error");
	}
	
	@Test
	public void OrderByTest() {
//		List<meal> res =mealDao.findAllByOrderByPrice();
		List<meal> res =mealDao.findAllByOrderByPriceDesc();
		for(meal item :res){
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
		
	}
	
	@Test
	public void compareTest() {
		mealDao.findByPriceGreaterThan(200);
		List<meal> res =mealDao.findAllByOrderByPriceDesc();
		for(meal item :res){
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
	}
	
	@Test
	public void containingTest() {
		//List<meal> res = mealDao.findByNameContaining("e");
		List<meal> res = mealDao.findByNameContainingAndCookingStyleContaining("e","b");
		for(meal item :res){
		System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
	}
	@Test
	public void betweenTest() {
		List<meal> res = mealDao.findByPriceBetween(100, 300);
		for(meal item :res){
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
	}
	
	@Test
	public void inTest() {
		List<meal> res = mealDao.findByPriceIn(new ArrayList<>(List.of(100,120,150,180,200)));
	}
	
//	@Test
//	public void aaaTest() {
//		aaaDao.save(new Aaa("A01"));
//	}

	
	
	
}
