package com.example.demo.service.ifs;

import com.example.demo.entity.meal;

public interface MealService {
	
	public meal findByName(String name) ;
	
	public meal addMeal(meal meal);
	

}
