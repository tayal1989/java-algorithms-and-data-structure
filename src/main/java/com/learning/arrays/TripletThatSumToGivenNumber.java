package com.learning.arrays;

/**
 * <h1>TripletThatSumToGivenNumber</h1>
 * The TripletThatSumToGivenNumber.java program will find out the addition pairs of three numbers
 * for a given number.
 * 
 * <p>
 * For example, if we have to find combination for 10 then pairs will be
 * Triplet pairs of 10 are 1, 2, 7
 * Triplet pairs of 10 are 1, 3, 6
 * Triplet pairs of 10 are 1, 4, 5
 * Triplet pairs of 10 are 2, 3, 5
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n)
 */

public class TripletThatSumToGivenNumber {
	
	public static void findTriplet(int[] arr, int value){
				
		for(int i = 0 ; i < arr.length / 2 ; i++){
			int j = i + 1 ;
			int k = arr.length - 1 ;
			while(j < k){
				if((arr[i] + arr[j] + arr[k]) == value){
					System.out.println("Triplet pairs of " + value + " are " + arr[i] + ", " + arr[j] + ", " + + arr[k]);
					j++ ;
				} else if((arr[i] + arr[j] + arr[k]) < value){
					j++ ;
				} else {
					k-- ;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
		int value = 10 ;
		findTriplet(arr, value) ;
	}

}
