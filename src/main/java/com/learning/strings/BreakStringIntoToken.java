package com.learning.strings;

public class BreakStringIntoToken {

	public static void main(String[] args) {
		String str = "abc def \"abc exy def\" ghi \"ijk lmn\"" ;
		//String str = "abc def" ;
		//String str = "\"abc exy def\" \"ijk lmn\"" ;
		String[] temp = str.split(" ") ;
		String[] out = new String[temp.length] ;
		int k = 0 ;
		
		for(int i = 0 ; i < temp.length ; i++) {
			if(temp[i].contains("\"")) {
				out[k] = temp[i] + " " ;
				i++ ;
				while(!temp[i].contains("\"")) {
					out[k] = out[k] + temp[i] + " " ;
					i++ ;
				}
				out[k] = out[k] + temp[i];
				k++ ;
 			} else {
 				out[k] = temp[i] ;
 				k++ ;
 			}			
		}

		for(int i = 0 ; i < out.length ; i++) {
			if(out[i] != null) {
				System.out.println(out[i]);
			}
		}
	}

}
