package com.learning.numbers;

public class NearestPallindrome {

	public static void main(String[] args) {
		int i = 12345 ;
		int bigNumber = i + 1 ;
		int smallNumber = i - 1 ;
		String largeStr = "" ;
		String smallStr = "" ;
		
		while(true) {			
			largeStr = Integer.toString(bigNumber);
			int start = 0 ;
			int end = largeStr.length() - 1 ;
			boolean flag = true ;
			
			while(start <= largeStr.length()/2) {
				if(largeStr.charAt(start) == largeStr.charAt(end)) {
					start++ ;
					end-- ;
				} else {
					flag = false ;
					break ;
				}
			}
			
			if(!flag) {
				bigNumber = bigNumber + 1 ;
			} else {
				System.out.println("Bigger Pallindrome : " + largeStr);
				break ;
			}
		}
		
		int largeDiff = Integer.parseInt(largeStr) - i ;
		
		while(true) {			
			smallStr = Integer.toString(smallNumber);
			int start = 0 ;
			int end = smallStr.length() - 1 ;
			boolean flag = true ;
			
			while(start <= smallStr.length()/2) {
				if(smallStr.charAt(start) == smallStr.charAt(end)) {
					start++ ;
					end-- ;
				} else {
					flag = false ;
					break ;
				}
			}
			
			if(!flag) {
				smallNumber = smallNumber - 1 ;
			} else {
				System.out.println("Smaller Pallindrome : " + smallStr);
				break ;
			}
		}
		
		int smallDiff = i - Integer.parseInt(smallStr) ;
		
		if(largeDiff < smallDiff) {
			System.out.println("Closest Number = " + largeStr);
		} else if(smallDiff < largeDiff) {
			System.out.println("Closest Number = " + smallStr);
		} else {
			System.out.println("Closest Number = " + smallStr + " and " + largeStr);
		}

	}

}
