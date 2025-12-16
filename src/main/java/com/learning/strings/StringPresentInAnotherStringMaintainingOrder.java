package com.learning.strings;

public class StringPresentInAnotherStringMaintainingOrder {

	public static void main(String[] args) {

		String str1 = "Sanjit";
		String str2 = "Zt" ;
		
		int i = 0;
		int j = 0;
		boolean flag = true ;
		
		while(j < str2.length()) {
			if(str2.charAt(j) == str1.charAt(i)) {
				i++ ;
				j++ ;
				if(i == str1.length()) {
					break ;
				}
			} else {
				i++ ;
				if(i == str1.length()) {
					flag = false ;
					break ;
				}
			}
		}
		
		if(flag) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
