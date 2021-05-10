package com.accenture.bootcamp.day8.lambdaexpr;

import com.accenture.bootcamp.day7.interfaces.IBusinessStrategy;
import com.accenture.bootcamp.day7.interfaces.IReport;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		//anonymous inner class
		IBusinessStrategy ibs = new IBusinessStrategy() {
			
			@Override
			public void displayPromotionals() {
				// TODO Auto-generated method stub
				
			}
		};
		

		ibs.displayPromotionals();
		//public void displayPromotionals();
		IBusinessStrategy ibs2 = () -> {  System.out.println("Free milk tea.");};
	
	
	
		IReport ir = (income) -> { 
			System.out.println("Income for April 2021");
		};
	
		ir.generateReport(100000);
	
	}
	
	

}
