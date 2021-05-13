package com.accenture.playground;

public class ReverseAString {

	public static void main(String[] args) {
//		reverseWithoutReturn("hello");
//		System.out.println(reverseWithReturn("hello"));
		System.out.println(reverseRecursive("Family"));

		StringBuilder sb = new StringBuilder();
		String text = "hello";
		sb.append(text).reverse();
		System.out.println(sb);
	}

	//hello -> olleh
	public static void reverseWithoutReturn(String text) {
		int len = text.length();
		int mlen = len;
		String[] strArray = new String[len];
		
		for(int i=0;i<len;i++) {
			strArray[i] = text.substring(mlen-1, mlen);
//			System.out.println(strArray[i]);
			mlen--;
		}

		String newText = "";
		for(String s : strArray) {
			newText += s;
		}
		System.out.println(newText);
	}
	
	//hello -> olleh
	public static String reverseWithReturn(String text) {
		int len = text.length();
		int mlen = len;
		String[] strArray = new String[len];
		
		for(int i=0;i<len;i++) {
			strArray[i] = text.substring(mlen-1, mlen);
//			System.out.println(strArray[i]);
			mlen--;
		}

		String newText = "";
		for(String s : strArray) {
			newText += s;
		}
		

		return newText;
	}
	
	public static String reverseRecursive(String origText) {
		if(origText.length()==1 || origText.equals("")) {
			return origText;
		}
		
		
		int numberOfRecursions = origText.length()/2;
		int counter = 0;
		String nText = "";
		
		String text = origText;
		String first = origText.substring(0,1);
		String middle = origText.substring(1, text.length()-1);
		String last = origText.substring(text.length()-1, text.length());
		
		String temp = first;
		first = last;
		last = temp;
//		System.out.println("\nNew first is: '" + first + "'");
//		System.out.println("Middle is still: '" + middle + "'");
//		System.out.println("New last is: '" + last + "'");

		counter++;
		nText = first + middle + last;
//		System.out.println("My new text is: '" + nText + "'");
		
		if (counter != numberOfRecursions) {
			nText = first + reverseRecursive(middle) + last;
//			System.out.println("My new text is: '" + nText + "'");
			return nText;
		} else {
			nText = first + middle + last;
//			System.out.println("My new text is: '" + nText + "'");
			return nText;
		}
		
		
	}
	
	public static boolean isNumberGreaterThan0(int num) {
		return (num>0) ? true : false;
	}
	
	
	

}
