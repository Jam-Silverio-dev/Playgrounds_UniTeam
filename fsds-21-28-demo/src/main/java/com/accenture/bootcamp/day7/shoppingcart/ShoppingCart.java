package com.accenture.bootcamp.day7.shoppingcart;

import java.util.ArrayList;
import java.util.List;

//public class ShoppingCart {
//	private List<Item> items = new ArrayList<Item>();

	public ShoppingCart() {
	}

	public List<Item> getItems() {
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
