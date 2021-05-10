package com.accenture.bootcamp.day7.inheritance;

import com.accenture.bootcamp.day6.Employee;

public class Clerk extends Employee{

	//Considered complete. Because you don't have to rewrite all the 
	//previous codes.
	
	//Overriding methods of parent and grandparent.
	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Position: Clerk");
	}

	@Override
	public String toString() {
		return super.toString() + "Position: Clerk";
	}

	
	
	
}
