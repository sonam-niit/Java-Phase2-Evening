package com.simplilearn.junittesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assertions {

	public boolean checkAge(int age) {
		return age>=18;
	}
	@Test
	@Disabled
	public void testAssertions() {
		
		assertEquals(6, 4+2);
		assertNotEquals(7, 4+2);
		assertTrue(checkAge(19));
		
		assertFalse(checkAge(9));
		int a=67;
		int b=89;
		assertTrue(b>a);
		assertFalse(a>b);
		//check null value then use assertNull
		
		String name=null;
		assertNull(name);
		//name="hello";
		assertNotNull(name);
		
		//check throws exceptions
		//2nd parameter is executable , you can pass function as parameter
		// in jdk 8 we can use lambda function
	}
	@Test
	@DisplayName("Test Exception using Lambda")
	public void testThrow() {
		assertThrows(RuntimeException.class, 
				()->{throw new RuntimeException("not valid");});
		assertThrows(ArithmeticException.class, 
				()->{int x= 10/0;System.out.println(x);});
		assertThrows(NullPointerException.class, 
				()->{String x=null; System.out.println(x.toLowerCase());});
	}

}
