package com.jamsilveriodev.blueprints.parents.community;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {

	private List<Item> itemsList = new ArrayList<Item>();
	
	public ShoppingCart() {
		//Empty constructor
	}

	public List<Item> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<Item> itemsList) {
		this.itemsList = itemsList;
	}
	
	public void addItem(Item item) {
		this.itemsList.add(item);
	}
	
	public void removeItem(Item item) {
		int index = this.itemsList.indexOf(item);
		this.itemsList.remove(index);
	}
	
	public double computeTotalPrice() {
		double sum = 0.0;

		for (Item item : itemsList) {
			sum += item.getPrice();
		}	
		return sum;
	}
	
    public int getSize() {
    	return this.itemsList.size();
    }
	
	//Abstract methods here
	
	
}
