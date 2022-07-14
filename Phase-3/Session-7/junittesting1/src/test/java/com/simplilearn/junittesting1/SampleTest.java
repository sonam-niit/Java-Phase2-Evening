package com.simplilearn.junittesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All Test");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All Test");
	}
	@BeforeEach
	public void beforeEach() {
		System.err.println("Executed before Each");
	}
	@AfterEach
	public void afterEach() {
		System.err.println("Executed after each");
	}
	@Test
	public void testOne() {
		System.out.println("This is my first Test");
	}
	@Test
	public void testTwo() {
		System.out.println("This is my second test");
	}
}
