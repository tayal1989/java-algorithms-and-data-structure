package com.learning.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vishal Agarwal
 * @version Creation time: 03-Sep-2021 2:07:44 pm
 * @classDescription
 * /**
 * <h1>FindDuplicateNumberInArray</h1>
 * The FindDuplicateNumberInArray.java program will find all duplicate numbers
 * present in array.
 * 
 * <p>
 * For example : <br>
 * input1 = {6, 8, 9, 1, 8, 5, 9, 7, 2, 2} ;	<br>
 *	will give the duplicate elements as 8, 9 and 2
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @category O(n)
 */

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 8, 2, 3, 1} ;
		Set<Integer> uniqueElements = new HashSet<Integer>();
		Set<Integer> duplicatedElements = new HashSet<Integer>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(uniqueElements.contains(arr[i])) {
				duplicatedElements.add(arr[i]) ;
			} else {
				uniqueElements.add(arr[i]) ;
			}
		}
		
		System.out.println("Unique Elements are : " + uniqueElements);
		System.out.println("Duplicated Elements are : " + duplicatedElements);
	}

}
