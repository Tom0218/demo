package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Menu;
import com.example.demo.service.ifs.MenuService;

//因為test與Service,Dao,entity不同資料夾所以要加SpringBootTest才能抓到src/main/java裡被Springboot託管的物件
@SpringBootTest
public class MenuServiceTest {

	// Autowired介面而帶入的參數決定是實作鳥或者飛機
	@Autowired
	private MenuService menuService;

	
	
	@Test
	public void addMenuTest1() {
		Menu result = menuService.addMenu(new Menu("fish", 120));
		Assert.isTrue(result ==null,"addMenu error");
	}

	@Test
	public void addMenuTest2() {
		//name、cookingstyle不符條件
		Menu result = menuService.addMenu(new Menu("", 600));
		Assert.isTrue(result ==null,"addMenu error");
		//price = 0
		result = menuService.addMenu(new Menu("a", 0));
		Assert.isTrue(result ==null,"addMenu error");
		//正常新增
		result = menuService.addMenu(new Menu("b", 120));
		Assert.isTrue(result !=null,"addMenu error");
		//新增已存在的menu
		result = menuService.addMenu(new Menu("b", 150));
		Assert.isTrue(result ==null,"addMenu error");
		//刪除測試資料
//		menuDao.deleteById("fish");
	}
	
	@Test
	public void addMenuList() {
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("", 150));
		list.add(new Menu("goose", 250));
		menuService.addMenuList(list);
	}

	@Test
	public void findAllTest() {
		menuService.findAll();
	}

	@Test
	public void findByNameTest() {
		//name不符條件
		Menu result = menuService.findByName("");
		Assert.isTrue(result ==null,"findByName error!");
		//name不存在
		result = menuService.findByName("fish");
		Assert.isTrue(result ==null,"findByName error!");
		//新增測試資料
		result = menuService.addMenu(new Menu("fish1",120));
		result = menuService.findByName("fish1");
		Assert.isTrue(result !=null,"findByName error!");
	}

	@Test
	public void updateMenuTest() {
		//name條件不福
		Menu result = menuService.updateMenu(new Menu("",120));
		Assert.isTrue(result ==null,"updateMenu error!");
		//price =0
		result = menuService.updateMenu(new Menu("chicken",0));
		Assert.isTrue(result ==null,"updateMenu error!");
		//更新不存在的Menu
		result = menuService.updateMenu(new Menu("fish1",120));
		Assert.isTrue(result ==null,"updateMenu error!");
		//正常新增後再更新
		result = menuService.updateMenu(new Menu("fish1",120));
		result = menuService.updateMenu(new Menu("fish1",150));
		//以下兩個assert擇一
//		Assert.isTrue(result !=null,"updateMenu error!");
		Assert.isTrue(result.getPrice()==150,"updateMenu error!");
		//刪除測試資料
//		menuDao.deleteById("fish1");
		
	}
	
	
	
	
}
