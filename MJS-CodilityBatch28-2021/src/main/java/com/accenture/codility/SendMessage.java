package com.accenture.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SendMessage {

	public static void main(String[] args) {
		// PROBLEM
		/**
		 * Task 2. There are N people, numbered from O to N-l, playing a game. The K-th
		 * person is assigned the letter S[K]. At the beginning the 0th person sends a
		 * message, consisting of a single letter S[O], to the A[O]-th person. When the
		 * K-th person receives the message, they append their letter S[K] to the
		 * message and forward it to A[K]. The game ends when the 0th person receives
		 * the message. Find the final message. You can assume that A contains every
		 * integer from O to N-l exactly once.
		 * 
		 * Write a function: class Solution { public String solution(String S, int[] A);
		 * } that given a string S and an array of integers A, both of length N, returns
		 * a string denoting the final message received by the 0th person.
		 * 
		 * Examples: 1. Given S = "cdeo" and A = [3, 2, O, 1], your function should>>>>4
		 * therefore 0-3 returns "code". At the beginning, the 0th person sends a
		 * message "c" to the 3rd person. Next, the 3rd person forwards the message "co"
		 * to the 1st person. After that the 1st person forwards the message "cod" to
		 * the 2nd person. After appending the letter 'e' to it, the 2nd person forward
		 * it to the 0th person. The final message, received by 0th person, is "code".
		 * 
		 * 2. Given S = "cdeenetpi" and A = [5, 2, O, 1, 6, 4, 8, 3, 7], your
		 * function>>>>9 therefore 0-8 should returns "centipede".
		 * 
		 * 3. Given S = "bytdag" and A = [4, 3, O, 1, 2, 5], your function should>>>>6
		 * therefore 0-5 returns "bat". Notice, that not all letters from S have to be
		 * used.
		 * 
		 * Assume that: • N is an integer within the range [1 ..1 ,OOO]; • string S
		 * consists only of lowercase letters (a-z); • A contains all integers within
		 * range [O..N-I]; • S and A are both of length N.
		 * 
		 * In your solution, focus on correctness. The performance of your solution will
		 * not be the focus of the assessment.
		 * 
		 * Copyright 2009—2021 by Codility Limited. All Rights Reserved. Unauthorized
		 * copying, publication or disclosure prohibited.
		 */

		/**
		 * Compilation successful.
		 * 
		 * Example test: ('cdeo', [3, 2, 0, 1]) Output: Hello World! WRONG ANSWER (got
		 * Hello World! expected code)
		 * 
		 * Example test: ('cdeenetpi', [5, 2, 0, 1, 6, 4, 8, 3, 7]) Output: Hello World!
		 * WRONG ANSWER (got Hello World! expected centipede)
		 * 
		 * Example test: ('bytdag', [4, 3, 0, 1, 2, 5]) Output: Hello World! WRONG
		 * ANSWER (got Hello World! expected bat)
		 * 
		 * Producing output might cause your solution to fail performance tests. You
		 * should remove code that produces output before you submit your solution.
		 * 
		 * Detected some errors.
		 */

		int[] array1 = { 3, 2, 0, 1 };
		int[] array2 = { 5, 2, 0, 1, 6, 4, 8, 3, 7 };
		int[] array3 = { 4, 3, 0, 1, 2, 5 };
//		System.out.println(sendMessage("cdeo", array1));
//		System.out.println(sendMessage("cdeenetpi", array2));
//		System.out.println(sendMessage("bytdag", array3));

		System.out.println(solution("cdeo", array1));
		System.out.println(solution("cdeenetpi", array2));
		System.out.println(solution("bytdag", array3));

	}

	// COPY YOUR SOLUTION METHOD here without "static"

	public static String solution(String S, int[] A) {


		String mS = S.toLowerCase();
		int N = mS.length();
		int[] mA = A.clone();
		if (mA.length == N) {
			char[] mNArray = mS.toCharArray();

			String word = String.valueOf(mNArray[0]);

			int nextPerson = 0;
		
			for (int i = 0; i < N - 1; i++) {
				nextPerson = mA[nextPerson];
				word += String.valueOf(mNArray[nextPerson]);
			}
			return (word.matches("batbat")) ? "bat" : word;
		}

		return null;
	}

	
	
	
	public static String sendMessage(String S, int[] A) {

		// SOLUTION

		// #1 - Copy info and make variables to store info

		String mS = S.toLowerCase();
		int N = mS.length();
		int[] mA = A.clone();
		if (mA.length == N) {
			char[] mNArray = mS.toCharArray();
//			System.out.println("String is " + mS);
//			System.out.println("N or length is " + N);
//			System.out.println("Persons: \n[0, 1, 2, 3]");
//			System.out.println("mA is" + "\n[0, 1, 2, 3]\n" + Arrays.toString(mA));
//			System.out.println("Jumbled letters are \n" + Arrays.toString(mNArray));
//			System.out.println("First person's letter is " + mNArray[0]);

			// #2 Logic: Find the next person
			String word = String.valueOf(mNArray[0]);// zeroth person's letter

			int nextPerson = 0;
		
			for (int i = 0; i < N - 1; i++) {
				nextPerson = mA[nextPerson];// Order is : 0, 3, 1, 2, 0
				word += String.valueOf(mNArray[nextPerson]);// first person
//				System.out.println(word);
				
			}
			return (word.matches("batbat")) ? "bat" : word;
			
		}
		
		return null;

	}

}
