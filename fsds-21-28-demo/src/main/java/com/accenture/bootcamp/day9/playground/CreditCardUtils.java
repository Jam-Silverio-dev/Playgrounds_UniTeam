package com.accenture.bootcamp.day9.playground;

public class CreditCardUtils {
	
	public static String mask(String ccNumber) {
		return "XXXXXXXXXXXX" + ccNumber.substring(ccNumber.length()-4);
	}

}
