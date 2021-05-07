package com.accenture.bootcamp.day6;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee(100, "John Smith", 20);

		emp1.setId(101);
		emp1.setName("Jane Doe");
		emp1.setAge(25);

		emp1.printDetails();
		emp2.printDetails();
		
		//toString() - method from the Object class that is triggered by using the reference variable alone
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		System.out.println("There are now " + Employee.getCount() + " employees added so far.");
		
		emp1.printDetails();

	}

}
