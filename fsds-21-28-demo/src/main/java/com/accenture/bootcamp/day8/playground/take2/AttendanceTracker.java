package com.accenture.bootcamp.day8.playground.take2;

import java.util.ArrayList;
import java.util.List;


public class AttendanceTracker {
	private List<Learner> mList = new ArrayList<Learner>();
	
	
	public void addLearner(Learner learner) {
		mList.add(learner);
	}


	public List<String> printArrayList() {
		List<String> toRead = new ArrayList<String>();
		for (Learner learner : mList) {
			toRead.add(learner.toString());
		}
		return toRead;
	}

	
}
