package com.accenture.bootcamp.day7.shoppingcart;

import java.util.List;

public class ShoppingCart {
	private List<Item> items;

	public ShoppingCart() {
		//Empty constructor
	}

	public List<Item> getItems() {
		return (List<Item>) items;
	}
	
	public void addItem(List<Item> item) {
		items.add((Item) item);
	}
	
	public void removeItem(List<Item> item) {
		
		items.remove((Item) item);
	}
	
	public double computeTotalPrice() {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPrice();
		}
		return total;
	}
	
	

}
