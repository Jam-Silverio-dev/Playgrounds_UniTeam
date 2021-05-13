package com.accenture.bootcamp.day10.playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoublesArray {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Double> doubleList = new ArrayList<Double>();
	private static double[] numbers;
	private static int choice;
	private static boolean run;

	public void start() {
		run = true;
		while(run != false) {
			addNumber(run);
		}
		chooseOperation();
	}

	private void addNumber(boolean run) {
			System.out.println("\nEnter a number");
			doubleList.add(scanner.nextDouble());
			scanner.nextLine();
//			System.out.println(doubleList);

			System.out.println("\nDo you like to add more? (Press 1 for yes/ Press 0 for no)");
			choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				addNumber(run);
			} else if (choice == 0) {
				run = false;
				displayNumbers();
				chooseOperation();
			} else {
				System.out.println("Invalid input");
				addNumber(true);
			}

			System.out.println("\nDo you like to try another operation? (Press 1 for yes/ Press 0 for no)");
			choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				chooseOperation();
			} else if (choice == 0) {
				scanner.close();
				System.out.println("Program exiting..");
				System.exit(0);
			}
	}

	private void displayNumbers() {
		numbers = new double[doubleList.size()];
		int i = 0;
		for (Double doubNum : doubleList) {
			numbers[i] = doubNum;
			i++;
		}
//		System.out.println("Your numbers are " + numbers[0] + "," + numbers[1]);
	}

	private void chooseOperation() {
		System.out.println("What would you like to compute for?");
		System.out.println("[0] compute the sum");
		System.out.println("[1] compute the average");
		System.out.println("[2] get the highest value");
		choice = scanner.nextInt();
		if (!(choice > 2)) {
			scanner.nextLine();
			
			switch(choice) {
				case 0:
					double sum = computeSum(numbers);
					System.out.println("Sum is " + sum);
					break;
				case 1:
					double ave = computeAve(numbers);
					System.out.println("Average is " + ave);
					break;
				case 2:
					double hv = getHighestValue(numbers);
					System.out.println("Highest value is " + hv);
			}
		} else {
			System.out.println("Invalid input");
			chooseOperation();
		}
		
		
	}
	
	private double computeSum(double[] numbers) {
		double sum = 0;
		for (double d : numbers) {
			sum += d;
		}
		return sum;
	}
	
	private double computeAve(double[] numbers) {
		return computeSum(numbers) / numbers.length;
	}
	
	private double getHighestValue(double[] numbers) {
		double hv = 0;
		for(int i=-1; i<numbers.length-1; i++) {
			if(hv > numbers[i+1]) {
				hv = numbers[i];
			} else {
				hv = numbers[i+1];
			}
		}
		return hv;
	}

}
