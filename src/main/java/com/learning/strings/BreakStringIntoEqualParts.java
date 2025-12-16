package com.learning.strings;

import java.util.Scanner;

public class BreakStringIntoEqualParts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a string : ");
		// String str = sc.next() ;
		String str = "sixfixone" ;
		// String str = "fourfivecare" ;
		System.out.println("How many characters : ");
		// int charNo = sc.nextInt() ;
		int charNo = 3 ;
		String outputStr = "" ;
		
		int count = 0 ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			outputStr = outputStr + str.charAt(i) ;
			if(count == charNo - 1) {
				outputStr = outputStr + " " ;
				count = -1 ;
			}			
			count++ ;
		}
		
		System.out.println(outputStr);
		
		sc.close();
	}

}
