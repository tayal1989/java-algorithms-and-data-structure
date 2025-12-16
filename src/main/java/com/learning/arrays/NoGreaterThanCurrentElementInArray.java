package com.learning.arrays;

/**
 * <h1>NoGreaterThanCurrentElementInArray</h1>
 * The NoGreaterThanCurrentElementInArray.java program will find out how many numbers
 * are greater than the current element in array
 * 
 * <p>
 * For example : <br>
 * input1 = {1, 2, 3, 4, 5, 6, 7, 8} ;	<br>
 * will give the output array as 7 6 5 4 3 2 1 0	<br>
 * Reason being there are 7 elements greater than 1 in the array, 
 * 6 elements greater than 2 and so on
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n)
 */

public class NoGreaterThanCurrentElementInArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8} ;
		int[] arr1 = new int[arr.length] ; 
		
		int count = 0, start = 0, end = arr.length ;
		
		int i = 0 ;
		
		int loop = 0 ;
		
		while(start < end - 1){
			if((start < arr.length) && (arr[start] < arr[i + 1])){
				arr1[count]++ ;
			}
			
			i++ ;
			loop++ ;
			
			//For the last element, as no element will be greater than the last element
			if(start == arr.length - 1){
				arr1[start] = 0 ;
				break ;
			}
			
			if(i == arr.length - 1){
				start++ ;
				i = start ;
				count++ ;				
			}
		}
		
		for(int j  = 0 ; j < arr1.length ; j++){
			System.out.print(arr1[j] + " ");
		}
		
		System.out.println("\n Loop : " + loop);
		
	}

}
