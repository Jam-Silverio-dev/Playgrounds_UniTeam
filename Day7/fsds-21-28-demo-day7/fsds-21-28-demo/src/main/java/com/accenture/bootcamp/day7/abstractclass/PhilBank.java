package com.accenture.bootcamp.day7.abstractclass;

public class PhilBank extends Bank {

	public PhilBank(String bankName) {
		super(bankName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getInterestRate() {
		return 5.0f;
	}

	@Override
	public void displayPromotionals() {
		System.out.println(this.getBankName() + ": Free iced tea for first 10 clients.");
		
	}

	@Override
	public void generateReport(double income) {
		System.out.println(this.getBankName() + ": " + income);
		
	}

}
