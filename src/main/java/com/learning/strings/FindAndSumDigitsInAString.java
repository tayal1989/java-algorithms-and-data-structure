package com.learning.strings;

import java.util.Scanner;

public class FindAndSumDigitsInAString {

	private static int temp = 0 ;
	private static int num = 0 ;
	private static int total = 0 ;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		//String str = sc.next() ;
		
		//System.out.println("Enter a string with digits : ") ;		
		
		String str = "A1Ab43csJG3SDG021hg31" ;
		
		int[] arr = new int[str.length()];
		
		for(int i = 0 ; i < str.length(); i++){
			if((str.charAt(i) - 48) <= 9){
				arr[i] = str.charAt(i) ;
			} else {
				arr[i] = 0 ;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int index = 0 ; index < arr.length; index++){			
			if(((arr[index] - 48) >= 0) && ((arr[index] - 57) <= 9)){
				num = arr[index] - 48 ;
				temp = temp * 10 + num ;
				if(index == (arr.length - 1)){
					total = total + temp ;
					break ;
				}
			} else {
				total = total + temp ;
				temp = 0 ;
			}			
		}
				
		System.out.println("\nTotal : " + total) ;		
		
		sc.close() ;
		
		str = "12 hi when 8 and 9";
		str = "abc12ab7xy342z" ;
		str = str.replaceAll("[\\D]+"," ");
		
		System.out.println("String is : " + str);
		
		String[] numbers=str.split(" ");
		int sum = 0;
		
		for(int ind = 0 ; ind < numbers.length ;  ind++){
			System.out.println("Numbers are : " + numbers[ind]);
		}
		
		for(int i=0;i<numbers.length;i++){
		    try{
		        sum+=Integer.parseInt(numbers[i]);
		    }
		    catch( Exception e ) {
		      //Just in case, the element in the array is not parse-able into Integer, Ignore it
		    }
		}
		System.out.println("The sum is:"+sum);
	}

}