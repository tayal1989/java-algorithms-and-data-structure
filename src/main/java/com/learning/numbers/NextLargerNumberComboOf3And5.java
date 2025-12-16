package com.learning.numbers;

/**
 * @author Vishal Agarwal
 * @since Creation time: 14-Jun-2021 05:19:44 pm
 * @classDescription
 * /**
 * <h1>Find next combo of 3 and 5</h1>
 * find the next largest number of a given integer, where the next largest number can consist only of a combination of 3s and 5s
 * 
 * <p>
 * For example : <br>
 * number: 23 output: 33, number: 129 output: 333, number: 432 output: 533	<br>
 * @category O(n)
 */

public class NextLargerNumberComboOf3And5 {

	public static void main(String[] args) {
		int num = 231 ;
		String str = String.valueOf(num);
		int[] arr = new int[str.length()];
		int rem = 0;
		int i = 0;
		String output = "";
		
		while(num != 0) {
			rem = num % 10;
			num = num / 10;
			arr[i] = rem;
			i++;
		}
		
		for(int ind = arr.length - 1; ind >= 0; ind--) {
			System.out.print(arr[ind] + " ");
		}
		
		for(int ind = arr.length - 1; ind >= 0; ind--) {
			if(arr[ind] <= 3 || arr[ind] > 5) {
				output = output + "3";
			} else {
				output = output + "5";
			}
		}
		
		System.out.println("\nNumber : " + output);
	}

}