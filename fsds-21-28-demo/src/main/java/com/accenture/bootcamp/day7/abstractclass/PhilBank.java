package com.accenture.bootcamp.day7.abstractclass;

public class PhilBank extends Bank {

	public PhilBank(String bankName) {
		super(bankName);

	}

	@Override
	public float getInterestRate() {
		return 5.0f;
	}
	
	public void printDetails() {
		System.out.println(this.getBankName() + ": " + this.getInterestRate());
	}
	

}
