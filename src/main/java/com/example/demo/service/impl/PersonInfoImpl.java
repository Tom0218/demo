package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.personInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;


@Service
public class PersonInfoImpl implements PersonInfoService{
	
	@Autowired
	private PersonInfoDao  personInfoDao;
	
	@Override
	public personInfo addPersonInfo(personInfo personInfo) {
		if(!StringUtils.hasText(personInfo.getName()) || !StringUtils.hasText(personInfo.getId() )|| !StringUtils.hasText(personInfo.getCity())||personInfo.getAge()<=0) {
			return null;
		}
		if(personInfoDao.existsById(personInfo.getName())) {
			return null;
		}
		String pattern = "[A-Za-z&&[^ABDEFHabdefh\\d]]\\d{9}";
		if(!personInfo.getId().matches(pattern)) {
			return null;
		}
		return personInfoDao.save(personInfo);
		
	}
	
	@Override
	public List<personInfo> addPersonInfoList(List<personInfo> InfoList) {
		String pattern = "[A-Za-z&&[^ABDEFHabdefh\\d]][1,2]\\d{8}";
		for(personInfo item:InfoList) {
			String id = item.getId();
			if(!(StringUtils.hasText(id)||id.matches(pattern))) {
				System.out.println("id 格式錯誤");
				return null;//跳出方法
			}			
		}
		personInfoDao.saveAll(InfoList);
		return InfoList;
	}

	@Override
	public List<personInfo> findAll() {
		return personInfoDao.findAll();
	}

	@Override
	public personInfo findById(String id) {
		Optional<personInfo> op = personInfoDao.findById(id);
		if(op.isEmpty()) {
			return null;
		}
		System.out.println("id:"+op.get().getId()+" name:"+op.get().getName()+" age:"+op.get().getAge()+" city:"+op.get().getCity());
		return op.get();
		
	}

	
}
