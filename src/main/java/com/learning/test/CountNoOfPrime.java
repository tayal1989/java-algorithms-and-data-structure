package com.learning.test;

import java.util.Scanner;

public class CountNoOfPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter beginning no - ");
		int startingNo = sc.nextInt() ;
		System.out.println("Enter last no - "); 
		int lastNo = sc.nextInt() ;
		boolean flag = true ;
		int count = 0 ;
		
		for(int i = startingNo ; i <= lastNo ; i++) {
			
			if(startingNo <= 1) {
				System.out.println(startingNo + " is not a prime no");
				startingNo++ ;
				continue ;
			}
			
			int sqrRoot = (int) Math.sqrt(startingNo) ;
			
			for(int start = 2 ; start <= sqrRoot ; start++) {
				if(startingNo % start == 0) {
					flag = false ;
				}
			}
			
			if(flag) {
				System.out.println("No given is : " + startingNo + " prime");
				count++ ;
			} else {
				System.out.println("No given is : " + startingNo + " not prime");
			}
			
			startingNo++ ;
			flag = true ;
		}
		System.out.println("Total no - " + count);
		
		sc.close();
	}

}
 