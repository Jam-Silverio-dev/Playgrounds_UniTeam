package com.accenture.tcf.exercises.inheritance;

public class CompanyDemo {

	public static void main(String[] args) {
		Employee nEmployee = new Employee(101234, "John Peter", "john.peter@accenture.com", 20);
		Manager nManager = new Manager(10);
		
		nEmployee.printDetails();
		nManager.printDetails();

	}

}
