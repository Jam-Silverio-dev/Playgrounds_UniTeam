package com.accenture.bootcamp.day9.exceptions;

import org.apache.commons.lang3.time.StopWatch;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		StopWatch myStopWatch = new StopWatch();
		
		myStopWatch.start();
		
		Customers cust = new Customers();
		try {
			cust.findCustomer("1001");
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		myStopWatch.stop();
		System.out.println("Time is: " + myStopWatch.getTime() + " millis");
	}

}
