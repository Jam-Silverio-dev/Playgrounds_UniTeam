package com.jamsilveriodev.blueprints.subclasses.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.jamsilveriodev.blueprints.parents.community.Item;
import com.jamsilveriodev.blueprints.parents.community.ShoppingCart;

public class PCShoppingCart extends ShoppingCart {
	
	private List<Item> pcItemsList = new ArrayList<Item>();

	public PCShoppingCart() {
		//Empty Constructor
	}

	public List<Item> getPcItemsList() {
		return pcItemsList;
	}

	public void setPcItemsList(List<Item> pcItemsList) {
		this.pcItemsList = pcItemsList;
	}

	@Override
	public void addItem(Item item) {
		this.pcItemsList.add(item);
	}

	@Override
	public void removeItem(Item item) {
		int index = this.pcItemsList.indexOf(item);
		this.pcItemsList.remove(index);
	}

	@Override
	public double computeTotalPrice() {
		double sum = 0.0;

		for (Item item : pcItemsList) {
			sum += item.getPrice();
		}	
		return sum;
	}

	@Override
	public int getSize() {
		return this.pcItemsList.size();
	}
	
	


	
}
