package com.accenture.bootcamp.day7.inheritance;

public class ClarkMain {

	public static void main(String[] args) {
		Clerk clerk1 = new Clerk();
		Clerk clerk2 = new Clerk(101, "Stella", 24);
		
		clerk1.printDetails();
		clerk2.printDetails();
		
		
		
	}

}
