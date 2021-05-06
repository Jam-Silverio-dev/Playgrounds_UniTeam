package com.accenture.bootcamp.day5;

import java.util.Scanner;

/*
 * HOUSING
 * 
 * house model = Jasmine Model -> Block 1 --- CLASS
 * actual houses = 20 Jasmine houses --> Block 1 ---- OBJECTS
 * 
 * Student class ---> name, id, age
 * Student objects --> obj1 = john, 111, 30
 *     					obj2 = mark, 112, 20
 *     					obj3 = alice, 101, 12
 */

public class MethodsHelpingMainDemo {
	
	static Scanner input = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		MethodsHelpingMainDemo m1 = new MethodsHelpingMainDemo();

		int counter = MethodsHelpingMainDemo.askHowManyNumbers();
		
		int[] numbers = new int[ counter ];
		
		numbers = inputValues(numbers);
		
		displayMenu(numbers);
		
		m1.display();
		
	}

	private void display() {
		System.out.println("Instance method sample.");
		
	}

	private static void displayMenu( int[] numbers ) {
		int choice = 0;
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
				System.out.println("\nLargest value: " + largest( numbers ));
				break;
			}
			case 2: {
				System.out.println("\nSmallest value: " + smallest( numbers ));
				break;
			}
			case 3: {
				System.out.println("\nSum: " + getSum( numbers ));
				break;
			}
			case 4: {
				int result = getSum(numbers);
				System.out.println("\nAverage: " + (result / numbers.length) );
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

	private static int getSum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];		
		}
		return sum;
	}

	private static int smallest(int[] numbers) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if( smallest > numbers[i] ) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}

	private static int largest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if( largest < numbers[i] ) {
				largest = numbers[i];
			}
		}
		return largest;
	}

	private static int[] inputValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			numbers[i] = input.nextInt();
		}
		return numbers;
	}

	private static int askHowManyNumbers() {
		System.out.print("How many numbers do you want?: ");
		int count = input.nextInt();
		return count;
	}

}
