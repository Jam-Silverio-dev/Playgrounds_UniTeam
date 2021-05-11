package com.jamsilveriodev.blueprints.subclasses.person;

import java.time.LocalTime;

import com.jamsilveriodev.blueprints.parents.community.Person;

public class PCCashier extends Person {
	private LocalTime startOfShift;
	private LocalTime endOfShift;
	
	public PCCashier(String name, LocalTime startOfShift, LocalTime endOfShift) {
		super(name);
		this.startOfShift = startOfShift;
		this.endOfShift = endOfShift;
	}
	

	public LocalTime getStartOfShift() {
		return startOfShift;
	}



	public void setStartOfShift(LocalTime startOfShift) {
		this.startOfShift = startOfShift;
	}



	public LocalTime getEndOfShift() {
		return endOfShift;
	}



	public void setEndOfShift(LocalTime endOfShift) {
		this.endOfShift = endOfShift;
	}



	@Override
	public String toString() {
		return "I'm a PC Cashier. My name is " + getName() + 
				". My start of shift is on " + getStartOfShift() + 
				". My end of shift is on " + getEndOfShift();
	}
	
	
	//Non-abstract methods here
	
	
	

}
