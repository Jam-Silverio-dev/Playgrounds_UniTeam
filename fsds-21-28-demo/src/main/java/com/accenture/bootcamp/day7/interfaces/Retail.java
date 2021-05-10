package com.accenture.bootcamp.day7.interfaces;

public class Retail implements IBusinessStrategy, IReport {
	String name;
	

	public Retail(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void generateReport(double income) {
		System.out.println(this.getName() + ": free t-shirt for first 20 clients");
		
	}

	public void displayPromotionals() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
