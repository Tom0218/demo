package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MealId;
import com.example.demo.entity.meal;

@Repository
public interface MealDao extends JpaRepository<meal, MealId>{

	//findFirst�Ʀr:����^�Ǽƶq(3��)
	public List<meal> findFirst2ByName(String name);
	//findTop�Ʀr
	public List<meal> findTop2ByName(String name);
	
	//orderBy�Ƨ�; �w�]ASC
	// ASC�Ѥp��j; DESC:�Ѥj��p
	public List<meal> findByNameOrderByPrice(String name);
	
	//findAllOrderByPriceAsc()
	public List<meal> findAllByOrderByPrice();
	
	public List<meal> findAllByOrderByPriceDesc();
	
	//��j�p
	//1.�j��:GreaterThan 2.�j�󵥩�:GreaterThanEqual
	//3.�p��:LessThan 4.�p�󵥩�:LessThanEqual
	public List<meal> findByPriceGreaterThan(int price);
	
	//�h��
	public List<meal>findByNameAndPriceGreaterThan(String name, int price);
	
	//containing
	public List<meal>findByNameContaining(String name);
	
	public List<meal>findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	
	//between �]�t�W�U�ɭ�
	public List<meal>findByPriceBetween(int price1, int price2);
	
	//in
	public List<meal>findByPriceIn(List<Integer> priceList);
	
	
}
