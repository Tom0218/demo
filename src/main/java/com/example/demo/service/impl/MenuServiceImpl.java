package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;

//MenuServiceImpl實作MenuService業務邏輯使用menuDao對資料庫做操作

@Service //把MenuServiceImpl給springboot託管
public class MenuServiceImpl implements MenuService{

	//@ : annotation
	@Autowired	//把被託管的物件拿來使用這便指MenuDao
	private MenuDao menuDao;
	
	@Override
	public Menu addMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
		if(menuDao.existsById(menu.getName())) {
			return null;
		}
		//存資料庫
		//save(entity)
		Menu result = menuDao.save(menu);
		return result;
		
	}

	@Override
	public List<Menu> addMenuList(List<Menu> menus) {
		for(Menu item:menus) {
			if(!StringUtils.hasText(item.getName())|| item.getPrice() <= 0) {
				return null;
			}
		}
		return menuDao.saveAll(menus);

	}

	@Override
	public Menu findByName(String name) {
		Optional<Menu> menuOp = menuDao.findById(name);
		if(menuOp.isEmpty()) {
			return null;
		}
		return menuOp.get();
	}
	
	public Menu findByName2(String name) {
		Optional<Menu> menuOp = menuDao.findById(name);
		return menuOp.isEmpty()? null : menuOp.get();
		
	}

	@Override
	public List<Menu> findAll() {
		return menuDao.findAll();
	}

	@Override
	public Menu updateMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
		if(!menuDao.existsById(menu.getName())) {
			return null;
		}
		return menuDao.save(menu);
	}

	


	
		
	

}
