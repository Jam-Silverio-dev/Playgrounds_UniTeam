package com.accenture.bootcamp.day7.abstractclass;

import com.accenture.bootcamp.day7.interfaces.IBusinessStrategy;
import com.accenture.bootcamp.day7.interfaces.IReport;

/*
 * abstract class = it contains abstract method/s = methods that have no method body
 * it cannot be instantiated, cannot create objects of this class
 * purpose of this class is to be extended, to be a parent
 * often used a template class
 * should be related classes
 */

public abstract class Bank implements IBusinessStrategy, IReport {
	
	String bankName;

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public abstract float getInterestRate();		//abstract method
	
	public void printDetails() {
		System.out.println(this.getBankName() + ": " + this.getInterestRate());
	}

}
