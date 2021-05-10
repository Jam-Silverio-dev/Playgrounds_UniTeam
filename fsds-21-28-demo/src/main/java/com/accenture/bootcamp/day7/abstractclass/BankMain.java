package com.accenture.bootcamp.day7.abstractclass;

public class BankMain {

	
	public static void main(String[] args) {
		
		PhilBank pbank = new PhilBank("PH Bank");
		SingBank sbank = new SingBank("SG Bank");
		
		pbank.printDetails();
		sbank.printDetails();
	}
}
