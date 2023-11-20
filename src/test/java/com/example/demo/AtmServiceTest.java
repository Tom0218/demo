package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@SpringBootTest
public class AtmServiceTest {
	
	@Autowired
	private AtmService atmService;
	
	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("A03", "AA123");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
		
	}
	//A01 AA123; AAA02 AA123 ; "A03", "AA123"
	
	@Test
	public void dispositTest() {
		AtmResponse res = atmService.dispoite("A02","AA123",1000);
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
	}
	
	@Test
	public void withdrawTest() {
		AtmResponse res = atmService.withdraw("A02","AA123",500);
		System.out.println(res.getRtnCode().getCode()+","+res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
	}

}
