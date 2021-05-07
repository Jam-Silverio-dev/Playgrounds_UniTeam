package com.accenture.bootcamp.day6;

public class PBank extends Bank {

	public PBank(BankInfo info) {
		super(info);
	}

	@Override
	public int getRateOfInterest() {
		int interestRate = 6;
		return interestRate;
	}

	
}
