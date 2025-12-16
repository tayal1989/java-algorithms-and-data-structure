package com.learning.arrays;

/**
 * A Sub Array is a contiguous memory location inside an Array. Let‘s say the array is {1,2,3} 
 * then the possible sub-array would be {1},{1,2},{1,2,3},{2},{2,3} and {3}. Note that {1,3} 
 * is not a sub-array as its elements are not contiguous in main array.
 * 
 * The number of possible sub-arrays = n*(n+1)/2.
 * 
 * @author Vishal Agarwal
 *
 */

public class SubArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int subArrayCount = 1;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i ; j < arr.length ; j++) {
				System.out.print("Sub Array No " + subArrayCount + "\t");
				printArray(arr, i, j);
				subArrayCount++;
			}
		}
	}
	
	public static void printArray(int[] arr, int start, int end) {
		System.out.print("[");
		for(int i = start ; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]" + "\n");	
	}
}
