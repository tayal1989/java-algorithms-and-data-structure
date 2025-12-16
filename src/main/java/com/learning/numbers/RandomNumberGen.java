/**
 * 
 */
package com.learning.numbers;

import java.util.Scanner;

/**
 * @author v4agarwa 22-Dec-2015
 */
public class RandomNumberGen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int lowNo = 1 ;
		
		System.out.println("Enter the higher value : ");
		int highNo = sc.nextInt() ;
		
		//System.out.println((int)((System.currentTimeMillis() % highNo))) ;
		
		int randNo = (int)(System.currentTimeMillis() % highNo) + lowNo ;
		
		if(randNo > highNo) {
			System.out.println("Random number : " + randNo);
		} else {
			System.out.println("Random number : " + randNo);
		}
		
		sc.close();
	}

}
