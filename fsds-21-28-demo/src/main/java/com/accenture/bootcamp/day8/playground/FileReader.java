package com.accenture.bootcamp.day8.playground;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/mark.julius.silverio/OneDrive - Accenture/Desktop/captmidn.txt");
		Scanner scan = new Scanner(file);
		
		String text = "";
		while(scan.hasNextLine()) {
			text = text.concat(scan.nextLine() + "\n");
		}
		System.out.println(text);
		
		scan.close();
		FileWriter writer = new FileWriter("C:/Users/mark.julius.silverio/OneDrive - Accenture/Desktop/newtext.txt");
		writer.write(text);
		writer.close();
	}

}
