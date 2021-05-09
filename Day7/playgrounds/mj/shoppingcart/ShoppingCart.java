package com.accenture.bootcamp.day7.shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> items;

	public ShoppingCart() {
		//Empty constructor
	}

	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		
		items.remove(item);
	}
	
	public double computeTotalPrice() {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPrice();
		}
		return total;
	}
	
	

}
