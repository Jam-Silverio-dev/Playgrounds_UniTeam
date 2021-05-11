package com.jamsilveriodev.blueprints.parents.community;


public abstract class Item {
	private String name;
	private double price;

	
	public Item(String name, double price) {
		//Important Constructor
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getName() + "\t" + getPrice();
	}
		
	
	//Abstract methods here
	public abstract void addItem(Item item);
	
	

	
	
	
}
