package com.accenture.tcf.codingassessment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Candy implements Comparable<Candy> {
	private String name;
	private String color;
	private int sweetnessLevel;

	private List<Candy> candies = new ArrayList<Candy>();
	private boolean run;
	private String bChoice;
	private int choice;
	private Scanner scanner = new Scanner(System.in);

	public void start() {
		run = true;
		while (run != false) {
			addCandies();
		}

	}

	public List<Candy> getCandies() {
		return candies;
	}

	public void addCandies() {
		System.out.println("Enter a new candy>>");
		System.out.print("\tCandy-name: ");
		String cName = scanner.nextLine();
		System.out.print("\tColor: ");
		String cColor = scanner.nextLine();
		System.out.print("\tSweetness Level: ");
		int cSweetLevel = scanner.nextInt();
		scanner.nextLine();
		candies.add(new Candy(cName, cColor, cSweetLevel));
		wantAnother();
	}

	private void wantAnother() {
		this.bChoice = "n";
		System.out.print("Do you want to add another? (y/n) ");
		this.bChoice = scanner.nextLine();
		if (this.bChoice.equals("y")) {
			addCandies();
		} else if (bChoice.equals("n")) {
			this.run = false;
//			candyOperations();
		} else {
			wantAnother();
		}

	}

	private void candyOperations() {
		this.choice = 0;
		System.out.println("\nWhat operation do you want to do with your candies? ");
		System.out.println("[0] Sort by name");
		System.out.println("[1] Sort by color");
		System.out.println("[2] Sort by sweetness level");
		choice = scanner.nextInt();
		scanner.nextLine();
		if (!(choice > 2)) {
			switch (choice) {
			case 0:
				sortByName(candies);
				break;
			case 1:
				sortByColor(candies);
				break;
			case 2:
				sortBySweetness(candies);
				break;
			}
		}

	}

	public void sortByName(List<Candy> candies) {
		System.out.println(candies);
		
		Collections.sort(candies);

	}


	public void sortByColor(List<Candy> candies) {
		System.out.println(candies);
		

	}
	
	public void sortBySweetness(List<Candy> candies) {
		System.out.println(candies);

	}
	
	
	public Candy() {
		// Empty constructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSweetnessLevel() {
		return sweetnessLevel;
	}

	public void setSweetnessLevel(int sweetnessLevel) {
		this.sweetnessLevel = sweetnessLevel;
	}

	public Candy(String name, String color, int sweetnessLevel) {
		this.name = name;
		this.color = color;
		this.sweetnessLevel = sweetnessLevel;
	}

	
	public int compareTo(Candy o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return this.name + "," + this.color + "," + this.sweetnessLevel;
	}

	public List<String> getCandyNames(List<Candy> candies) {
		List<String> mCandyNames = new ArrayList<String>();
		for (Candy candy : candies) {
			String[] nCandy = candy.toString().split(",");
			mCandyNames.add(nCandy[0]);
		}
		return mCandyNames;
	}

	public List<String> getCandyColors(List<Candy> candies) {
		List<String> mCandyColors = new ArrayList<String>();
		for (Candy candy : candies) {
			String[] nCandy = candy.toString().split(",");
			mCandyColors.add(nCandy[1]);
		}
		return mCandyColors;
	}

	public List<String> getCandySLevels(List<Candy> candies) {
		List<String> mCandySLevels = new ArrayList<String>();
		for (Candy candy : candies) {
			String[] nCandy = candy.toString().split(",");
			mCandySLevels.add(nCandy[2]);
		}
		return mCandySLevels;
	}


	public int compare(Candy o1, Candy o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
