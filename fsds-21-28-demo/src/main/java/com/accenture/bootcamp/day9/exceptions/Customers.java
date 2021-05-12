package com.accenture.bootcamp.day9.exceptions;

public class Customers {

	public void findCustomer(String customerId) throws CustomerNotFoundException {
		if ("1001".equals(customerId)) {
			System.out.println("Customer is found, displaying records....");
		} else {
			throw new CustomerNotFoundException("Customer not found for id: " + customerId);

		}

	}

}
