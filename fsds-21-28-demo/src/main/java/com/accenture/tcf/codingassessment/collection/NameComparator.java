package com.accenture.tcf.codingassessment.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Candy>{

	public int compare(Candy o1, Candy o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}
