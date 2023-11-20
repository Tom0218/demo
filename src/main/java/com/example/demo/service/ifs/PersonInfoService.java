package com.example.demo.service.ifs;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.meal;
import com.example.demo.entity.personInfo;

public interface PersonInfoService {
	
	public personInfo addPersonInfo( personInfo personInfo);

	public List<personInfo> addPersonInfoList(List<personInfo> String);
	
	public List<personInfo> findAll();
	
	public personInfo findById(String id);
	
	
	
}