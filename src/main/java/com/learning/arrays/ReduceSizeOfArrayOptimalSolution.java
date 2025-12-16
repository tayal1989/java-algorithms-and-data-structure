package com.learning.arrays;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ReduceSizeOfArrayOptimalSolution {

	public static void reduceSizeOfArray(int[] arr) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int[] outputArr = new int[arr.length] ;
		boolean flag = true ;
		int count = 0 ;
		int diff = 0 ;
		
		// For handling negative values
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println("Array contains negative elements, hence, wrong input");
				flag = false ;
				break ;
			}
		}

		if(flag) {
			// For storing key and value i.e [1, 1], [3, 2], [7, 1], [9, 1]
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			
			// For subtracting elements
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if(count == 0) {
					outputArr[count] = arr.length ;
				} else {
					outputArr[count] = outputArr[count - 1] - diff ;
				}
				diff = entry.getValue() ;
				count++ ;
			}
			
			// For printing
			for (int i = 0; i < arr.length; i++) {
				System.out.print(outputArr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
//		int[] arr = { -1, 0, 3, 7, 9 };
//		int[] arr = { 0, 0, 3, 7, 9 };
		int[] arr = { 1, 3, 3, 7, 9 };
//		int[] arr = { 1, 1, 1, 1, 9 };
		// myMethod(arr);
		reduceSizeOfArray(arr);
	}

}
