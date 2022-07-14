package com.simplilearn.junittesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalOSTest {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println("This run on Windows OS");
	}
	@Test
	@DisabledOnOs({OS.MAC})
	public void notRunOnMac() {
		System.out.println("Not run on MAC");
	}
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac() {
		System.out.println("This run on MAC OS");
	}
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println("This run on Linux OS");
	}
}