package com.learning.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <h1>CommonElementsInThreeArray</h1>
 * The CommonElementsInThreeArray.java program will find all the common elements 
 * present in three arrays
 * 
 * <p>
 * For example : <br>
 * input1 = {1, 7, 7, 10, 20, 20, 40, 80} ;	<br>
 * input2 = {6, 7, 7, 20, 20, 80, 100} ;		<br>
 *	input3 = {3, 7, 7, 15, 20, 20, 30, 70, 80, 120} ;	<br>
 *	will give the common elements as 7, 20 and 80
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n2)
 */

public class CommonElementsInThreeArray {

	public static void main(String[] args) {
		long startTimeNano = System.nanoTime();
		int[] input1 = {1, 7, 7, 10, 20, 20, 40, 80} ;	// 6
		int[] input2 = {6, 7, 7, 20, 20, 80, 100} ;	// 5
		int[] input3 = {3, 7, 7, 15, 20, 20, 30, 70, 80, 120} ;	// 8

        commonElementInThreeArray(input1, input2, input3);

		long endTimeNano = System.nanoTime();
		long executionTimeMicro = (endTimeNano - startTimeNano) / 1000;
		System.out.println("Execution time: " + executionTimeMicro + " microseconds");
	}

    public static void commonElementInThreeArray(int[] input1, int[] input2, int[] input3) {
        int i = 0;
        int j = 0;
        int k = 0;
        Set<Integer> set = new LinkedHashSet<>();
        while (i < input1.length && j < input2.length && k < input3.length) {
            if(input1[i] == input2[j] && input2[j] == input3[k]) {
                set.add(input1[i]);
                i++;
                j++;
                k++;
            } else if(input1[i] < input2[j]) {
                i++;
            } else if (input2[j] < input3[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println("Common elements are : " + set);
    }

}
