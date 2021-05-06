package com.accenture.bootcamp.day4;

import java.util.Scanner;

import com.accenture.bootcamp.day5.MethodsDemo;

public class ControlStructuresDemo {

	public static void main(String[] args) {
		
		//control structures = execution flow
		//process of solving the problem (how)
		//sequential, selection, repetition
		
		//problem = specific number of repetition = FOR (counter-controlled repetition)
		       // = ? of repetition = WHILE / DO-WHILE (sentinel-controlled repetition)
		       // while(x != 5) {do this}
		
		/*
		 * Create a menu-based program that displays the following menu items:
		 * 1. Get largest value
		 * 2. Get smallest value
		 * 3. Compute the sum
		 * 4. Compute the average
		 * 5. Terminate the program
		 */
		
		//ARRAYS = store multiple values/variables of the same type under one name
		//an array contains indexed variable
		//syntax: dataType[] varName = new dataType[length];
		
		MethodsDemo.display();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you want?: ");
		int count = input.nextInt();
		
		int[] numbers = new int[count];		//array of 'count' integers

		int choice = 0;
		
		//indexed variables - from index zero up to index length-1 (0 - 9)
		//numbers[0] = 5;
		//numbers[1] = 10;
		//numbers[9] = 20;
		
		//System.out.println("numbers[0] = " + numbers[0]);
		
		//assign values to array numbers
		System.out.println("Input 10 numbers...");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			numbers[i] = input.nextInt();
		}
		
		//access the values
		System.out.print("\nThe values are: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		//get the largest value
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if( largest < numbers[i] ) {
				largest = numbers[i];
			}
		}
		
		//get the smallest value
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if( smallest > numbers[i] ) {
				smallest = numbers[i];
			}
		}
		
		//get the sum
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];		//compound assignment statement --> sum = sum + numbers[i];
		}
		
		int average = sum / numbers.length;
		
		do {
			System.out.println("\n\nM E N U");
			System.out.println("1. Get largest value");
			System.out.println("2. Get smallest value");
			System.out.println("3. Compute the sum");
			System.out.println("4. Compute the average");
			System.out.println("5. Terminate the program");
			System.out.print("\nEnter your choice: ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("\nLargest value: " + largest);
				break;
			}
			case 2: {
				System.out.println("\nSmallest value: " + smallest);
				break;
			}
			case 3: {
				System.out.println("\nSum: " + sum);
				break;
			}
			case 4: {
				System.out.println("\nAverage: " + average);
				break;
			}
			case 5: {
				System.out.println("\nProgram terminating...");
				System.exit(0);
			}
			default: {
				System.out.println("\nInvalid Input...");
				break;
			}
			}
		} while ( choice != 5 );
		
	}
}
