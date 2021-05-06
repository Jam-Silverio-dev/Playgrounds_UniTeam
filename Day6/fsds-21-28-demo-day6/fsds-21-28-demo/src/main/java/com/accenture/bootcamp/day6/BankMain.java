package com.accenture.bootcamp.day6;

public class BankMain {

	public static void main(String[] args) {
		BankInfo bInfo = new BankInfo();
		bInfo.setName("BDO");
		Bank mBank = new Bank(bInfo);
		mBank.displayInterestRate();
		
		bInfo.setName("BPI");
		SBank sBank = new SBank(bInfo);
		sBank.displayInterestRate();
		
		bInfo.setName("Metrobank");
		PBank pBank = new PBank(bInfo);
		pBank.displayInterestRate();

	}

}
