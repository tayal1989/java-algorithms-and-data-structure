package com.learning.numbers;

import java.util.Scanner;
import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		String digit = sc.next() ;
		
		int[] arr = new int[digit.length()] ;
		
		int number = Integer.parseInt(digit) ;
		
		int i = 0 ;
		
		while(number != 0) {
			arr[i] = number % 10 ;
			number = number / 10 ;
			i++ ; 
		}
		
		// Code for sorting
		Arrays.sort(arr) ;
		 
		System.out.println("\nLargest Number : ");
		for (int ind = arr.length - 1 ; ind >= 0; ind--) {
		    System.out.print(arr[ind]);
		}
		
		System.out.println("\nSmallest Number : ");
		for (int ind = 0 ; ind <= arr.length - 1; ind++) {
		    System.out.print(arr[ind]);
		}
		
		sc.close();
	}

}