package com.simplilearn.ConditionalTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After ALL");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Set Up Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tear Down After Each");
	}
	@DisplayName("Repeated Test")
	@RepeatedTest(value = 5,name = "Testcase:{displayName} the currentCount is "
			+ "{currentRepetition} out of {totalRepetitions}")
	void test() {
		assertEquals(8, 6+2);
		System.out.println("Test Executed");
	}

}
