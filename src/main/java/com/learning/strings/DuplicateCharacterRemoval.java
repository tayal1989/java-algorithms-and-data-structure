package com.learning.strings;

import java.util.ArrayList;

/**
 * @author v4agarwa 08-Jan-2016
 */
public class DuplicateCharacterRemoval {

	public static void main(String[] args) {
		String word = "rmsm" ;
		
		int[] strArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		
		for(int ind = 0 ; ind <= word.length() - 1 ; ind++){
			int value = word.charAt(ind) - 97 ;
			if((value >= 0) && (value <= 25)){
				strArr[value]++;
			}
		}
		
		System.out.print("First way of solving the problem : ");
		
		for(int ind = 0, i = 97 ; ind < strArr.length ; ind++, i++){
			if(strArr[ind] != 0){
				char value = (char)i ;
				System.out.print(value);
			}
			
		}
		
		String destStr = "" ;
		
		for(int ind = 0 ; ind <= word.length() - 1 ; ind++){
			if(!(destStr.contains(Character.toString(word.charAt(ind))))) {
				destStr = destStr + Character.toString(word.charAt(ind)) ;
			}
		}
		
		System.out.println("\nAnother method : " + destStr);
	}

}
