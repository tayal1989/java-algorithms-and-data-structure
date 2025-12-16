package com.learning.arrays;

/**
 * <h1>IndexEqualsNumber</h1>
 * The IndexEqualsNumber.java program will check if the number
 * in the array is equal to its array index.
 * 
 * <p>
 * For example : <br>
 * input1 = {1, 3, 2, 5, 4} ;	<br>
 *	will give the index number equal to number as 2 and 4
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class IndexEqualsNumber {

	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 5, 4} ;
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			if(i == arr[i]) {
				System.out.println("Element at index " + i + " : " + arr[i]);
			}
		}
	}

}
