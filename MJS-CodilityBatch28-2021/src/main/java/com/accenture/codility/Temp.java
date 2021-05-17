package com.accenture.codility;

import java.util.ArrayList;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		// PROBLEM
		
		/**
		 * Task 4 You would like to find the sentence containing the largest number of
		 * words in some given text. The text is specified as a string S consisting of N
		 * characters: letters, spaces, dots (. ), question marks (?) and exclamation
		 * marks (!).
		 * 
		 * The text can be divided into sentences by splitting it at dots, question
		 * marks and exclamation marks. A sentence can be divided into words by
		 * splitting it at spaces. A sentence without words is valid, but a valid word
		 * must contain at least one letter.
		 * 
		 * For example, given S = "We test coders. Give us a try? ", there are three
		 * sentences: "We test coders", " Give us a try" and "". The first sentence
		 * contains three words: "We", "test" and "coders".
		 * 
		 * The second sentence contains four words: "Give", "us", "a" and "try". third
		 * sentence is empty.
		 * 
		 * Write a function: class Solution { public int solution(String S); }
		 * 
		 * that, given a string S consisting of N characters, returns the maximum number
		 * of words in a sentence.
		 * 
		 * For example, given S = "We test coders. Give us a try? the function should
		 * return 4, as explained above.
		 * 
		 * Given S = "Forget CVs.. Save time . x x", the function should return 2, as
		 * there are four sentences: "Forget CVs" (2 words), (0 words), "Save time " (2
		 * words) and " x x" (2 words).
		 * 
		 * Assume that: 
		 * • the length of S is within the range [1 ..100]; 
		 * • string S consists only of letters (a-z, A-Z), spaces, dots (.), question marks (?) and
		 * exclamation marks.
		 * 
		 * In your solution, focus on correctness. The performance of your solution will
		 * not be the focus of the assessment. Copyright 2009—2021 by Codility Limited.
		 * All Rights Reserved. Unauthorized copying, publication or disclosure
		 * prohibited.
		 */

		// PROBLEM
		/**
		 * Task 3 6h 1 5min English A string is called balanced when every letter
		 * occurring in the string, appears both in upper- and lowercase. For example,
		 * the string "CATattac" is balanced ('a', 'c' and t' occur in both cases), but
		 * "Madam" is not ('d' and 'a' appear only in lowercase). Note that the number
		 * of occurrences does not matter.
		 * 
		 * Write a function: class Solution { public int solution(String S); }
		 * 
		 * that, given a string S of length N, returns the length of the shortest
		 * balanced fragment of S. If S does not contain any balanced fragments, the
		 * function should return -1.
		 * 
		 * Examples: 1. Given S = "azABaabza", the function should return 5. The
		 * shortest balanced fragment of S is "ABaab". 2. Given s - " - TacoCat", the
		 * function should return -1. There is no balanced fragment. 3. Given s - " -
		 * AcZCbaBz", the function should return 8. The shortest balanced fragment is
		 * the whole string. 4. Given S = "abcdefghijklmnopqrstuvwxyz", the function
		 * should return -1 .
		 * 
		 * Assume that: • N is an integer within the range [1..200]; • string S consists
		 * only of letters ('a'-'z' and/or 'A-'Z).
		 * 
		 * In your solution, focus on correctness. The performance of your solution will
		 * not be the focus of the assessment. Copyright 2009—2021 by Codility Limited.
		 * All Rights Reserved. Unauthorized copying, publication or disclosure
		 * prohibited.
		 */

		List<String> mList = new ArrayList<String>();
		mList.add("a");
		mList.add("b");
		mList.add(" ");
		mList.add("d");
		mList.add("e");
		System.out.println(mList + "\n");
		mList.remove("e");
		mList.remove(" ");
		String word = " ";
		for (String string : mList) {
			if(word.matches(string)) {
				mList.remove(string);
			}
		}
		
		System.out.println(mList + "\n");
	}

	// COPY YOUR SOLUTION METHOD here without "static"

	public static String solution(String S, int[] A) {
		
		//SOLUTION
		
		return 0;
	}
}
