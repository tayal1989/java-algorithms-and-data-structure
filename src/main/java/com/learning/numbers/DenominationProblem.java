package com.learning.numbers;

public class DenominationProblem {
	
	public static void main(String[] args) {
		int amount = 5068 ;
		int copy = amount ;
		int[] denom = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int noOfNotes = 0 ;
		int totalNotes = 0 ;
		
		for(int i = 0 ; i < denom.length ; i++) {
			noOfNotes = amount / denom[i] ;
			if(noOfNotes != 0) {
				System.out.println(denom[i] + "\tX\t" + noOfNotes + " = " + (denom[i] * noOfNotes));
			}
			totalNotes = totalNotes + noOfNotes ;
			amount = amount % denom[i];
		}
		
		System.out.println("--------------------------------");
		
		// printing the total amount
		System.out.println("TOTAL\t\t  = " + copy); 
		System.out.println("--------------------------------");
		
		// printing the total number of notes
		System.out.println("Total Number of Notes\t= " + totalNotes);
	}
}
