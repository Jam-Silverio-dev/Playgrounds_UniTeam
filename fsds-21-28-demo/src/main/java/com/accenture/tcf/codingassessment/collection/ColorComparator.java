package com.accenture.tcf.codingassessment.collection;

import java.util.Comparator;

public class ColorComparator implements Comparator<Candy>{

	public int compare(Candy o1, Candy o2) {
		return o1.getColor().compareTo(o2.getColor());
	}
	
	
}
