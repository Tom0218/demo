package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DateTest {

	@Test
	public void DateTest() {
	LocalDate today = LocalDate.now();
	System.out.println(today.getYear());
	}
}
