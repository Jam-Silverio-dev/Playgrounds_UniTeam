package com.accenture.bootcamp.day14.shoppingcart;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

	private Customer customer;
	private Cashier cashier;
	private List<Item> storeItems;
	
	private String fileName = "src/main/java/com/accenture/bootcamp/day14/shoppingcart/store-items.csv";
	private String exportName = "src/main/java/com/accenture/bootcamp/day14/shoppingcart/receipt.txt";
	
	public Store() {
		
		//Initialize Cashier
		cashier = new Cashier("John", 
				LocalTime.of(8,00), 
				LocalTime.of(18,00));
		
		//Initialize Store Parameterized Constructor
		Store mStore = new Store(cashier);
		
	}
	
	public Store(Cashier cashier) {
		this.cashier = cashier;
	}

	
	public void shop() {
		boolean app_run = true;
		//Welcoming customer
		String customerName = welcomingCustomer();
		
		//Initialize Customer
		initializeCustomer(customerName);
		
		//Important looping procedure: While-loop
		//Choose from menu
		while(app_run) {
			mainMenu();
			selectChoice(chooseOptions());
		}
		
		Utils.executionFinishedWithoutErrors();	
	}




	private String welcomingCustomer() {
		System.out.println("****************WELCOME TO POWER PC****************");
		System.out.print("Dear Customer, please input your name >> ");
		Scanner sc = new Scanner(System.in);
		String customerName = sc.nextLine();
		return customerName;
	}

	private void initializeCustomer(String customerName) {
		
		//Initializing customer, new Customer
		customer = new Customer(customerName);
//		System.out.println("Hello " + customer.getName());
	}

	private void mainMenu() {
		System.out.println("\nHello " + customer.getName() + "! Please choose from the menu.");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Press [1] Add item | [2] Remove item | [3] Checkout | [0] Exit");
		System.out.println("-------------------------------------------------------------------");

	}

	private int chooseOptions() {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.nextLine();
		if (!(option < 0 || option > 3)) {
			System.out.println("Your choice is " + option);
			return option;
		} else {
			System.out.println("Invalid input");
			mainMenu();

			return -1;
		}

	}

	private void selectChoice(int choice) {

		switch (choice) {
		case 1:
			//[1] Add item
			storeItems = new ArrayList<Item>(Utils.getInventoryItemsFromFile(fileName));
			Utils.selectItemToAddToCart(storeItems, customer);
			break;
		case 2:
			//[2] Remove item
			
			//Print added items from cart
			Utils.printAddedItemsFromCart(customer);

			//Select item to remove from cart
			Utils.selectItemToRemoveFromCart(customer);

			break;
		case 3:
			//[3] Checkout	
			
			//Print receipt
			//Starts to print from this
			Utils.printReceipt(cashier, customer);
			
			// Recreating receipt by adding to receiptList
			Utils.recreatingReceipt(cashier, customer);
			
			//Save receipt to file
			try {
				Utils.saveReceiptToFile(exportName);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//Exit
			Utils.executionFinishedWithoutErrors();	
			break;
		case 0:
			//[0] Exit
			Utils.executionFinishedWithoutErrors();	

		}
	}
	
	
	
}
