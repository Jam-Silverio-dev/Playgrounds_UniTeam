package com.accenture.bootcamp.day7.abstractclass;

public class SingBank extends Bank {

	public SingBank(String bankName) {
		super(bankName);
	}

	@Override
	public float getInterestRate() {
		return 9.5f;
	}

	public void printDetails() {
		System.out.println(this.getBankName() + ": " + this.getInterestRate());
	}
}
