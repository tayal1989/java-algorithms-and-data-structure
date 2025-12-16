package com.learning.numbers;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationsForArray {

	public static void main(String[] args) {
		int[] inputArr = {1, 2, 3};
		int number = inputArr.length ;
		int actualLen = ((int)Math.pow(2, number)) - 1;
		int squareRoot = (int)Math.sqrt(actualLen) + 1;
		for(int i = 1; i <= actualLen; i++) {
			decimalToBinary(i, squareRoot, inputArr);
			System.out.println();
		}
	}
	
	public static void decimalToBinary(int number, int squareRoot, int[] inputArr) {
		List<String> list = new ArrayList<String>();
		int count = 0;
		int[] arr = new int[squareRoot];
		int rem = 0;
		while(number > 0) {
			rem = number % 2;
			number = number / 2;
			arr[count++] = rem;
		}
		
		for(int i = arr.length - 1, j = 0; i >= 0 ; i--, j++) {
			System.out.print(arr[i]);
			if(arr[i] == 1) {
				list.add(Integer.toString(inputArr[j]));
			}
		}
		
		System.out.println("\n" + list);
	}

}
