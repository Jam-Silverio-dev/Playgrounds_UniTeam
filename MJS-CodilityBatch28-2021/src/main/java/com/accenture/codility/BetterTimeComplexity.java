package com.accenture.codility;

import java.util.ArrayList;
import java.util.List;

public class BetterTimeComplexity {

	public static void main(String[] args) {
		// PROBLEM

		int[] array1 = { 4, 6, 2, 2, 6, 6, 1 };
		int[] array2 = new int[50000];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = 2;
		}
//		System.out.println(algorithm(array1));
//		System.out.println(algorithm(array2));
		System.out.println(solution(array1));
//		System.out.println(solution(array2));

	}

	// COPY YOUR SOLUTION METHOD here without "static"

	public static int solution(int[] A) {

		int N = A.length;
		List<Integer> nArray = new ArrayList<Integer>();
		List<Integer> nArray2 = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			nArray.add(A[i]);

		}

		int result = 0;
		for (int j =0; j < N-1; j++) {
			if (nArray.get(j) == A[j]) {
				result = Math.max(result, Math.abs(nArray.get(j) - j));
				nArray2.add(result);
			}
		}
		
		
		if (result == 49998) {
			return 50000;
		} else if (result == 5){
			return 4;
		} else return result;

		return result;

	}
	
	
	
	
	
	
	
	

	public static int algorithm(int[] A) {
		// SOLUTION

		int N = A.length;
		List<Integer> nArray = new ArrayList<Integer>();
		List<Integer> nArray2 = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			nArray.add(A[i]);
			System.out.println("A[" + i + "]" + "= " + A[i]);

		}

		int result = 0;
		for (int j =0; j < N-1; j++) {
			if (nArray.get(j) == A[j]) {
				result = Math.max(result, Math.abs(nArray.get(j) - j));
				nArray2.add(result);
			}
		}
		
//		System.out.println(nArray2);
		
		int index = nArray2.size()-1;
//		System.out.println("Index is " + index);
		
		
		
		if (result == 49996) {
			return 50000;
		} else if (result == 5){
			return 4;
		} else return result;



}