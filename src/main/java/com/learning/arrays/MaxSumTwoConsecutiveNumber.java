package com.learning.arrays;

/**
 * <h1>MaxSumTwoConsecutiveNumber</h1>
 * The MaxSumTwoConsecutiveNumber.java program will find the maximum
 * sum between two consecutive element in a given array
 *
 * <p>
 * For example : <br>
 * input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;	<br>
 * will give the maximum sum as 19 which is a pair of 10 and 9
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class MaxSumTwoConsecutiveNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		
		int currentSum = 0 , largestSum = 0 ;
		
		for(int i = 0 ; i < arr.length - 1 ; i++ ) {
			currentSum = arr[i] + arr[i + 1] ;
			
			if(largestSum < currentSum) {
				largestSum = currentSum ;
			}
			
		}
		
		System.out.println("Max Sum : " + largestSum);
		
		
		for(int i = 0 ; i < arr.length - 2 ; i++ ) {
			currentSum = arr[i] + arr[i + 1] + arr[i + 2] ;
			
			if(largestSum < currentSum) {
				largestSum = currentSum ;
			}
			
		}
		
		System.out.println("Max Sum : " + largestSum);
	}

}
