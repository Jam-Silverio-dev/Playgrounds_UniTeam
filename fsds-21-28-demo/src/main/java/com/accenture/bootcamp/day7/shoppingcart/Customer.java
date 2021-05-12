package com.accenture.bootcamp.day7.shoppingcart;

import java.util.List;

public class Customer extends Person {
	private ShoppingCart cart;
	

	public Customer(String name) {
		super(name);
	}

	public ShoppingCart getCart() {
		return cart;
	}


	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	public void addToCart(List<Item> item) {
		cart.addItem((List<Item>) item);
	}
	
	public void removeFromCart(Item item) {
		cart.removeItem((List<Item>) item);
	}
	
	

}
