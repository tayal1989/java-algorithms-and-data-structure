package com.learning.numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>HCFEuclidAlgorithm.java</h1>
 * The HCFEuclidAlgorithm.java program implements an application that
 * will help the user to find HCF of numbers
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author	VISAG
 * @version	1.0
 * @date		21-Jul-2016
 */
public class HCFEuclidAlgorithm {

	public static void main(String[] args) {
		
		System.out.println("Enter how many numbers you want to enter : ");
		Scanner sc = new Scanner(System.in);
		int totalNumber = sc.nextInt() ;
		
		int[] arr = new int[totalNumber] ;
		
		System.out.println("Enter the numbers : ");
		
		for(int i = 0 ; i < totalNumber ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		Arrays.sort(arr);
		
		int rem = 1, ind = arr.length - 1, temp = 0 ;
		
		while(ind >= 0) {
			rem = arr[ind] % arr[ind - 1] ;
			
			if(rem == 0 || rem == 1) {
				// If remainder is 1, no point of going forward, HCF will always be 1
				if(rem == 1) {
					System.out.println("HCF : --> " + 1);
					break ;
				}
				
				// Interchanging numbers, as I want to divide the next no with the HCF of two numbers which we just calculated
				// It will help to reduce the no of cycle and thus reducing the complexity of algorithm
				if(ind > 1) {
					temp = arr[ind - 2] ;
					arr[ind - 2] = arr[ind - 1] ;
					arr[ind - 1] = temp ;
				}
				
				ind-- ;
				
				if( ind == 0 ) {
					break ;
				}
			} else {
				//Interchanging the big no with remainder
				arr[ind] = arr[ind - 1] ;	
				arr[ind - 1] = rem ;
			}			
		}
		
		System.out.println("HCF : --> " + arr[ind]);
		
		sc.close();
	}

}
