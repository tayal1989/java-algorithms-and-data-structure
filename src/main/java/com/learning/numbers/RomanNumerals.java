package com.learning.numbers;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumerals {
	
	private static int previous = 0, current = 0, sum = 0 ;
	
	private static int convertToNumber(String romanNumber, HashMap<String, Integer> hmap){
		sum = 0 ;
		previous = 0;
		current = 0 ;
		for(int i = romanNumber.length() - 1 ; i >= 0 ; i--) {
	    	 previous = current;
	    	 current = hmap.get(String.valueOf(romanNumber.charAt(i))) ;
	    	 if( current >= previous ){
	    		 sum+= current ;
	    	 } else {
	    		 sum-= current ;
	    	 }
	     }
		
		return sum ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter first roman number : ");
		String firstRomanNum = sc.next() ;
		
		System.out.println("Enter second roman number : ");
		String secondRomanNum = sc.next() ;
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		/* Adding elements to HashMap */
		hmap.put("I", 1);
		hmap.put("V", 5);
		hmap.put("X", 10);
		hmap.put("L", 50);
		hmap.put("C", 100);
		hmap.put("D", 500);
		hmap.put("M", 1000);

		/* Get values based on key */
		/*
		 * int var= hmap.get(String.valueOf(firstRomanNum.charAt(2)));
		 * System.out.println("Value at index 2 is: "+var);
		 */
		
		//System.out.println("Sum is : " + (RomanNumerals.convertToNumber(firstRomanNum, hmap)));
		//System.out.println("Sum is : " + (RomanNumerals.convertToNumber(secondRomanNum, hmap)));
		
		System.out.println("Sum is : " + (RomanNumerals.convertToNumber(firstRomanNum, hmap) + RomanNumerals.convertToNumber(secondRomanNum, hmap)));

		sc.close();
		
	}

}
