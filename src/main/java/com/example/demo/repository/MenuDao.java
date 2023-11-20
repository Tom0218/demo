package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Menu;

//@package名稱
//<T:class name>
//<ID:primary key資料型態>
//Dao;Data Accesss Object ;對資料做操作
//jpar alt+/
//DAO對物件提供新增、刪除、修改、查詢功能

//Java Persistence API；Java持久化API
//Menu繼承JpaRepository介面


@Repository //因為interface無法new所以給SpringBoot託管
public interface MenuDao extends JpaRepository<Menu, String> {
	
	
	
	

}
