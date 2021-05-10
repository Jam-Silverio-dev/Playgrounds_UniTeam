package com.accenture.bootcamp.day6;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		Employee emp2 = new Employee(100, "Mark", 24);
		
		
		emp1.setId(101);
		emp1.setName("Jane");
		emp1.setAge(25);
		
		emp2.setId(102);
		emp2.setName("John");
		emp2.setAge(23);
		
		emp1.printDetails();
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		
		
		
	}



}
