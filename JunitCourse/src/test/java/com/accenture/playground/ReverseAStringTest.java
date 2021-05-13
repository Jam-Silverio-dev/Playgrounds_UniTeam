package com.accenture.playground;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseAStringTest {
	ReverseAString r = new ReverseAString();
	
//	@Test
//	public void testReverse() {
//		assertEquals("olleh", r.reverseRecursive("hello"));
//		assertEquals("olleh", r.reverseRecursive("hello"));
//	}
	
	@Test
	public void testIsNumberGreaterThan0_Positive() {
		assertTrue(
				"error because", 
				r.isNumberGreaterThan0(0));
	}
	
	@Test
	public void testIsNumberGreaterThan0_Negative() {
		assertFalse(
				"error because", 
				r.isNumberGreaterThan0(1));
	}

}
