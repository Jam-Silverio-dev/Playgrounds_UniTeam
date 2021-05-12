package com.accenture.bootcamp.day9.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

	public static void main(String[] args) {
		File file = new File("C:/sample.txt");
		
		try {
			FileReader fr =  new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

		try {
			throwException();
		} catch (Exception e) {
			System.out.println("Exception caught...");
		}
		
		
		int[] array = {1,2,3,4};
		System.out.println(array[4]);		
		
		
		
	}

	
	public static void throwException() throws Exception {
		throw new Exception();
	}
	
	
}
