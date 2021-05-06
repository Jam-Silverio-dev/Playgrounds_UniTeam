package com.accenture.bootcamp.day6;

public class Bank {

	private BankInfo info;

	public Bank(BankInfo info) {
		this.info = info;
	}
	
	
	public BankInfo getInfo() {
		return info;
	}



	public void setInfo(BankInfo info) {
		this.info = info;
	}



	public void displayInterestRate() {
		System.out.println(this.info + "'s interest rate is " + getRateOfInterest() + "%.");
	}
	
	public int getRateOfInterest() {
		int interestRate = 5;
		return interestRate;
	}
	
	
}
