package com.accenture.bootcamp.day7.inheritance;

/*
 * polymorphism in two ways:
 * 1. method overriding
 * 2. method overloading = methods with same name but with different parameters / signatures
 */

public class ClerkMain {

	public static void main(String[] args) {
		Clerk clerk1 = new Clerk();
		Clerk clerk2 = new Clerk(101, "Stella", 24);
		
		clerk1.printDetails();
		clerk2.printDetails();
		
		
		System.out.println();

	}

}
