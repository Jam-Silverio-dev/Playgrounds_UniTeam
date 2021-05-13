package com.jamsilveriodev.blueprints.program;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import com.jamsilveriodev.blueprints.parents.community.Item;
import com.jamsilveriodev.blueprints.subclasses.item.PCItems;
import com.jamsilveriodev.blueprints.subclasses.person.PCCashier;
import com.jamsilveriodev.blueprints.subclasses.shoppingcart.PCShoppingCart;
import com.jamsilveriodev.blueprints.subclasses.store.PCStore;

public class MyApp {

	private static Scanner scanner = new Scanner(System.in);
	private static PCCashier pccashier = new PCCashier("John", LocalTime.of(8,00), LocalTime.of(18,00));
	private static PCItems pcitems = new PCItems();
	private static PCShoppingCart pcscart = new PCShoppingCart();

	private static List<String> itemName = new ArrayList<String>();
	private static List<Double> itemPrice = new ArrayList<Double>();
	private static List<Item> items = new ArrayList<Item>();
	private static List<String> finalItems1 = new ArrayList<String>();
	private static List<String> finalItems2 = new ArrayList<String>();
	private static List<String> export = new ArrayList<String>();
	private static String pathI = "src/main/java/com/jamsilveriodev/blueprints/program/store-items.csv";
//	private static String pathO = "src/main/java/com/jamsilveriodev/blueprints/program/receipt.txt";
	private static String pathO = "C:/Users/Jam-Silverio-dev/Desktop/receipt.txt";
	

	public static void main(String[] args) {

		try {
			File textfile = new File(pathI);
			Scanner fileReader = new Scanner(textfile);
			while (fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
//				System.out.println(data);
				String[] getData = data.split(",");
				String name = getData[0].trim();
				double price = Double.parseDouble(getData[1]);
				itemName.add(name);
				itemPrice.add(price);
			}
			for (int i = 0; i < itemName.size(); i++) {
				// Correct Code
				items.add(new PCItems(itemName.get(i), itemPrice.get(i)));
			}

			addAll();

		} catch (Exception e) {
			System.out.println("File not found..");
		}

		boolean quit = false;
		int choice = 0;

		printInstructions();
		chooseFromMenu();
	}

	public static void chooseFromMenu() {
		boolean quit = false;
		int choice;
		while (!quit) {
			choice = scanner.nextInt();
			scanner.nextLine();

			if (!(choice < 0 || choice >= 4)) {
				switch (choice) {
				case 1:
					addItem();
					break;
				case 2:
					removeItem();
					break;
				case 3:
					checkout();
					try {
						exportReceipt();
					} catch (IOException e) {
						System.out.println("Receipt cannot be printed.");
					}
					System.exit(0);
					break;
				case 0:
					quit = true;
					scanner.close();
					System.out.println("Program is exiting..");
					System.exit(0);
					break;
				}
			} else {
				System.out.println("Invalid input");
				printInstructions();
				chooseFromMenu();
			}

		}
	}

	public static void printInstructions() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Press [1] Add item | [2] Remove item | [3] Checkout | [0] Exit");
		System.out.println("------------------------------------------------------------------");
	}

	public static void addAll() {
		pcitems.setPcItemsList(items);
//		groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void addItem() {
		printPCItems();
		System.out.println("[0] - " + "[" + (pcitems.getSize() - 1) + "] to select items");
		System.out.println("Select item to add: ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		if (!(choice >= pcitems.getSize() || choice < 0)) {
			pcscart.addItem(pcitems.getPcItemsList().get(choice));
			printPCItemsOnCart();
		} else {
			System.out.println("Invalid input");
			printInstructions();
		}

	}

	public static void removeItem() {
		if (pcscart.getSize() == 0) {
			printCartIsEmpty();
		} else {
			printPCItemsOnCart();
			System.out.print("Select item to remove: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			if (!(choice >= pcscart.getSize() || choice < 0)) {
				pcscart.removeItem(pcscart.getPcItemsList().get(choice));
				if(pcscart.getSize() == 0) {
					printCartIsEmpty();
				} else {
					printPCItemsOnCart();
				}
				

			} else {
				System.out.println("Invalid input");
				printInstructions();
			}
		}
		
	}

	public static void checkout() {
		System.out.println("Checking out..");
		System.out.println("------------------------------------------------------------------");
		System.out.println("                            RECEIPT                               ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Cashier: " + pccashier.getName() + "\tShift: " + pccashier.getStartOfShift() + " - " + pccashier.getEndOfShift());
		System.out.println("Date: " + LocalDate.of(2020,05,12));
		System.out.println("------------------------------------------------------------------");
		System.out.println("Items:");
		System.out.println("  Item name    \t\t\tPrice\t\tQty\t\tTotal Price");
		
		printReceipt();
		System.out.println("TOTAL: " + pcscart.computeTotalPrice());
		System.out.println("\n\nTHANK YOU AND COME BACK AGAIN!");
	}

	public static void printPCItems() {
		System.out.println("Store Items");
		System.out.println("------------------------------------------------------------------");
		for (int i = 0; i < pcitems.getSize(); i++) {
			System.out.println("[" + i + "] " + pcitems.getPcItemsList().get(i));
		}
		System.out.println("------------------------------------------------------------------");
	}

	public static void printPCItemsOnCart() {
		System.out.println("Cart Items");
		System.out.println("------------------------------------------------------------------");
		for (int i = 0; i < pcscart.getSize(); i++) {
			System.out.println("[" + i + "] " + pcscart.getPcItemsList().get(i).toString());
		}
		printInstructions();
	}
	
	public static void printReceipt() {
		List<String> items = new ArrayList<String>();
		for (int i = 0; i < pcscart.getSize(); i++) {
			items.add(pcscart.getPcItemsList().get(i).toString());
		}
		

		TreeSet<String> ts1 = new TreeSet<String>(items);

		List<Integer> uniqueItems = new ArrayList<Integer>();
		
		Iterator<String> it1 = ts1.iterator();
		while (it1.hasNext()) {
			String item = it1.next();
			finalItems1.add(item);
		}
		
		

		
		Collections.sort(items);
		int[] duplicates = countForDuplicates(items, uniqueItems);
		TreeSet<String> ts2 = new TreeSet<String>(items);
		Iterator<String> it2 = ts2.iterator();
		int k = 0;
		while (it2.hasNext()) {
			String item = it2.next();
			double price = Double.parseDouble(item.substring(item.length()-7, item.length()));
			finalItems2.add("  " + item + "\t\t\t" + duplicates[k] + "\t\t" + (duplicates[k] * price));
			k++;
		}
		

		
		System.out.println("------------------------------------------------------------------");
		for (String item : finalItems2) {
			System.out.println(item);
		}
		System.out.println("------------------------------------------------------------------");
	}

	private static int[] countForDuplicates(List<String> items, List<Integer> itemsList) {
		int counter = 0;
		for (int i=0; i<items.size()-2; i++) {
			for (int j = -1; j<items.size()-1; j++) {
				if (items.get(i).equals(items.get(j+1))) {
					counter ++;
				} else {
					counter = 0;
				}
			}
			itemsList.add(counter);
			counter = 0;
		}
		
		int[] itemsArray = new int[itemsList.size()];
		for (int num = 0; num < itemsList.size(); num++) {
			itemsArray[num] = itemsList.get(num);
		}
		
		return itemsArray;
	}
	
	public static void printCartIsEmpty() {
		System.out.println("Cart is empty. No items to remove.");
		printInstructions();
	}
	
	public static void exportReceipt() throws IOException {
		
		export.add("------------------------------------------------------------------");
		export.add("                            RECEIPT                               ");
		export.add("------------------------------------------------------------------");
		export.add("Cashier: " + pccashier.getName() + "\tShift: " + pccashier.getStartOfShift() + " - " + pccashier.getEndOfShift());
		export.add("Date: " + LocalDate.of(2020,05,12));
		export.add("------------------------------------------------------------------");
		export.add("Items:");
		export.add("  Item name    \t\t\tPrice\t\tQty\t\tTotal Price");
		export.add("------------------------------------------------------------------");
		
		for (String item : finalItems2) {
			export.add(item);
		}
		export.add("------------------------------------------------------------------");
		
		
		String fileContent = "";
		for (String line : export) {
			fileContent += line;
		}
		
		FileWriter writer = new FileWriter(pathO);
		writer.write(fileContent);
		writer.close();

	}

}
