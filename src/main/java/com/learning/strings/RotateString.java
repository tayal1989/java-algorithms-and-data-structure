package com.learning.strings;

public class RotateString {

	public static void main(String[] args) {
		String str1 = "abcde" ;
		String str2 = "abced" ;
		
		String temp = str1 + str1 ;
		boolean flagA = false ;
		boolean flagB = false ;
		
		if(str1.length() == str2.length()) {
			flagA = true ;
		}
		
		if(temp.indexOf(str2) != -1) {
			flagB = true ;
		}
		
		if(flagA && flagB) {
			System.out.println("Rotation of string");
		} else {
			System.out.println("Not rotation of string");
		}
	}

}
