package com.simplilearn.ConditionalTesting;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicTestDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTestDemo(){
		
		return Arrays.asList(
				dynamicTest("Test 1", ()->assertTrue(12>0)),
				dynamicTest("Test 2", ()->assertFalse(0>1)),
				dynamicTest("Test 3", ()->assertEquals(12,8+4)),
				dynamicTest("Test 4", ()->assertNull(null)),
				dynamicTest("Test 5", ()->assertThrows(RuntimeException.class, 
						()->{ throw new RuntimeException("Not valid");})),
				dynamicTest("Test 6", new MyExecutable())
				
		);
		
	}
}

class MyExecutable implements Executable
{

	@Override
	public void execute() throws Throwable {
		System.out.println("From My executable class");
		
	}
	
}
