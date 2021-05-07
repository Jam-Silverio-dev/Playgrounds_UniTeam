package com.accenture.bootcamp.day6;

public class SBank extends Bank {

	public SBank(BankInfo info) {
		super(info);
	}

	@Override
	public int getRateOfInterest() {
		int interestRate = 8;
		return interestRate;
	}
	

}
