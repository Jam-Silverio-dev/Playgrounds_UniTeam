package com.accenture.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentences2 {
	public static void main(String[] args) {

		String text1 = "We test coders. Give us a try? ";
		
		String text3 = "Forget  CVs..Save time . x x";


//		System.out.println(solution(text1));

		System.out.println(solution(text3));
	}
	
	public static int solution(String S) {
		String text = S;
		int tLength = text.length();
		
		
		
		
		//#2 - Save words per text in an ArrayList<Integer>
		String[] sentencesInTextArray = text.split("[.!?]");//[We test coders,  Give us a try,  ]
		System.out.println("Sentences in text array are " + Arrays.toString(sentencesInTextArray));
		List<Integer> numberOfWordsOfSentencesList = new ArrayList<Integer>();
		List<Integer> counterToSubractList = new ArrayList<Integer>();
		List<String[]> sentenceList = new ArrayList<String[]>();
		String[] wordsInSentence1 = null;
		for(String sentence : sentencesInTextArray) {
			wordsInSentence1 = sentence.trim().split(" ");//[[We, test, coders],  [Give, us, a, try,  ]]
			sentenceList.add(wordsInSentence1);
			System.out.println(wordsInSentence1.toString());
		}
		
		int i = 0;
		int counter = 0;
		for (String[] string : sentenceList) {
			if(string[i].equals("") || string[i].equals(" ") || string[i].equals("  ")) {
				counterToSubractList.add(counter++);
				counter++;
			}
		}			
		System.out.println("counterToSubractList is " + counterToSubractList);

		numberOfWordsOfSentencesList.add(getNumberOfWords(wordsInSentence1));
		
		List<Integer> finalNumberOfWordsList = new ArrayList<Integer>();
//		for(Integer i : )

		System.out.println(numberOfWordsOfSentencesList);
		
		return findingHighestNoOfWords(numberOfWordsOfSentencesList);
		
	}

	private static Integer getNumberOfWords(String[] wordsInSentence) {
		int numOfWords = 0;
		
		return numOfWords;
	}

	private static int findingHighestNoOfWords(List<Integer> numberOfWordsOfSentencesList) {
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

}
