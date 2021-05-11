package com.jamsilveriodev.blueprints.subclasses.item;

import java.util.ArrayList;
import java.util.List;

import com.jamsilveriodev.blueprints.parents.community.Item;

public class PCItems extends Item {
	
	private List<Item> pcItemsList = new ArrayList<Item>();
	
	public PCItems() {
		super(null, 0);
	}
	
	public PCItems(String name, double price) {
		//Important Constructor
		super(name, price);
	}

	public List<Item> getPcItemsList() {
		return this.pcItemsList;
	}

	public void setPcItemsList(List<Item> pcItemsList) {
		this.pcItemsList = pcItemsList;
	}

    public void printpcItemsList() {
        System.out.println("You have " + pcItemsList.size() + " items in your grocery list");
        for(int i=0; i< pcItemsList.size(); i++) {
            System.out.println((i+1) + ". " + pcItemsList.get(i));
        }
    }
    
    public int getSize() {
    	return this.pcItemsList.size();
    }

	@Override
	public void addItem(Item item) {
		// TODO 
		
	}

    

	
	

}
