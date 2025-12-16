package com.learning.strings;

public class Next3rdChar {

	public static void main(String[] args) {
		String str = "A" ;
		String output = "" ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			output = output + (char) (str.charAt(i) + 3) ;
			if(output.charAt(0) == 'D') {
				System.out.println("hello");
			}
		}
		
		System.out.println(output);

	}

}
