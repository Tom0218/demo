package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MealId;
import com.example.demo.entity.meal;

@Repository
public interface MealDao extends JpaRepository<meal, MealId>{

	//findFirst计:肚计秖(3掸)
	public List<meal> findFirst2ByName(String name);
	//findTop计
	public List<meal> findTop2ByName(String name);
	
	//orderBy逼; 箇砞ASC
	// ASCパ; DESC:パ
	public List<meal> findByNameOrderByPrice(String name);
	
	//findAllOrderByPriceAsc()
	public List<meal> findAllByOrderByPrice();
	
	public List<meal> findAllByOrderByPriceDesc();
	
	//ゑ
	//1.:GreaterThan 2.单:GreaterThanEqual
	//3.:LessThan 4.单:LessThanEqual
	public List<meal> findByPriceGreaterThan(int price);
	
	//
	public List<meal>findByNameAndPriceGreaterThan(String name, int price);
	
	//containing
	public List<meal>findByNameContaining(String name);
	
	public List<meal>findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	
	//between 
	public List<meal>findByPriceBetween(int price1, int price2);
	
	//in
	public List<meal>findByPriceIn(List<Integer> priceList);
	
	
}
