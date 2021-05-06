package com.accenture;

import java.util.Scanner;

public class CommandLineCalculator {

	public static Scanner sc = new Scanner(System.in);
	public static int choice = 0;
	public static double a = 0;
	public static double b = 0;
	public static double result = 0;
	
	public static void main(String[] args) {

		while(true) {
			menu();
			selectOperation();
		}
	}
	
	
	public static void menu() {
		System.out.println("\n***MENU***");
		System.out.println("1-Add");
		System.out.println("2-Subtract");
		System.out.println("3-Multiply");
		System.out.println("4-Divide");
		System.out.println("5-Exit the program");
		
	}
	
	
	public static void selectOperation() {
		System.out.println("\nSelect function to perform.");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("You choose to Add.");
				inputTwoNumbers("add");
				break;
			case 2:
				System.out.println("You choose to Subtract.");
				inputTwoNumbers("subtract");
				break;
			case 3:
				System.out.println("You choose to Multiply.");
				inputTwoNumbers("multiply");
				break;
			case 4:
				System.out.println("You choose to Divide.");
				inputTwoNumbers("divide");
				break;
			case 5:
				System.out.println("Program exiting..");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input.");
				selectOperation();
				break;
		}
				
	}

	public static void inputTwoNumbers(String operation) {
		System.out.println("\nPlease input two numbers.");
		double[] nums = new double[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("number" + (i+1) + " >>");
			nums[i] = sc.nextDouble();
		}
		
		a = nums[0];
		b = nums[1];
		
		System.out.println("The first number is " + a + " and the second number is " + b +".");
		
		switch(operation) {
			case "add":
				result = a + b;
				break;
			case "subtract":
				result = a - b;
				break;
			case "multiply":
				result = a * b;
				break;
			case "divide":
				result = a / b;
				break;
		}
		System.out.println("\nCalculating...");
		System.out.println(">>The answer is: " + result);
		
		
	}

}
