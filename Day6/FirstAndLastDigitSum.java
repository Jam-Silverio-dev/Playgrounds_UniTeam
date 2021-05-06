package com.accenture.bootcamp.day6;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));//4
		System.out.println(sumFirstAndLastDigit(257));//9
		System.out.println(sumFirstAndLastDigit(0));//0
		System.out.println(sumFirstAndLastDigit(5));//10
		System.out.println(sumFirstAndLastDigit(-10));//-1
	}

	public static int sumFirstAndLastDigit(int number) {
		int x = 0;
		int y = 0;
		
		String numberInString = String.valueOf(number);
		char X = numberInString.charAt(0);//2-52
		char Y = numberInString.charAt(numberInString.length() - 1);//25-2
//		System.out.println(X);
//		System.out.println(Y);
		x = Character.getNumericValue(X);
		y = Character.getNumericValue(Y);
//		System.out.println(x);
//		System.out.println(y);
		return x + y;
	}

}
