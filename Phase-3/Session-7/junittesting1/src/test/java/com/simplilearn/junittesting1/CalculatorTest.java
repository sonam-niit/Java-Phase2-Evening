package com.simplilearn.junittesting1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc= new Calculator();
	}
	@AfterEach
	public void teardown() {
		calc=null;
	}
	@Test
	public void addtest() {
		assertEquals(7, calc.add(3, 4));
	}
	@Test
	public void subtest() {
		assertEquals(6, calc.sub(12,6));
	}
}
