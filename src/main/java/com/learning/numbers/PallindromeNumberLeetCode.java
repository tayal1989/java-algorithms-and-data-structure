package com.learning.numbers;

public class PallindromeNumberLeetCode {

	public static void main(String[] args) {
		int x = 121 ;
		
		String str = Integer.toString(x);
		boolean flag = true ;
		int start = 0 ;
		int end = str.length() - 1 ;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				flag = false ;
				break ;
			}
			start++ ;
			end-- ;
		}
		
		if(flag) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

}
