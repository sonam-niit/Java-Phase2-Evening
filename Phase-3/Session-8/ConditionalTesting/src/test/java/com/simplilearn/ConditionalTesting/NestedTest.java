package com.simplilearn.ConditionalTesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All from Outer class");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		System.out.println("After All from Outer Class");
	}
	@BeforeEach
	void setUp() throws Exception{
		System.out.println("Before Each from Outer class");
	}
	@AfterEach
	void tearDown() throws Exception{
		System.out.println("After Each Outer class");
	}
	@Test
	@DisplayName("Outer Test")
	void testOuter() {
		System.out.println("Test case from Outer class");
	}
	@Nested
	class Inner{
		@BeforeEach
		void setUp() throws Exception{
			System.out.println("Before Each from Inner class");
		}
		@AfterEach
		void tearDown() throws Exception{
			System.out.println("After Each Inner class");
		}
		@Test
		@DisplayName("Inner Test")
		void testInner() {
			System.out.println("Test case from Inner class");
		}
		
		@Nested
		class Whenx{
			@BeforeEach
			void setUp() throws Exception{
				System.out.println("Before Each from WhenX class");
			}
			@AfterEach
			void tearDown() throws Exception{
				System.out.println("After Each From WhenX class");
			}
			@Test
			@DisplayName("WhenX Test")
			void testInner() {
				System.out.println("Test case from WhenX class");
			}
		}
	}
	
	
}
