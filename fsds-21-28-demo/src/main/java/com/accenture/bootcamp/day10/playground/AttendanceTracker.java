package com.accenture.bootcamp.day10.playground;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceTracker {
	private List<Learner> mList = new ArrayList<Learner>();
	
	private Scanner scanner = new Scanner(System.in);
	private boolean run = false;
	private String choice = "n";
	
	
	public void start() {
		this.run = true;
		while(this.run != false) {
			askLearner();
		}
	}
	
	private void askLearner() {
		System.out.print("Enter eid: ");
		String eid = scanner.nextLine();
		Learner nLearner = timeInLearner(eid);
		
		if (nLearner != null) {
			addLearner(nLearner);
		}
		addAnother();
	}
	
	private void addLearner(Learner learner) {
		mList.add(learner);
	}
	
	private void addAnother() {
		System.out.print("\nWould you like to enter another EID? (y/n) ");
		this.choice = scanner.nextLine();
		if(this.choice.equals("y")) {
			askLearner();
		} else if (this.choice.equals("n")) {
			displayAttendance();
			this.run = false;
			System.out.println("\nProgram exiting..");
			System.exit(0);
		} else {
			System.out.println("\nInvalid input");
			addAnother();
		}
	}
	
	private Learner timeInLearner(String eid) {
		LocalTime timeIn = LocalTime.now();
		
		Learner mLearner = new Learner(eid, timeIn);
		List<String> mNames = new ArrayList<String>(getNames());
		
		for (String mEid : mNames) {
			if (eid.equals(mEid)) {
				System.out.println("Learner '" + eid + "' already timed in.");
				return null;
			} 
		}
		
		System.out.println("Learner '" + eid + "' timed in at " + timeIn);
		return mLearner;
	}
	
	private void displayAttendance() {
		List<String> names = new ArrayList<String>(getNames());
		List<String> timeIns = new ArrayList<String>(getTimeIns());
		
		System.out.println("\nLearner's Attendance");
		for(int i=0; i<names.size(); i++) {
			System.out.println(i + " " + names.get(i) + "\t" + timeIns.get(i));
		}
	
	}

//Important helper method to System.out.println(mTracker.getArrayList());
	private List<String> getAll() {
		List<String> toRead = new ArrayList<String>();
		for (Learner learner : mList) {
			toRead.add(learner.toString());
		}
		return toRead;
	}
	
	private List<String> getNames() {
		List<String> namesList = new ArrayList<String>();
		for (Learner learner : mList) {
			String[] mLearner = learner.toString().split(",");
			namesList.add(mLearner[0]);
		}
		return namesList;
	}
	private List<String> getTimeIns() {
		List<String> timeInsList = new ArrayList<String>();
		for (Learner learner : mList) {
			String[] mLearner = learner.toString().split(",");
			timeInsList.add(mLearner[1]);
		}
		return timeInsList;
	}

}
