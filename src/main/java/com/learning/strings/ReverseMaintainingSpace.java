package com.learning.strings;

public class ReverseMaintainingSpace {

	public static void main(String[] args) {
		String str = "java and automation" ;
		String outputStr = "" ;
		int count = 0 ;
		int i = str.length() - 1 ;
		
		/*
		 * loop will run in reverse order
		 */
		while(i >= 0) {
			/*
			 * This condition is used for front side spaces
			 * If there is a space then incrementing the counter to move to next string
			 * We are keeping i as same value because front side there is space, not on back side
			 */
			if(str.charAt(count) == ' ') {
				outputStr = outputStr + str.charAt(count) ;
				count++ ;
			} 
			
			/*
			 * This is for character
			 * If there is a character, increment the counter
			 */
			else if(str.charAt(i) != ' ') {
				outputStr = outputStr + str.charAt(i) ;	
				i-- ;
				count++ ;
			} 
			
			/*
			 * If there is a space in back side then decrement the counter so to move to next available
			 * string. As we have already counted the space in the first condition.
			 */
			else if(str.charAt(i) == ' ') {
				--i ;
			}
			
			/*
			 * if count becomes equal to string length then break the loop
			 */
			if(count == str.length()) {
				break ;
			}
			
//			System.out.println(outputStr);
		}
		
		System.out.println(outputStr);
	}
}
