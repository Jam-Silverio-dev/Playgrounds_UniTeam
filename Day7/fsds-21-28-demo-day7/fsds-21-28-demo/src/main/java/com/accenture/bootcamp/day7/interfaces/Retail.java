package com.accenture.bootcamp.day7.interfaces;

public class Retail implements IBusinessStrategy, IReport  {
	
	String name;

	public Retail(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void displayPromotionals() {
		System.out.println(this.getName() + ": free shirts for first 10 clients.");
		
	}

	@Override
	public void generateReport(double income) {
		System.out.println(this.getName() + ": " + income);
		
	}
	
	

}
