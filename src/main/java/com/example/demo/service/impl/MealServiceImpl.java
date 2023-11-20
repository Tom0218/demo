package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.MealId;
import com.example.demo.entity.meal;
import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;

@Service
public class MealServiceImpl implements MealService{
	
	@Autowired
	private MealDao mealDao;
	

	@Override
	public meal findByName(String name) {
		return null;
	}

	@Override
	public meal addMeal(meal meal) {
		if(!StringUtils.hasText(meal.getName()) || !StringUtils.hasText(meal.getCookingStyle()) || meal.getPrice() <= 0 ) {
			return null;
		}
		if(mealDao.existsById(new MealId(meal.getName(),meal.getCookingStyle()))) {
			return null;
		}
		mealDao.save(meal);
		return meal;
	}

	
	
	
	
}
