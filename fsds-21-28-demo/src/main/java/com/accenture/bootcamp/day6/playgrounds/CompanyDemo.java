package com.accenture.bootcamp.day6.playgrounds;

public class CompanyDemo {

	public static void main(String[] args) {
		
		Employee nEmployee = new Employee(101234, "John Peter", "john.peter@accenture.com", 20);
		Employee nEmployee2 = new Employee(101234, "John Peter");
		Manager nManager = new Manager(10);
		
		nEmployee.printDetails();
		nManager.printDetails();
		
		

		
		/**
		 * Encapsulation
		 * 
		 * Composition
		 * 
		 * Inheritance
		 * Grandparent(Object)Default - Parent1 extends (only 1)/implements (multiple) interface- Children1/Subclass - Children11
		 * 								Parent2 extends (only 1)/implements (multiple) interface- Children2/Subclass - Children22
		 *
		 * 
		 * Polymorphism
		 * -Overriding (Run-time polymorphism) - @Override
		 * -Overloading (Compile-time polymorphism)
		 */
		
	}

}
