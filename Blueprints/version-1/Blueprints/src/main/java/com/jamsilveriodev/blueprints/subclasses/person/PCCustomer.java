package com.jamsilveriodev.blueprints.subclasses.person;

import com.jamsilveriodev.blueprints.parents.community.Person;
import com.jamsilveriodev.blueprints.subclasses.shoppingcart.PCShoppingCart;

public class PCCustomer extends Person {
	private PCShoppingCart pcscart;//= new PCShoppingCart(); move into a non-abstract method

	public PCCustomer(String name, PCShoppingCart pcscart) {
		super(name);
		this.pcscart = pcscart;
	}
	
	
	public PCShoppingCart getPcscart() {
		return pcscart;
	}


	public void setPcscart(PCShoppingCart pcscart) {
		this.pcscart = pcscart;
	}

	@Override
	public String toString() {
		return "I'm a PC Cashier. My name is " + getName() + 
				". My cart is " + getPcscart();
	}
	
	//Non-abstract methods here
	
	

}
