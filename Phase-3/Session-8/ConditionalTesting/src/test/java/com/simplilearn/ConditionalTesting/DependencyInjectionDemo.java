package com.simplilearn.ConditionalTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Dependency Injection Example")
class DependencyInjectionDemo {

	public DependencyInjectionDemo(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}
	
	@Test
	@DisplayName("My Method")
	public void myTest(TestInfo testInfo) {
		assertEquals("My Method", testInfo.getDisplayName());
	}
	@Test
	@DisplayName("My Method")
	@Tag("mytag")
	public void myTest1(TestInfo testInfo) {
		assertEquals("My Method", testInfo.getDisplayName());
		assertTrue(testInfo.getTags().contains("mytag"));
	}
}
