package com.learning.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author Vishal Agarwal
 * @version Creation time: 14-Jun-2021 10:50:44 am
 * @classDescription
 * /**
 * <h1>MaxMinNoFromArrayElements</h1>
 * The FindDuplicateNumberInArray.java program will find the largest/smallest no from the given array
 * 
 * <p>
 * For example : <br>
 * input1 = {6, 8, 9, 1} ;	<br>
 *	will give maximum no as 9861 and minimum no as 1689
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @category O(n)
 */

public class MaxMinNoFromArrayElements {

	public static void main(String[] args) {
		int[] arr = {6, 8, 9, 1};
		Arrays.sort(arr);
		
		System.out.print("Minimum No Formed : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.print("\n\nMaximum No Formed : ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		String[] arr1 = {"3", "30", "34", "9"};
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				String str1 = arr1[i] + arr1[j];
				String str2 = arr1[j] + arr1[i];
				int num1 = Integer.parseInt(str1);
				int num2 = Integer.parseInt(str2);
				System.out.print("\nNum1 : " + num1 + " num2 : " + num2 + "\n");
				if(num1 < num2) {
					String temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
				
				for(int k = 0; k < arr1.length; k++) {
					System.out.print(arr1[k] + " ");
				}
			}
		}
		
		System.out.println("\nMaximum Element Formed : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println();
		List<String> list = Arrays.asList("3", "30", "34", "9");
		Collections.sort(list, new Comparator<String>(){
            // A comparison function which is used by
            // sort() in printLargest()
            public int compare(String X, String Y) {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
 
        Iterator<String> it = list.iterator();
 
        while (it.hasNext()) {
			System.out.print(it.next());
        }
	}

}
