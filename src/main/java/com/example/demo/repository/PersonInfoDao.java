package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.personInfo;
//不是單一筆資料用list接
@Repository
public interface PersonInfoDao extends JpaRepository<personInfo, String>{
	//findByCity的city指的是屬性city而不是欄位city;，要先找到屬性才可以操作資料庫
	public List<personInfo> findByCity(String city);
	
	public List<personInfo> findByNameAndCity(String name, String city);
	
	public List<personInfo> findByNameOrCity(String name,String city);
	
	public List<personInfo>findByAgeGreaterThan(int age);
	
	public List<personInfo>findByAgeLessThanEqualOrderByAge(int age);
	
	public List<personInfo>findByAgeLessThanOrAgeGreaterThan(int age1, int age2);
	
	public List<personInfo>findTop3ByAgeBetweenOrderByAgeDesc(int age1, int age2);
	
	public List<personInfo>findByCityContaining(String city);
	
	public List<personInfo>findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String city);
//	
//	
	

}
