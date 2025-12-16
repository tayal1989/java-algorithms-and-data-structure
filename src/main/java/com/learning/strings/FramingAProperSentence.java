/**
 * 
 */
package com.learning.strings;

/**
 * @author Vishal Agarwal 27-Nov-2015 2015
 */
public class FramingAProperSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] dict = {"is", "his", "this", "a", "we", "awe", "me", "some", "awesome"} ;
		//String sentence = "thisisawesome" ;
		String[] dict = {"is", "his", "name", "am", "me", "stand", "stands", "for", "or", "truth"} ;
		String sentence = "hisnamestandsfortruth" ;
		//String[] dict = {"hot", "test", "hottest", "sun", "day", "sunday", "of", "the", "he", "year", "ear", "and", "madam", "mad", 
		//		"dam", "am", "ad", "is", "look", "in", "looking", "king", "loo", "a", "i", "o"} ;
		//String sentence = "hottestsundayoftheyearandmadamislookingdamhot" ;
		//String sentence = "madtohkinglookhottesttest" ;
		//String[] dict = {"king","in","make","maker","kingmaker","is","ore","more","ant","important","than","thank", "import", "port", "thanking"} ;
		//String sentence = "kingmakerismoreimportantthanking" ;
		String outputStr = "" ;
		int start = 0 ;
		int len = sentence.length() ;
		int actualLen = sentence.length() ;
		String[] arr = new String[dict.length] ;
		int count = 0 ;
		int anotherStr = 0 ;
		boolean flag = false ;
		boolean decrementOp = false ;
		
		while(anotherStr != sentence.length()){
			if(flag == false) {
				outputStr = "" ;
				outputStr = outputStr + sentence.substring(start, len) ;
				decrementOp = true ;
			} else {
				outputStr = "" ;
				outputStr = outputStr + sentence.substring(anotherStr, len) ;
				decrementOp = true ;
			}
			
			for(int i = 0 ; i < dict.length ; i++){
				if(dict[i].length() >= outputStr.length()){
					if(dict[i].trim().equals(outputStr)){
						arr[count] = outputStr ; 
						anotherStr = anotherStr + outputStr.length() ;
						count++ ;
						flag = true ;
						len = actualLen ;
						decrementOp = false ;
						break ;
						
					}
				}
			}
			
			//System.out.println(outputStr);			
			
			if(decrementOp == true) {
				len-- ;
			}
		}
		
		for(int ind = 0 ; ind < arr.length ; ind++) {
			if(arr[ind] != null) {
				System.out.print(arr[ind] + " ");
			}
		}
		
	}

}
