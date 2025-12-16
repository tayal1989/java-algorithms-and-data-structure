package com.learning.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOccurencesOfCharInSameStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabcccdd" ;
		//String str = "abcd" ;
		//String str = "abbcccdddd" ;
		
		int count = 1 ;
		
		StringBuffer outputStr = new StringBuffer(str);
		
		int len = str.length() * 3 ;
		
		System.out.println("Input String : " + outputStr);
		
		boolean flag = true ;
		
		for(int ind = 0 ; ind < str.length(); ind++){
			if(str.charAt(ind) == str.charAt(ind + 1)){
				if(flag) {
					outputStr.append(str.charAt(ind + 1)) ;
				}				
				count++ ;			
			} else {
				if(count == 1){
					if(ind == 0){
						outputStr.append(str.charAt(ind)) ;
					}
					outputStr.append(count) ;
					outputStr.append(str.charAt(ind + 1)) ;
					flag = false ;
				} else if (count > 1){
					outputStr.append(count) ;
					outputStr.append(str.charAt(ind + 1)) ;
					flag = false ;
				}				
				count = 1 ;				
			}
			
			if(ind == str.length() - 2){
				outputStr.append(count) ;
				break ;
			}
		}
		
		System.out.println("Output String : " + outputStr.substring(str.length()));
		
	}

}
