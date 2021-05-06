package com.accenture.bootcamp.day6;

public class SumOddRange {

	public static void main(String[] args) {

		System.out.println(sumOdd(1,20));
		

	}
	
	public static boolean isOdd(int number) {
		

			
		if (!(number %2 == 0)) {
			return true; 
		}
			

		return false;
		
	}
	
	public static int sumOdd(int start, int end) {
	
		
		int[] nums = new int [(end - start)+1];
		System.out.println(nums.length);
		
		for (int i = 0; i<nums.length; i++) {
			for (int j = start; j<= end; j++) {
//				System.out.println(start);
				
				if (start > 0) {
					if (isOdd(start)) {
						start += 1;
						nums[i] = start;
						return nums[i];
					}
				} else {
					return -1;
				}

				
			}
			
		}
		
			System.out.println(nums.length);
			//Unfinished


		return 0;
	}
	
	

}
