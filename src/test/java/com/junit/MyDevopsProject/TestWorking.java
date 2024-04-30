package com.junit.MyDevopsProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorking {

	Working w1 = new Working();
	 
	@Test
	public void testAddToLog1() {
		assertEquals("Adding Log for Remo", w1.addToLog("Remo"));
 
	}
 
	@Test
	public void testAddToLog2() {
		assertEquals("Adding Log for Ram", w1.addToLog("Ram"));
	}
 
	@Test
	public void testAddLogin1() {
		assertEquals("Adding Login Log for Sam", w1.addLogin("Sam"));
	}
 
	@Test
	public void testAddLogin2() {
		assertEquals("Adding Login Log for Ranjitha", w1.addLogin("Ranjitha"));
	}

}
