package com.accenture.bootcamp.day7.inheritance;

import com.accenture.bootcamp.day6.Employee;

/*
 * subclass, child class, derived class
 * superclass, parent class, base class
 */

public class Clerk extends Employee {

	public Clerk() {
		super();
	}

	public Clerk(int id, String name, int age) {
		super(id, name, age);
	}

	//method overriding
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Position: Clerk");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Position: Clerk";
	}	
	
}
