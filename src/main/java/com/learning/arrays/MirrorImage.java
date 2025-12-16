package com.learning.arrays;

import java.util.Scanner;

public class MirrorImage {
	
	public void mirrorImage(int[] arr) {
		int sum = 0 ;
		int remainder = 0 ;
		int number = 0 ;
		
		if(arr.length == 0) {
			System.out.println("Blank Array") ;
		} else {
			for(int i = arr.length - 1; i >= 0 ; i--) {
				sum = 0 ;
				remainder = 0 ;
				number = arr[i] ;
				
				while(number != 0) {
					remainder = number % 10 ;
					number = number / 10 ;
					sum = sum * 10 + remainder ;
				}
				
				arr[i] = sum ;
			}
			
			for(int i = 0 ; i < arr.length / 2 ; i++) {
				int temp = arr[i] ;
				arr[i] = arr[arr.length - 1 - i] ;
				arr[arr.length - 1 - i] = temp ;
			}
			
			for(int ind = 0 ; ind < arr.length ; ind++) {
				if(ind != arr.length - 1) {
					System.out.println(arr[ind]);
				} else {
					System.out.print(arr[ind]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// Blank Array
		// Negative Number = {1, 2, 3, -15}
		// Positive Number = {1, 2, 3, 15}
		// {100}
		// {01, 00, -30, -10}
		
		Scanner sc = new Scanner(System.in);
		
		int noOfElements = sc.nextInt() ;
		
		int[] arr = new int[noOfElements] ;
		
		int element ;
		
		for(int i = 0 ; i < noOfElements ; i++) {
			element = sc.nextInt() ;
			arr[i] = element ;
		}
		
		MirrorImage mi = new MirrorImage();
		mi.mirrorImage(arr) ;
		
		sc.close();
	}

}
