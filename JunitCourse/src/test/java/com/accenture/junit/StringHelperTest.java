package com.accenture.junit;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;


public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	
	@BeforeClass
	public static void test1() {
		System.out.println("test1 executed");
	}


	
	//AACD => CD, ACD => CD, CDEF => CDEF
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));//inline
		//expected, actual
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("BCA", helper.truncateAInFirst2Positions("AABC"));//inline
		//expected, actual
	}

	@After
	public void test2() {
		System.out.println("test2 executed");
	}
}
