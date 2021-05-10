package com.accenture.bootcamp.day6.playgrounds;

public class Manager {
	private int numberOfReportees;

	
	public Manager(int numberOfReportees) {
		this.numberOfReportees = numberOfReportees;
	}

	public int getNumberOfReportees() {
		return numberOfReportees;
	}

	public void setNumberOfReportees(int numberOfReportees) {
		this.numberOfReportees = numberOfReportees;
	}
	
	
	public void printDetails() {
		System.out.println("\nNumber of Reportees : " + this.getNumberOfReportees());
		
	}
	
	
	

}
