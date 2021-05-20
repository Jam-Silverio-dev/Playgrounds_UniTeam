package com.accenture.bootcamp.day14.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> itemsOnCart = new ArrayList<Item>();

	public ShoppingCart() {
	}

	public List<Item> getItems() {
		return itemsOnCart;
	}
	
	public void addItem(Item item) {
//		System.out.println(item);
		itemsOnCart.add(item);
	}
	
	public void removeItem(int index) {
		//Important remove by index not by object occurrence
//		System.out.println(itemsOnCart);
		itemsOnCart.remove(index);
//		System.out.println(itemsOnCart);
	}
	
	public double computeTotalPrice() {
		double total = 0.0;
		for (Item item : itemsOnCart) {
			total += item.getPrice();
		}
		return total;
	}

	//Important Logging End-point
	@Override
	public String toString() {
		return "ShoppingCart [itemsOnCart=" + itemsOnCart + "]";
	}
	
	
}
