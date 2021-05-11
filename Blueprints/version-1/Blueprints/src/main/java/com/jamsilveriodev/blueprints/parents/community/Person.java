package com.jamsilveriodev.blueprints.parents.community;

public abstract class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "My name is : " + this.name;
		
	}
	
	
	//Abstract methods here
	
	
}
