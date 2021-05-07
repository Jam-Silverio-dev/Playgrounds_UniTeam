package com.accenture.bootcamp.day6;

//immutable class - String
//structured programming - problem - HOW --> processes/functions
//object-oriented programming - problem - WHAT (objects) NOUNS --> HOW
//encapsulation = attributes (private) + methods (public)

public class Employee {
	
	//static variable --> owned by the class
	static int count = 0;
	
	//state, instance variables, data members, attributes
	//default access = package age
	private int id;
	private String name;
	private int age;
	
	//constructor - no-arg constructor
	public Employee() {
		count++;
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		//validation code
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}
	
	public void printDetails() {
		System.out.println("Employee: " + this.getId() + " " + this.getName() + " " 
										+ this.getAge());
	}

	@Override
	public String toString() {

		return "Employee: " + this.getId() + " " + this.getName() + " " 
				+ this.getAge();
	}
	
	

}
