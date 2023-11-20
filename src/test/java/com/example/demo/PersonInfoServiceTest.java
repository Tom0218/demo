package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.personInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;




@SpringBootTest
public class PersonInfoServiceTest {
	
	@Autowired
	private PersonInfoService personInfoService;
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	@Test
	public void addPersonInfoTest() {
//		personInfoService.addPersonInfo(new personInfo("R123474569","tttt",18,"sai"));
//		personInfoService.addPersonInfo(new personInfo("R123454569","tt",12,"ta"));
		personInfoService.addPersonInfo(new personInfo("R123784569","ttt",10,"ai"));
		personInfoService.addPersonInfo(new personInfo("R123684669","ss",9,"ai"));
//		personInfoService.addPersonInfo(new personInfo("R123284369","s",11,"ai"));
				
	}
	
	@Test
	public void findAllTest() {
		List<personInfo> list = personInfoDao.findAll();
		for(personInfo item : list) {
			System.out.println("Id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+" city:"+item.getCity());
		}
	}
	
	@Test
	public void findByIdTest() {
		System.out.println(personInfoService.findById("R123474525"));
		
	}
	
	@Test
	public void findAgeTest() {
		List<personInfo> res = personInfoDao.findByAgeGreaterThan(15);
		for(personInfo item:res) {
			System.out.println("id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+"city"+item.getCity());
		}
	}
	
	@Test
	public void findAgeTest2() {
		List<personInfo> res = personInfoDao.findByAgeLessThanEqualOrderByAge(12);
		for(personInfo item:res) {
			System.out.println("id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+"city"+item.getCity());
		}
	}
	
	@Test
	public void findAgeTest3() {
		List<personInfo> res = personInfoDao.findByAgeLessThanOrAgeGreaterThan(0, 0);
		for(personInfo item:res) {
			System.out.println("id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+"city"+item.getCity());
		}
	}
	
	@Test
	public void findAgeTest4() {
		List<personInfo> res = personInfoDao.findTop3ByAgeBetweenOrderByAgeDesc(8, 20);
		for(personInfo item:res) {
			System.out.println("id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+"city"+item.getCity());
		}
	}
	
	@Test
	public void findAgeTest5() {
		List<personInfo> res = personInfoDao.findByCityContaining("s");
		for(personInfo item:res) {
			System.out.println("id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+"city"+item.getCity());
		}
	}
	
	@Test
	public void findAgeTest6() {
		List<personInfo> res = personInfoDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(9, "a");
		for(personInfo item:res) {
			System.out.println("id:"+item.getId()+" name:"+item.getName()+" age:"+item.getAge()+"city"+item.getCity());
		}
	}
	
	
	
	
	
	
	
	@Test
	public void addPersonInfoListTest2() {
		List<personInfo> list = new ArrayList<>();
		list.add(new personInfo("G123456787","kkk",28,"kaohsiung"));
		list.add(new personInfo("G123456687","fff",21,"kaohsiung"));
		personInfoService.addPersonInfoList(list);
	}
	
	//新增多筆資訊
	@Test
	public void daoSaveTest() {
		List<personInfo> list = new ArrayList<>();
		list.add(new personInfo("R123456787","ddd",28,"kaohsiung"));
		list.add(new personInfo("E123456787","ccc",21,"kaohsiung"));
		personInfoDao.saveAll(list);
		
	}
	
	//findbyid的id為entity裡有@Id的欄位(Primary key)
	@Test
	public void daoFindTest() {
		Optional<personInfo> infoOp = personInfoDao.findById("1234");
		if(infoOp.isEmpty()) {
			System.out.println("Not found!!!");
			return;
		} else {
			System.out.println(infoOp.get().getName());	//get()從Optional取出來
		}
	}
	
	@Test
	public void daoFindTest2() {
		List<personInfo> list = personInfoDao.findAll();
		for(personInfo item : list) {
			System.out.println(item.getName());
		}
	}
	
	@Test
	public void daoFindTest3() {
		boolean result = personInfoDao.existsById("1234");
		System.out.println(result);
	}
	
	@Test
	public void daoFindTest4() {
		List<personInfo> result = personInfoDao.findByCity("tainan");
		System.out.println(result.size());
		for(personInfo item : result) {
			System.out.println(item.getName());
		}
		
	}
		
}

