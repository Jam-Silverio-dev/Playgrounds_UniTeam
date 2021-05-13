package com.accenture.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	public void test2() {
		System.out.println("test1 executed");
	}

}
