package com.accenture.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalRepresentationTest {

	@Test
	public void testSolution1() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(2, dr.solution(53, 1953786));
	}
	
	@Test
	public void testSolution2() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(0, dr.solution(53, 53786));
	}
	
	@Test
	public void testSolution3() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(1, dr.solution(53, 853786));
	}
	
	@Test
	public void testSolution4() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(4, dr.solution(53, 193453786));
	}
	
	@Test
	public void testSolution5() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(-1, dr.solution(53, 999999999));
	}
	
	@Test
	public void testSolution6() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(-1, dr.solution(53, 999999999));
	}
	
	@Test
	public void testSolution7() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(-1, dr.solution(53, 0));
	}
	
	@Test
	public void testSolution8() {
		DecimalRepresentation dr = new DecimalRepresentation();
		assertEquals(-1, dr.solution(53, 999999999));
	}

}
