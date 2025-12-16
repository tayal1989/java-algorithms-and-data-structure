package com.learning.arrays;

/**
 * <h1>TwoLargestNumberInArray</h1>
 * The TwoLargestNumberInArray.java program will find the largest two numbers
 * in the given array
 * 
 * <p>
 * For example : <br>
 * input1 = {1, 3, 2, 5, 4} ;	<br>
 *	will give the largest two numbers as 4 and 5
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class TwoLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {8, 9, 11, 12, 12} ;
		
		int largestNo = arr[0] ;
		int secondLargestNo = arr[1] ;
		int thirdLargestNo = arr[2] ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(largestNo < arr[i]) {
				//thirdLargestNo = secondLargestNo ;	// To find 3rd largest no
				secondLargestNo = largestNo ;
				largestNo = arr[i] ;
			}
			
			if((arr[i] < largestNo) && (arr[i] > secondLargestNo) && (arr[i] != largestNo)){
				//thirdLargestNo = secondLargestNo ;	// To find 3rd largest no
				secondLargestNo = arr[i] ;
			}	
			
			//	To find 3rd largest no
			if((arr[i] < secondLargestNo) && (arr[i] > thirdLargestNo) && (arr[i] < largestNo) && (arr[i] != secondLargestNo)){
				thirdLargestNo = arr[i] ;
			}
			
		}
		
		
		System.out.println("Largest No : " + largestNo);
		System.out.println("Second largest No : " + (secondLargestNo));
//		System.out.println("Third largest No : " + (thirdLargestNo));
	}

}
