package com.learning.arrays;

/**
 * @author Vishal Agarwal
 * @version Creation time: 11-Sep-2021 7:13:57 pm
 * @classDescription
*/

public class MoveZeroesAtEndOfArray {

	public static void main(String[] args) {
		int arr[] = {8, 1, 0, 2, 0, 3};
		int j = 0;
		int temp = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != 0 && arr[j] == 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			if(arr[j] != 0) {
				j++;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
