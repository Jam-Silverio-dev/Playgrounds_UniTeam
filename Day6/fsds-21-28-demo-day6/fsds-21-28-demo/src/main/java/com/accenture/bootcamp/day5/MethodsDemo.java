package com.accenture.bootcamp.day5;

/*
 * methods = block of code that performs a ONE specific function or operation or process.
 * 
 * 1. void method w/o parameter
 * 2. void method w/ parameter
 * 3. value returning method w/o parameter
 * 4. value returning method w/ parameter
 * 
 * static methods/variables = owned by the CLASS
 * instance methods/variables = owned by the OBJECT instance
 */

public class MethodsDemo {

	public static void main(String[] args) {
		
		display();					// displays, prompts
		display("John");
		int result = getSum();
		System.out.println("Sum: " + getSum());
		
		System.out.println("Sum: " + getSum(100, 200));

	}

	public static int getSum(int i, int j) {
		return i + j;
	}

	public static int getSum() {
		int sum = 10 + 20;
		return sum;
	}

	public static void display(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static void display() {
		System.out.println("Displaying something...");
	}

}
