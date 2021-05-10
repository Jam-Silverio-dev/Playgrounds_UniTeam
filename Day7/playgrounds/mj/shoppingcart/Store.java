package com.accenture.bootcamp.day7.shoppingcart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
	private Customer customer;
	private Cashier cashier;
	private List<Item> storeItems;
	
	private static int choice = 0;
	private static String fileName = "src/main/java/com/accenture/bootcamp/day7/shoppingcart/store-items.csv";
	
	ArrayList<String> saveName = new ArrayList<String>();
	ArrayList<Double> savePrice = new ArrayList<Double>();
	
	Scanner sc = new Scanner(System.in);
	
	public Store(Customer customer, Cashier cashier) {
		this.customer = customer;
		this.cashier = cashier;
	}
	
	public void shop() {
		//The main flow of the program is defined in this method. It must have the scanner to get inputs from the user.

		System.out.println("\nHello " + customer.getName() + "! Please choose from the menu.");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Press [1] Add item | [2] Remove item | [3] Checkout | [0] Exit");
		System.out.println("-------------------------------------------------------------------");
		
		choice = sc.nextInt();
		selectChoice();

		
	}

	public void selectChoice() {

		switch(choice) {
			case 1: 
				readStoreItemsFromFile(fileName);
				break;
			case 2:
				int size = customer.getCart().getItems().size();
				String[] toRemove = new String[size];
				for (Item item : customer.getCart().getItems()) {
					int i = 0;
					toRemove[i] = "[" + i + "]" + item + item.getPrice();
					System.out.println(toRemove[i]);
					i++;
				}
				
				System.out.print("Select item to remove: ");
				choice = sc.nextInt();
				customer.removeFromCart(storeItems.get(choice));
				break;
			case 3:
				printReceipt();
				saveReceiptToFile(fileName);
				break;
			case 0:
				System.out.println("Exiting program...");
				sc.close();
				System.exit(0);

		
		}
	}
	
	public void readStoreItemsFromFile(String filename) {
		//This method retrieves the store items data from store-items.csv
		File myObj = new File(fileName);
		try {
		    sc = new Scanner(myObj);
		    while (sc.hasNextLine()) {
		    	String data = sc.nextLine();
		    	  
			    String[] extractData = data.split(",");
			    String productName = extractData[0].trim();
			    double price = Double.parseDouble(extractData[1]);
			    saveName.add(productName);
			    savePrice.add(price);          
		      }
			
			Iterator<String> iter1 = saveName.iterator();
			Iterator<Double> iter2 = savePrice.iterator();
			
			System.out.println("Store Items");
			System.out.println("---------------------------------------------------------------");
			
			storeItems = new ArrayList<Item>();//List<Item> = new ArrayList<Item>(); // Implemented the interface
			while (iter1.hasNext()) {
				String item = iter1.next();
				double price = iter2.next();
				System.out.println(item + " " + price);
				storeItems.add(new Item(item, price)); 
			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("[0] - [6] to select items");

			
			System.out.println("\nSystem exiting...");
			System.exit(0);
			
			//TODO
			System.out.println("Select item to add: ");

		      
		 } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		 }
		
	}
	
	public void printReceipt() {
		//Prints the receipt with System.out.print() on the screen
	}
	
	public void saveReceiptToFile(String filename) {
		//Saves the receipt to receipt.txt file
	}
	
	
}
