package com.accenture.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence3 {
	public static void main(String[] args) {

		String text1 = "We test coders. Give us a try? ";

		String text3 = "Forget  CVs..Save time . x x";

		System.out.println(solution(text1));

//		System.out.println(solution(text3));
	}

	public static int solution(String S) {
		String text = S;
		int tLength = text.length();
		String[] sentencesInTextArray = text.split("[.!?]");// [We test coders, Give us a try, ]
		int sLength = sentencesInTextArray.length;
		System.out.println(sLength);
		System.out.println("Sentences in text array are " + Arrays.toString(sentencesInTextArray));

		String[][] deepArray = new String[sLength][0];
		int position = 0;
		List<Integer> mCounter = new ArrayList<Integer>();
		List<String> mFinalList = new ArrayList<String>();
		int[] counter = new int[sLength];
		for (int i = 0; i < sLength; i++) {
			deepArray[i] = sentencesInTextArray[i].split(" ");
			System.out.println(Arrays.toString(deepArray[i]));

			for (String word : deepArray[i]) {
				String finalWord = word.trim();
				System.out.println("Final word is '" + finalWord + "'");
				mFinalList.add(finalWord);
				counter[i] = deepArray[i].length;
			}

		}
		System.out.println(Arrays.toString(counter));
		System.out.println(mFinalList);

		for (int i = 0; i < sLength; i++) {
			deepArray[i] = sentencesInTextArray[i].split(" ");
//			System.out.println(Arrays.toString(deepArray[i]));

			for (String word : deepArray[i]) {
				String finalWord = word.trim();
//				System.out.println("Final word is '" + finalWord + "'");
				mFinalList.add(finalWord);
				counter[i] = deepArray[i].length;
			}

		}

		List<Integer> fCounter = new ArrayList<Integer>();
		for(int i =0; i<counter.length; i++) {
			fCounter.add(counter[i]);
		}
		int i = 0;
		int[] mList = new int[deepArray.length];
		for (String finalWord : mFinalList) {
			if (finalWord.equals("") || finalWord.equals(" ") || finalWord.equals("  ")) {
				mFinalList.remove(finalWord);
				fCounter.set(i, fCounter.get(i)-1);
			}
		}
		


		return findingHighestNoOfWords(fCounter);
	}
	
	private static int findingHighestNoOfWords(List<Integer> nList) {
		int highestNum = 0;
		int listLength = nList.size();
		for (int i=0; i<listLength;i++) {
			if(highestNum > nList.get(i)) {
				continue;
			} else {
				highestNum = nList.get(i);
			}
		}
		return highestNum;
	}
}
