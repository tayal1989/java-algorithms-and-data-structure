package com.learning.arrays;

/**
 * @author Vishal Agarwal
 * @version Creation time: 11-Sep-2021 7:23:52 pm
 * @classDescription
*/

public class ResizeArray {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[] temp = new int[arr.length * 2];
		
		for(int i = 0 ; i < arr.length ; i++) {
			temp[i] = arr[i];			
		}
		
		for(int i = 0 ; i < temp.length ; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
