package com.accenture.bootcamp.day8.playground.take2;

import java.time.LocalTime;

public class AttendanceTrackerMain {

	private static AttendanceTracker aTracker = new AttendanceTracker();
	
	public static void main(String[] args) {
		
		aTracker.addLearner(new Learner("m.j.s", LocalTime.now()));
		aTracker.addLearner(new Learner("j.d.s", LocalTime.now()));
		aTracker.addLearner(new Learner("k.d.s", LocalTime.now()));
		aTracker.addLearner(new Learner("r.p.s", LocalTime.now()));
		aTracker.addLearner(new Learner("y.d.s", LocalTime.now()));
		
		aTracker.toString();
	}

}
