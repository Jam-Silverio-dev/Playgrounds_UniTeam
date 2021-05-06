package com.accenture.bootcamp.day6;

public class FindNextSquare {

	public static void main(String[] args) {
		System.out.println(findNextSquare(121));// -->returns 144
		System.out.println(findNextSquare(625));// -->returns 676
		System.out.println(findNextSquare(114));// -->returns -1 since 114 is not perfect
	}

	private static int findNextSquare(double num) {
		//Assume non-negative numbers
		double nextSquare = 0;
		double sqrRt = Math.sqrt(num);
		
		if (sqrRt %1 == 0) {
			 nextSquare = Math.pow(sqrRt -sqrRt%1 + 1,2); 
			return (int) nextSquare;
		} else return -1;
		
	}

}
