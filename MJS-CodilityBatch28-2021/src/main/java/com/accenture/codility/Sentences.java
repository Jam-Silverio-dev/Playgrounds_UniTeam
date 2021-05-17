package com.accenture.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentences {

	public static void main(String[] args) {

		// PROBLEM
		/**
		 * Task 4 You would like to find the sentence containing the largest number of
		 * words in some given text. The text is specified as a string S consisting of N
		 * characters: letters, spaces, dots (. ), question marks (?) and exclamation
		 * marks (l).
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
		 * Assume that: • the length of S is within the range [1 ..100]; • string S
		 * consists only of letters (a-z, A-Z), spaces, dots (.), question marks (?) and
		 * exclamation marks.
		 * 
		 * In your solution, focus on correctness. The performance of your solution will
		 * not be the focus of the assessment. Copyright 2009—2021 by Codility Limited.
		 * All Rights Reserved. Unauthorized copying, publication or disclosure
		 * prohibited.
		 */
		String text1 = "We test coders. Give us a try? ";
//		String text2 = "Forget CVs..Save time . x x";
		String text3 = "Forget  CVs..Save time . x x";
//		String text4 = "We test coders. Give us a try? ";

//		System.out.println(solution(text1));
//		System.out.println(solution(text2));
		System.out.println(solution(text3));
//		System.out.println(solution(text4));
//		System.out.println(getHighestNumberOfWords(text1));
//		System.out.println(getHighestNumberOfWords(text2));
//		System.out.println(getHighestNumberOfWords(text3));
//		System.out.println(getHighestNumberOfWords(text4));
	}

	// COPY YOUR SOLUTION METHOD here without "static"

	public static int solution(String S) {
		String text = S;
		int tLength = text.length();

		
		if(tLength >=1 && tLength <=100) {
			List<Integer> minusList = extractedCountInSentences(text);
			List<Integer> numberOfWordsOfSentencesList = new ArrayList<Integer>();
	
			int highestNum = 0;
			int listLength = numberOfWordsOfSentencesList.size();
			for (int i=0; i<listLength;i++) {
				if(highestNum > numberOfWordsOfSentencesList.get(i)) {
					continue;
				} else {
					highestNum = numberOfWordsOfSentencesList.get(i);
				}
			}
			return highestNum;
		}
		
		return 0;
	}



	private static List<String> extractedSentencesInText(String text) {
		String[] sentencesInTextArray = text.split("[.!?]");
		List<String> mSentencesInTextArray = new ArrayList<String>();
		for(String sentence : sentencesInTextArray) {
			mSentencesInTextArray.add(sentence);
//				System.out.println(sentence);
		}
		System.out.println("These are unmodified mSentencesInTextArray" + mSentencesInTextArray);//[We test coders,  Give us a try,  ]
		return mSentencesInTextArray;
	}
	
	private static List<Integer> extractedCountInSentences(String text) {
		List<String> mSentencesInTextArray = extractedSentencesInText(text);
		List<Integer> wordsCounterList = new ArrayList<Integer>();
		int counter = 0;
		for(String sentence : mSentencesInTextArray) {
			String[] words = sentence.split(" ");
			if(words.equals("") || words.equals(" ") || words.equals("  ")) wordsCounterList.add(counter++);
		}
		System.out.println("These are remodified mSentencesInTextArray" + mSentencesInTextArray); //[We test coders,  Give us a try,  ]
		return wordsCounterList;
	}

	public static int getNumberOfSentences(String text) {
		String[] sentencesInText = text.replaceAll(" ", "").split("[.!?]");
		return sentencesInText.length;

	}
	
	public static int getNumberOfWords(String[] sentence) {
		return sentence.length;
	}
	
	
	
	
	//----------------------------------------------------------

	public static int getHighestNumberOfWords(String S) {
		//GOAL: Given a string S consisting of N characters, returns the maximum number
		//of words in a sentence.
		
		//#1 - Copy the parameter
		String text = S;
		int tLength = text.length();
//		System.out.println(tLength);
		
		if(tLength >=1 && tLength <=100) {
			//Proceed
				
			int numOfSentences = getNumberOfSentences(text);
			int numOfWordsASentence = 0;
			System.out.println("\nnumOfSentences is " + numOfSentences);
			System.out.println("numOfWordsASentence is " + numOfWordsASentence);

			String[] sentencesInTextArray = text.split("[.!?]");//[We test coders,  Give us a try,  ]
			System.out.println("Sentences in text array are " + Arrays.toString(sentencesInTextArray));
			
			
			//#2 - Save words per text in an ArrayList<Integer>
			List<Integer> numberOfWordsOfSentencesList = new ArrayList<Integer>();
			for(String sentence : sentencesInTextArray) {
				String[] wordsInSentence = sentence.trim().split(" ");
				numberOfWordsOfSentencesList.add(getNumberOfWords(wordsInSentence));
			}

			System.out.println(numberOfWordsOfSentencesList);
			
			//#3 - Compare highest number in the ArrayList<Integer>
			int highestNum = 0;
			int listLength = numberOfWordsOfSentencesList.size();
			for (int i=0; i<listLength;i++) {
				if(highestNum > numberOfWordsOfSentencesList.get(i)) {
					continue;
				} else {
					highestNum = numberOfWordsOfSentencesList.get(i);
				}
			}
			return highestNum;
		}
		
		return 0;
	}

//	public static int getNumberOfSentences(String text) {
//		String[] sentencesInText = text.trim().split("[.!?]");
//		return sentencesInText.length;
//
//	}
//	
//	public static int getNumberOfWords(String[] sentence) {
//		return sentence.length;
//	}

}
