package com.accenture.tcf.codingassessment.collection;

import java.util.Comparator;

public class SweetnessLevelComparator implements Comparator<Candy>{

	public int compare(Candy o1, Candy o2) {
		return o1.getSweetnessLevel() - o2.getSweetnessLevel();
	}

//	public int compareSweetnessLevel(Candy o1, Candy o2) {
//		return o1.getSweetnessLevel() - o2.getSweetnessLevel();
//	}
//
//	@Override
//	public int compare(Candy o1, Candy o2) {
//		// TODO Auto-generated method stub
//		return o1.getSweetnessLevel() - o2.getSweetnessLevel();
//	}


	
	

}
