package com.learning.numbers;

import java.util.Scanner;

/**
 * An Armstrong number of three digits is an integer such that the sum of the cubes 
 * of its digits is equal to the number itself. For example, 371 is an Armstrong number 
 * since 3**3 + 7**3 + 1**3 = 371.
 * @author v4agarwa 22-Dec-2015
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the no to be checked : ");
		int number = sc.nextInt() ;
		
		int actualNo = number ;
		
		int temp = 0, sum = 0 ;
		
		while(number != 0) {
			temp = number % 10 ;
			number = number / 10 ;
			sum = (int) (sum + Math.pow(temp, 3)) ;
		}
		
		if(sum == actualNo) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not");
		}
		
		sc.close();
	}

}
