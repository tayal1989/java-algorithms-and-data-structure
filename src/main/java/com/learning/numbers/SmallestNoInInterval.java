package com.learning.numbers;

public class SmallestNoInInterval {

	public static void main(String[] args) {

		String str = "5-10, 15-20, 25-40, 30-45, 50-100" ;
		
		String[] splitStr = str.split(",") ;
		String[] anotherStr ; 
		
		for(int ind = 0 ; ind < splitStr.length ; ind++) {
			anotherStr = splitStr[ind].split("-") ;
			
			int part1 = Integer.parseInt(anotherStr[0].trim()) ;
			System.out.print(part1 + " ");
		}
	}

}
