package com.accenture.bootcamp.day14.shoppingcart;

public class Customer extends Person{
	private ShoppingCart mCart;

	public Customer(String name) {
		super(name);
		
		//Don't forget to initialize the new ShoppingCart object
		mCart = new ShoppingCart();
	}

	public ShoppingCart getCart() {
		return mCart;
	}

	public void setCart(ShoppingCart cart) {
		this.mCart = cart;
	}
	
	public void addToCart(Item item) {
//		System.out.println(item);
		mCart.addItem(item);
	}
	
	public void removeFromCart(int index) {
		mCart.removeItem(index);
	}

	
}
