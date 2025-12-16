package com.learning.strings;

public class ConvertCamelCaseToIndividualWords {

	public static void main(String[] args) {
		String str = "HeyThereIAmGood" ;
		String output = "" ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if((str.charAt(i) - 65 >= 0) && (str.charAt(i) - 65 <= 25)) {
				if(i != 0) {
					System.out.println(output);
				}
				output = "" ;
				output = output + str.charAt(i) ;
			} else {
				output = output + str.charAt(i) ;
			}
		}
		
		System.out.println(output);
	}

}
