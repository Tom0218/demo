package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.personInfo;
//���O��@����ƥ�list��
@Repository
public interface PersonInfoDao extends JpaRepository<personInfo, String>{
	//findByCity��city�����O�ݩ�city�Ӥ��O���city;�A�n������ݩʤ~�i�H�ާ@��Ʈw
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
