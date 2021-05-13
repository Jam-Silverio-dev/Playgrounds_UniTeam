package com.accenture.bootcamp.day10.playground;

import java.time.LocalTime;

public class Learner {
	private String eid;
	private LocalTime timeIn;
	
	public Learner(String eid, LocalTime timeIn) {
		this.eid = eid;
		this.timeIn = timeIn;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public LocalTime getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(LocalTime timeIn) {
		this.timeIn = timeIn;
	}

	@Override
	public String toString() {
		return this.eid + "," + this.timeIn;
	}
	
}
