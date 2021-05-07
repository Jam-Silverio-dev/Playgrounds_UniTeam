package com.accenture.bootcamp.day7.abstractclass;

import com.accenture.bootcamp.day7.interfaces.Retail;

public class BankMain {

	public static void main(String[] args) {
		
		//Bank bank = new Bank("My Bank");
		
		PhilBank pbank = new PhilBank("PH Bank");
		SingBank sbank = new SingBank("SG Bank");
		
		pbank.printDetails();
		sbank.printDetails();
		
		pbank.displayPromotionals();
		sbank.displayPromotionals();
		
		pbank.generateReport(100000);
		sbank.generateReport(200000);
		
		Retail rt = new Retail("RTW");
		rt.displayPromotionals();
		rt.generateReport(50000);
		
	}

}
