package com.learning.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10} ;
		int sum = 0 ;
		int totalNum = 10 ;

		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i] ;
		}
		
		int missingNumber = ((totalNum * (totalNum + 1))/2) - sum ;
		
		System.out.println("Missing No. :" + missingNumber);
	}

}
