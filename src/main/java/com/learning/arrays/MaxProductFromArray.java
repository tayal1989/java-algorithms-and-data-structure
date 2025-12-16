package com.learning.arrays;

/**
 * <h1>MaxProductFromArray.java</h1>
 * The MaxProductFromArray.java program implements an application that
 * 
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		03-Jan-2017
 */

public class MaxProductFromArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -1, 4, 5, 6, -2, 8, 2, 1};
		
		int curr = 1, max = arr[0] ;
		
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			curr = arr[i + 1] * curr ;
			
			if(max < curr) {
				max = curr ;
			} else if (curr < 1) {
				curr = 1 ;
			}
		}
		
		if(max < arr[0]) {
			max = arr[0] ;
		}
		
		System.out.println("Max Product : " + max);
	}

}
