package com.accenture.tcf.exercises.inheritance;

public class Manager {
	private int numberOfReportees;

	public Manager(int numberOfReportees) {
		this.numberOfReportees = numberOfReportees;
	}

	public int getNumberOfReportees() {
		return numberOfReportees;
	}
	
	public void printDetails() {
		System.out.println("Number of Reportees : " + getNumberOfReportees());
	}
}
