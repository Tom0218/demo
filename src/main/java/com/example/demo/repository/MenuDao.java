package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Menu;

//@package�W��
//<T:class name>
//<ID:primary key��ƫ��A>
//Dao;Data Accesss Object ;���ư��ާ@
//jpar alt+/
//DAO�磌�󴣨ѷs�W�B�R���B�ק�B�d�ߥ\��

//Java Persistence API�FJava���[��API
//Menu�~��JpaRepository����


@Repository //�]��interface�L�knew�ҥH��SpringBoot�U��
public interface MenuDao extends JpaRepository<Menu, String> {
	
	
	
	

}
