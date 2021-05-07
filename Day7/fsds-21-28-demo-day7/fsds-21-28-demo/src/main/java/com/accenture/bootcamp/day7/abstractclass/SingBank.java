package com.accenture.bootcamp.day7.abstractclass;

public class SingBank extends Bank {

	public SingBank(String bankName) {
		super(bankName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getInterestRate() {
		// TODO Auto-generated method stub
		return 9.5f;
	}

	@Override
	public void displayPromotionals() {
		System.out.println(this.getBankName() + ": Free latte for first 10 clients.");
		
	}

	@Override
	public void generateReport(double income) {
		System.out.println(this.getBankName() + ": " + income);
		
	}

}
