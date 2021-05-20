package com.accenture.bootcamp.day14.shoppingcart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public final class Utils {
	
	private static List<String> receiptList = new ArrayList<String>();

	public static List<Item> getInventoryItemsFromFile(String theFileName) {
		// Info: This method retrieves the store items data from store-items.csv
		List<Item> inventoryItems = new ArrayList<Item>();

		File myObj = new File(theFileName);
		try {
			Scanner sc = new Scanner(myObj);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] extractData = data.split(",");
				String productName = extractData[0].trim();
				double price = Double.parseDouble(extractData[1]);
				inventoryItems.add(new Item(productName, price));
			}
			sc.close();
			System.out.println("Store Items");
			System.out.println("---------------------------------------------------------------");

			int i = 0;
			for (Item item : inventoryItems) {
				String[] itemDetails = item.toString().split(",");
				String theItem = itemDetails[0];
				double price = Double.parseDouble(itemDetails[1]);
				System.out.println("[" + i + "] " + theItem + "\t" + price);
				i++;
			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("[0] - [" + (inventoryItems.size() - 1) + "] to select items");
			System.out.println("Select item to add: ");
			return inventoryItems;
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			return inventoryItems;
		}

	}

	public static void printInventoryItemsFromFile(String theFileName) {
		// Info: This method retrieves the store items data from store-items.csv
		List<Item> inventoryItems = new ArrayList<Item>();

		File myObj = new File(theFileName);
		try {
			Scanner sc = new Scanner(myObj);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] extractData = data.split(",");
				String productName = extractData[0].trim();
				double price = Double.parseDouble(extractData[1]);
				inventoryItems.add(new Item(productName, price));
			}
			sc.close();
			System.out.println("Store Items");
			System.out.println("---------------------------------------------------------------");

			int i = 0;
			for (Item item : inventoryItems) {
				String[] itemDetails = item.toString().split(",");
				String theItem = itemDetails[0];
				double price = Double.parseDouble(itemDetails[1]);
				System.out.println("[" + i + "] " + theItem + "\t" + price);
				i++;
			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("[0] - [" + (inventoryItems.size() - 1) + "] to select items");
			System.out.println("Select item to add: ");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void selectItemToAddToCart(List<Item> storeItems, Customer customer) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		sc.nextLine();

//		System.out.println(storeItems.get(0));
//		System.out.println(storeItems.size());
		if (!(choice < 0 || choice >= storeItems.size())) {
			System.out.println("You choose item #" + choice + " " + storeItems.get(choice).getName() + " and price of " + storeItems.get(choice).getPrice());
//			System.out.println(storeItems);
//			System.out.println(storeItems.get(choice));
		} else {
			System.out.println("Invalid input\n");
			selectItemToAddToCart(storeItems, customer);
			choice = 0;
			// go back to shop()
		}
		try {
		// BUG BEFORE
		customer.addToCart(storeItems.get(choice));
//		System.out.println(customer.getCart().toString());
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

	public static void selectItemToRemoveFromCart(Customer customer) {
		System.out.print("\nSelect item to remove: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.nextLine();
		System.out.println("You choose item [" + option + "]");
		customer.removeFromCart(option);
	}

	public static void printAddedItemsFromCart(Customer customer) {
		// Info: This method retrieves and prints the items added on cart
		int size = customer.getCart().getItems().size();
		if (size != 0 && size > 0) {
			String[] toRemove = new String[size];
			int i = 0;
			for (Item item : customer.getCart().getItems()) {
				toRemove[i] = "[" + i + "]" + item.getName() + "\t" + item.getPrice();
				System.out.println(toRemove[i]);
				i++;
			}
		} else {
			// If cart size == 0
			System.out.println("\nCart is empty. No items to remove.\n");
		}

	}

	public static void printReceipt(Cashier cashier, Customer customer) {
		// Store current output from here

		// Prints the receipt with System.out.print() on the screen
		System.out.println("\n-----------------------------------------------------------------------");
		System.out.println("                                 RECEIPT                               ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Cashier: " + cashier.getName() + "\tShift: " + cashier.getStartOfShift() + " - "
				+ cashier.getEndOfShift());
		System.out.println("Date: " + LocalDate.of(2020, 04, 07));
		System.out.println("-----------------------------------------------------------------------");

		// Print checkout items from cart
		checkoutItemsFromCart(customer);

		System.out.println("-----------------------------------------------------------------------");

	}

	public static void checkoutItemsFromCart(Customer customer) {
		System.out.println("Items:");
		System.out.println("\tItem name \t\t\tQty \tPrice \tTotal Price");

		List<String> checkoutList = new ArrayList<String>();
		for (Item item : customer.getCart().getItems()) {
			checkoutList.add(item.toString());
		}

		// Sort list according to uniqueness and alphabetical
		Set<String> al = new TreeSet<String>(checkoutList);

		// Checking for quantity per item
		List<Integer> itemQuantityList = new ArrayList<Integer>();
		for (String item : al) {
			itemQuantityList.add(getHowManyQuantityPerItem(item, checkoutList));
		}
//		System.out.println("itemQuantityList is " + itemQuantityList);

		// Printing items and prices
		List<Double> totalPrices = new ArrayList<Double>();
		int i = 0;
		for (String item : al) {
			String[] info = item.split(",");
			String getName = info[0];
			if (getName.length() < 16) {
				getName += "\t";
			}
			double getPrice = Double.parseDouble(info[1]);

//			System.out.println("itemQuantityList.get(" + i + ") is " + itemQuantityList.get(i));

			System.out.println("\t" + getName + "\t\t" + itemQuantityList.get(i) + "\t" + getPrice + "\t"
					+ itemQuantityList.get(i) * getPrice);

			totalPrices.add(itemQuantityList.get(i) * getPrice);

			// Important: i++
			i++;
		}

		System.out.println("-----------------------------------------------------------------------");

		double cTotal = gettotalPrice(totalPrices);
		System.out.println("TOTAL: " + cTotal);

	}

	private static double gettotalPrice(List<Double> totalPrices) {
		double total = 0.0;

		for (double d : totalPrices) {
			total += d;
		}
		return total;
	}

	public static int getHowManyQuantityPerItem(String item, List<String> list) {
		// Make sure Collections.sort alphabetically work

		int counter = 0;
		// 1 pass only
		for (String cItem : list) {
			if (item.equals(cItem)) {
//				System.out.println("item is " + item + "and cItem is " + cItem);
				counter++;
			}
//			System.out.println("Counter is " + counter);
		}
//		System.out.println("Final Counter is " + counter);
		int quantity = counter;
		return quantity;
	}
	
	public static void saveReceiptToFile(String exportName) throws IOException {
		// Saves the receipt to receipt.txt file
	
		//Recreating receipt
//		System.out.println(receiptList);
		for(String s: receiptList) {
			//Check if all in receiptList are present
//			System.out.println(s);
		}

		System.out.println("\nTHANK YOU COME BACK AGAIN!");
		
		System.out.println("\nPrinting receipt..");
		
		
		FileWriter writer = new FileWriter(exportName); 
		for(String str: receiptList) {
		  writer.write(str + "\n");
		}
		writer.close();
		
		
	}
	



	public static void recreatingReceipt(Cashier cashier, Customer customer) {
		receiptList.add("\n-----------------------------------------------------------------------");
		receiptList.add("                                 RECEIPT                               ");
		receiptList.add("-----------------------------------------------------------------------");
		receiptList.add("Cashier: " + cashier.getName() + "\tShift: " + cashier.getStartOfShift() + " - "
				+ cashier.getEndOfShift());
		receiptList.add("Date: " + LocalDate.of(2020, 04, 07));
		receiptList.add("-----------------------------------------------------------------------");

		// Print checkout items from cart
//		checkoutItemsFromCart(customer);
		receiptList.add("Items:");
		receiptList.add("\tItem name \t\t\tQty \tPrice \tTotal Price");

		List<String> checkoutList = new ArrayList<String>();
		for (Item item : customer.getCart().getItems()) {
			checkoutList.add(item.toString());
		}

		// Sort list according to uniqueness and alphabetical
		Set<String> al = new TreeSet<String>(checkoutList);

		// Checking for quantity per item
		List<Integer> itemQuantityList = new ArrayList<Integer>();
		for (String item : al) {
			itemQuantityList.add(getHowManyQuantityPerItem(item, checkoutList));
		}
//		System.out.println("itemQuantityList is " + itemQuantityList);

		// Printing items and prices
		List<Double> totalPrices = new ArrayList<Double>();
		int i = 0;
		for (String item : al) {
			String[] info = item.split(",");
			String getName = info[0];
			if (getName.length() < 16) {
				getName += "\t";
			}
			double getPrice = Double.parseDouble(info[1]);

//			System.out.println("itemQuantityList.get(" + i + ") is " + itemQuantityList.get(i));

			receiptList.add("\t" + getName + "\t\t" + itemQuantityList.get(i) + "\t" + getPrice + "\t"
					+ itemQuantityList.get(i) * getPrice);

			totalPrices.add(itemQuantityList.get(i) * getPrice);

			// Important: i++
			i++;
		}
		
		

		receiptList.add("-----------------------------------------------------------------------");

//		gettotalPrice(totalPrices);
		double total = 0.0;

		for (double d : totalPrices) {
			total += d;
		}

		
		double cTotal = total;

		receiptList.add("TOTAL: " + cTotal);
		
	}

	public static void executionFinishedWithoutErrors() {
		receiptList.clear();
		System.out.println("Exiting program...");
//		System.out.println(">>EXECUTION FINISHED WITH NO ERRORS.");
		System.exit(0);
	}



}
