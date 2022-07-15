package com.simplilearn.ConditionalTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class ConditionalJRETest {

	@Test
	@EnabledOnJre(JRE.JAVA_18)
	public void runOnJRE18() {
		System.out.println("This case will run on JRE 18");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void runOnJRE17() {
		System.out.println("This case will run on JRE 17");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_16)
	public void runOnJRE16() {
		System.out.println("This case will run on JRE 16");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_15)
	public void runOnJRE15() {
		System.out.println("This case will run on JRE 15");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_14)
	public void runOnJRE14() {
		System.out.println("This case will run on JRE 14");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_13)
	public void runOnJRE13() {
		System.out.println("This case will run on JRE 13");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_12)
	public void runOnJRE12() {
		System.out.println("This case will run on JRE 12");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	public void runOnJRE11() {
		System.out.println("This case will run on JRE 11");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_10)
	public void runOnJRE10() {
		System.out.println("This case will run on JRE 10");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_9)
	public void runOnJRE9() {
		System.out.println("This case will run on JRE 9");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	public void runOnJRE8() {
		System.out.println("This case will run on JRE 8");
	}
}
