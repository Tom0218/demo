package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Menu;
import com.example.demo.service.ifs.MenuService;

//�]��test�PService,Dao,entity���P��Ƨ��ҥH�n�[SpringBootTest�~����src/main/java�̳QSpringboot�U�ު�����
@SpringBootTest
public class MenuServiceTest {

	// Autowired�����ӱa�J���ѼƨM�w�O��@���Ϊ̭���
	@Autowired
	private MenuService menuService;

	
	
	@Test
	public void addMenuTest1() {
		Menu result = menuService.addMenu(new Menu("fish", 120));
		Assert.isTrue(result ==null,"addMenu error");
	}

	@Test
	public void addMenuTest2() {
		//name�Bcookingstyle���ű���
		Menu result = menuService.addMenu(new Menu("", 600));
		Assert.isTrue(result ==null,"addMenu error");
		//price = 0
		result = menuService.addMenu(new Menu("a", 0));
		Assert.isTrue(result ==null,"addMenu error");
		//���`�s�W
		result = menuService.addMenu(new Menu("b", 120));
		Assert.isTrue(result !=null,"addMenu error");
		//�s�W�w�s�b��menu
		result = menuService.addMenu(new Menu("b", 150));
		Assert.isTrue(result ==null,"addMenu error");
		//�R�����ո��
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
		//name���ű���
		Menu result = menuService.findByName("");
		Assert.isTrue(result ==null,"findByName error!");
		//name���s�b
		result = menuService.findByName("fish");
		Assert.isTrue(result ==null,"findByName error!");
		//�s�W���ո��
		result = menuService.addMenu(new Menu("fish1",120));
		result = menuService.findByName("fish1");
		Assert.isTrue(result !=null,"findByName error!");
	}

	@Test
	public void updateMenuTest() {
		//name���󤣺�
		Menu result = menuService.updateMenu(new Menu("",120));
		Assert.isTrue(result ==null,"updateMenu error!");
		//price =0
		result = menuService.updateMenu(new Menu("chicken",0));
		Assert.isTrue(result ==null,"updateMenu error!");
		//��s���s�b��Menu
		result = menuService.updateMenu(new Menu("fish1",120));
		Assert.isTrue(result ==null,"updateMenu error!");
		//���`�s�W��A��s
		result = menuService.updateMenu(new Menu("fish1",120));
		result = menuService.updateMenu(new Menu("fish1",150));
		//�H�U���assert�ܤ@
//		Assert.isTrue(result !=null,"updateMenu error!");
		Assert.isTrue(result.getPrice()==150,"updateMenu error!");
		//�R�����ո��
//		menuDao.deleteById("fish1");
		
	}
	
	
	
	
}
