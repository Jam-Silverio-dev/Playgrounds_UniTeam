package com.accenture.bootcamp.day7.abstractclass;

import com.accenture.bootcamp.day7.interfaces.IBusinessStrategy;
import com.accenture.bootcamp.day7.interfaces.IReport;

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
	
	
	public abstract float getInterestRate();
}
