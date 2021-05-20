package com.accenture.bootcamp.day7.shoppingcart;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
	private Customer customer;
	private Cashier cashier;
	private List<Item> storeItems = new ArrayList<Item>(); 

	private int choice = 0;
	private String fileName = "src/main/java/com/accenture/bootcamp/day7/shoppingcart/store-items.csv";

	private List<String> saveName = new ArrayList<String>();
	private List<Double> savePrice = new ArrayList<Double>();

	private static Scanner sc = new Scanner(System.in);

	public Store(Customer customer, Cashier cashier) {
		this.customer = customer;
		this.cashier = cashier;
	}

	public static void main(String[] args) {

		System.out.println("****************WELCOME TO POWER PC****************");
		System.out.print("Dear Customer, please input your name >> ");
		String customerName = sc.nextLine();
		Customer customer = new Customer(customerName);
		
		LocalTime startOfShift = LocalTime.of(8,00);//8:00
		LocalTime endOfShift = LocalTime.of(18,00);//18:00
		Cashier cashier = new Cashier("John", startOfShift, endOfShift);
		LocalDate localdate = LocalDate.of(2020, 4, 7);
//		String date = localdate.toString();	//getDate()
		
		Store store = new Store(customer, cashier);
		store.shop();

	}
	
	
	public void shop() {
		// The main flow of the program is defined in this method. It must have the
		// scanner to get inputs from the user.


		System.out.println("\nHello " + customer.getName() + "! Please choose from the menu.");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Press [1] Add item | [2] Remove item | [3] Checkout | [0] Exit");
		System.out.println("-------------------------------------------------------------------");

		choice = sc.nextInt();
		selectChoice();

	}

	public void selectChoice() {

		switch (choice) {
		case 1:
			readStoreItemsFromFile(fileName);
			selectItem();
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
		// This method retrieves the store items data from store-items.csv
		File myObj = new File(fileName);
		try {
			sc = new Scanner(myObj);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] extractData = data.split(",");
				String productName = extractData[0].trim();
				double price = Double.parseDouble(extractData[1]);
				storeItems.add(new Item(productName, price));
			}

//			Iterator<String> iter1 = saveName.iterator();
//			Iterator<Double> iter2 = savePrice.iterator();
//			System.out.println(storeItems);
			System.out.println("Store Items");
			System.out.println("---------------------------------------------------------------");

			// List<Item> = new ArrayList<Item>(); // Implemented the interface
//			int i = 0;
//			while (iter1.hasNext()) {
//				String item = iter1.next();
//				double price = iter2.next();
//				System.out.println("[" + i + "] " + item + "\t" + price);
//				storeItems.add(new Item(item, price)); 
//				i++;
//			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("[0] - [" + (storeItems.size() - 1) + "] to select items");
			System.out.println("Select item to add: ");
//			System.out.println(storeItems);

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void selectItem() {
		Scanner sc2 = new Scanner(System.in);
		int choice = sc2.nextInt();
		sc2.nextLine();
		sc2.close();
//		System.out.println(storeItems.get(0));
//		System.out.println(storeItems.size());
		if (!(choice < 0 || choice >= storeItems.size())) {
			System.out.println(choice);
//			System.out.println(storeItems);
//			System.out.println(storeItems.get(choice));
		} else {
			System.out.println("Invalid input");
			// go back to shop()
		}
		try {
			System.out.println(storeItems.get(choice));
			customer.addToCart(storeItems.get(choice));//BUG
			System.out.println(customer.getCart());
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	public void printReceipt() {
		// Prints the receipt with System.out.print() on the screen
	}

	public void saveReceiptToFile(String filename) {
		// Saves the receipt to receipt.txt file
	}


}
