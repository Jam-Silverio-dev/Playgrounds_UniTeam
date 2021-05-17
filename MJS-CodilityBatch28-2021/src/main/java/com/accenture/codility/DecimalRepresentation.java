package com.accenture.codility;

import java.util.Arrays;

public class DecimalRepresentation {

	public static void main(String[] args) {

		// PROBLEM
		/**
		 * Two integers A and B are given. We are interested in positions at which the
		 * decimal representation of A occurs as a substring in the decimal
		 * representation of B (counting from O).
		 * 
		 * For example: • 53 occurs in 1953786 at position 2. • 78 occurs in 195378678
		 * at positions 4 and 7. • 57 does not occur in 153786.
		 * 
		 * Decimal representations are assumed to be big-endian and without leading
		 * zeros (the only exception being the number O, whose decimal representation is
		 * "0").
		 * 
		 * Write a function class Solution { public int solution(int A, int B); } that,
		 * given two integers A and B, returns the leftmost position at which A occurs
		 * in B. >>>><Important> Should return the index/position
		 * {0,1,2,3,4,5,6,7,8,9,10,11...999,999,999} The function should return -1 if A
		 * does not occur in B. >>>><Important> For example, given A = 53 and B =
		 * 1953786, the function should return 2, as explained above.
		 * 
		 * Assume that: • A and B are integers within the range [0..999,999,999]. In
		 * your solution, focus on correctness.
		 * 
		 * The performance of your solution will not be the focus of the assessment.
		 * 
		 * Copyright 2009—2021 by Codility Limited. All Rights Reserved. Unauthorized
		 * copying, publication or disclosure prohibited.
		 */

		System.out.println(solution(10, 123456701));

	}

	// COPY YOUR SOLUTION METHOD here without "static"

	public static int solution(int A, int B) {
		long LIMIT = 999999999L;

		long num = (long) A;
		long compare = (long) B;

		if (num > 0 && num <= LIMIT && compare > 0 && compare <= LIMIT) {
			String mNum = String.valueOf(num);
			String mCompare = String.valueOf(compare);

//			System.out.println("mNum is: " + mNum);
//			System.out.println("mCompare is: " + mCompare);

			char[] mNumCharArray = new char[mNum.length()];
			for (int i = 0; i < mNum.length(); i++) {
				mNumCharArray[i] = mNum.charAt(i);
			}
			char[] mCompareCharArray = new char[mCompare.length()];
			for (int i = 0; i < mCompare.length(); i++) {
				mCompareCharArray[i] = mCompare.charAt(i);
			}
//			System.out.println(Arrays.toString(mNumCharArray));
//			System.out.println(Arrays.toString(mCompareCharArray));

			String nNumCompare = "";
			for (char c : mNumCharArray) {
				nNumCompare += c;
			}
//			System.out.println("nNumCompare is: " + nNumCompare);
//			System.out.println("mNumCharArray length is: " + mNumCharArray.length);
//			System.out.println("mCompareCharArray length is: " + mCompareCharArray.length);

			int compareLength = nNumCompare.length();//
//			System.out.println("compareLength is: " + compareLength);

			StringBuilder sb = new StringBuilder();
			String box = "";

			for (int i = 0; i < compareLength; i++) {
				box = String.valueOf(mCompareCharArray[i]);
				sb.append(box);
			}
//			System.out.println("box is: " + sb);

			StringBuilder msb = new StringBuilder();
			int nNumPosition = 0;
			for (int i = 0; i < mCompareCharArray.length - 1; i++) {
				box = String.valueOf(mCompareCharArray[nNumPosition])
						+ String.valueOf(mCompareCharArray[nNumPosition + 1]);// concatenate two positions [[1],[9],..]
				msb.append(box);

//				System.out.println("for loop box is: " + box + " " +  i);
				if (nNumCompare.equals(box)) {
					nNumPosition = i;
					return nNumPosition;
				} else {
					nNumPosition += 1;
				}
			}
			//
//			// #6 - Return nNumPosition
			//
//			// if the scanning is finished but didn't find any searches return -1
			return -1;
		}

		return -1;
	}

	public static int returnPosition(int A, int B) {
		// SOLUTION
		// GOAL: Return just one match and the first match scanning from left to right.
		long LIMIT = 999999999L;

		// #1 - Make a copy.
		// Is A occurring in B?
		long num = (long) A;
		// B is the number to compare
		long compare = (long) B;

		// Validation:
		// Remove leading zeros
		if (num > 0 && num <= LIMIT && compare > 0 && compare <= LIMIT) {
			// Continue processing
		}

		// 53 -> 1953786 : Returns int 2 because leftmost digit + (lmd+1) matches
		// compare's iterable {compareLength} digit-box. Then method terminates.
		// If the whole string is scanned from left to right and there are no mathes,
		// the method returns -1. Method terminates.

		// #2 - Convert long num,compare String.valueOf(). Save to String arrays using
		// .split(",").
		String mNum = String.valueOf(num);// The same as A but String
		String mCompare = String.valueOf(compare);// The same as B but String

		System.out.println("mNum is: " + mNum);
		System.out.println("mCompare is: " + mCompare);

		char[] mNumCharArray = new char[mNum.length()];
		for (int i = 0; i < mNum.length(); i++) {
			mNumCharArray[i] = mNum.charAt(i);
		}
		char[] mCompareCharArray = new char[mCompare.length()];
		for (int i = 0; i < mCompare.length(); i++) {
			mCompareCharArray[i] = mCompare.charAt(i);
		}
		System.out.println(Arrays.toString(mNumCharArray));
		System.out.println(Arrays.toString(mCompareCharArray));

		// #3 - Extract substring[0] both num & nCompare and compare

		// nNumCompare is the matcher.
		String nNumCompare = "";
		for (char c : mNumCharArray) {
			nNumCompare += c;// becomes "53"
		}
		System.out.println("nNumCompare is: " + nNumCompare);
		System.out.println("mNumCharArray length is: " + mNumCharArray.length);
		System.out.println("mCompareCharArray length is: " + mCompareCharArray.length);

		int compareLength = nNumCompare.length();//
		System.out.println("compareLength is: " + compareLength);

		// #4 - Extract
		// compareArray[0]+compareArray[1]+compareArray[2]+..compareArray[compareLength]

		StringBuilder sb = new StringBuilder();
		String box = "";
		// box is the places of digits to be compared
		for (int i = 0; i < compareLength; i++) {
			box = String.valueOf(mCompareCharArray[i]);// becomes "[],[],5,3,7,8,6"
			sb.append(box);
		}
		System.out.println("box is: " + sb);

		// #5 - Control flow
//		System.out.println(solution(10, 123456105));
		StringBuilder msb = new StringBuilder();
		int nNumPosition = 0;
		for (int i = 0; i < mCompareCharArray.length - 1; i++) {
			box = String.valueOf(mCompareCharArray[nNumPosition]) + String.valueOf(mCompareCharArray[nNumPosition + 1]);// concatenate
																														// two
																														// positions
																														// [[1],[9],..]
			msb.append(box);
			// -> "10"
			System.out.println("for loop box is: " + box + " " + i);
			if (nNumCompare.equals(box)) {
				nNumPosition = i;
				return nNumPosition;
			} else {
				nNumPosition += 1;
			}
		}
//
//		// #6 - Return nNumPosition
//
//		// if the scanning is finished but didn't find any searches return -1
		return -1;
	}

}
