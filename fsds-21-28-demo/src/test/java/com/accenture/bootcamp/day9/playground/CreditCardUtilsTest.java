package com.accenture.bootcamp.day9.playground;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardUtilsTest {

	@Test
	public void test() {
		//setup
		String ccNumber = "1122334455667788";
		
		//execute
		String result = CreditCardUtils.mask(ccNumber);
		
		//assert
		String expected = "XXXXXXXXXXXX7788";
		assertEquals(expected, result);
	}

}
