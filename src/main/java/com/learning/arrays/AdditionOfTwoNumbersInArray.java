package com.learning.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h1>AdditionOfTwoNumbersInArray</h1>
 * The AdditionOfTwoNumbersInArray.java program will find out the addition pairs
 * for a given number.
 * 
 * <p>
 * For example, if we have to find combination for 10 then pairs will be
 * 1,9
 * 2,8
 * 3,7
 * 4,6
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n)
 */

public class AdditionOfTwoNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
				
		int value = 9 ;
		
		int start = 0, end = arr.length - 1 ;
		
		while(start < end){
			if((arr[start] + arr[end]) == value){
				System.out.println("Pairs are : " + arr[start] + " and " + arr[end]);
				start++;
				end--;
			} else if((arr[start] + arr[end]) < value){
				start++;
			} else{
				end--;
			}
		}

        additionOfTwoNumbers(arr, value);
	}

    public static void additionOfTwoNumbers(int[] arr, int value) {
        SortedSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(int i = 0; i < arr.length/2 - 1; i++) {
            int complement = value - arr[i];
            if(set.contains(complement)) {
                System.out.println("Pairs are : " + arr[i] + " and " + complement);
            }
        }
    }

}
