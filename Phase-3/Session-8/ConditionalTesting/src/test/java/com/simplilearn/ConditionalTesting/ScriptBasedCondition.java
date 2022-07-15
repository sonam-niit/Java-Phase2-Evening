package com.simplilearn.ConditionalTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class ScriptBasedCondition {

	boolean myTest() {
		return true;
	}
	boolean myTest1() {
		return false;
	}
	@Test
	@EnabledIf("myTest")
	public void conditionTrue() {
		System.out.println("Execute whne method returns true");
	}
	@Test
	@DisabledIf("myTest1")
	public void conditionFalse() {
		System.out.println("Execute when method returns false");
	}
}
