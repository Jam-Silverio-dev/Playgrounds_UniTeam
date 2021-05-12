package com.accenture.tcf.codingassessment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Candy mCandy = new Candy();
		mCandy.start();
		
		List<Candy> nCandies = new ArrayList<Candy>(mCandy.getCandies());
		
		System.out.println("\nThis is sorting:");
		
		
		//Sorting by name
		System.out.println("\nThis is unsorted.");
		System.out.println(nCandies);
		
		System.out.println("\nThis is sorted by name.");
		Collections.sort(nCandies, new NameComparator());
		System.out.println(nCandies);
		
		//Sorting by color
		System.out.println("\nThis is unsorted.");
		System.out.println(nCandies);
		
		System.out.println("\nThis is sorted by color.");
		Collections.sort(nCandies, new ColorComparator());
		System.out.println(nCandies);
		
		
		//Sorting by sweetness level
		System.out.println("\nThis is unsorted.");
		System.out.println(nCandies);
		
		System.out.println("\nThis is sorted by sweetness level.");
		Collections.sort(nCandies, new SweetnessLevelComparator());
		System.out.println(nCandies);
	}

}
