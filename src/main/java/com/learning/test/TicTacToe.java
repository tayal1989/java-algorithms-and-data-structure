package com.learning.test;

import java.util.Scanner;

public class TicTacToe {
	
	public static String[][] fillXOrO(String[][] arr, int r, int c){
		for(int row = 1 ; row <= 3 ; row++){
			for(int col = 1 ; col <= 3 ; col++){
				if((row == r) && (col == c)){
					System.out.print(" " + arr[r][c] + " ");
				} else if (arr[row][col] != null){
					System.out.print(" " + arr[row][col] + " ");
				} else {
					System.out.print("   ");
				}
				
				if(col <= 2){
					System.out.print("|");
				}
				
			}
			
			if(row <= 2){
				System.out.println();
				System.out.println("-----------");
			}			
		}
		
		return arr ;
		
	}
	
	public static boolean checkForResult(String[][] arr){
		boolean state = true ;
		
		// Checking for horizontal rows
		int countX = 1, countO = 1 ;
		int row = 1, col = 1 ;
		for(row = 1 ; row <= 3 ; row++){
			for(col = 1 ; col <= 3 ; col++){
				if(arr[row][col] == "X"){
					countX++ ;
				} else if (arr[row][col] == "O"){
					countO++ ;
				}				
			}
			
			if(countX == 4){
				System.out.println("\n\nX won the game");
				state = false ;
				System.exit(0);
			} else if(countO == 4){
				System.out.println("\n\nO won the game");
				state = false ;
				System.exit(0);
			}			
			
			if(col == 4){
				countX = 1 ;
				countO = 1 ;
				col = 1 ;
			}
		}
		
		// Checking for vertical columns
		row = 1 ;
		col = 1 ;
		countX = 1 ;
		countO = 1 ;
		
		for(col = 1 ; col <= 3 ; col++){
			for(row = 1 ; row <= 3 ; row++){
				if(arr[row][col] == "X"){
					countX++ ;
				} else if (arr[row][col] == "O"){
					countO++ ;
				}				
			}
			
			if(countX == 4){
				System.out.println("\n\nX won the game");
				state = false ;
				System.exit(0);
			} else if(countO == 4){
				System.out.println("\n\nO won the game");
				state = false ;
				System.exit(0);
			}
				
			if(row == 4){
				countX = 1 ;
				countO = 1 ;
				row = 1 ;
			}
		}
		
		// Checking for diagonal scenarios
		
		row = 1 ;
		col = 1 ;
		countX = 1 ;
		countO = 1 ;
		
		for(row = 1 ; row <= 3 ; row++){
			for(col = 1 ; col <= 3 ; col++){
				if(row == col) {
					if(arr[row][col] == "X"){
						countX++ ;
					} else if (arr[row][col] == "O"){
						countO++ ;
					}
				}		
			}
			
			if(countX == 4){
				System.out.println("\n\nX won the game");
				state = false ;
				System.exit(0);
			} else if(countO == 4){
				System.out.println("\n\nO won the game");
				state = false ;
				System.exit(0);
			}
			
			if(col == 4){
				col = 1 ;
			}
		}
		
		// Checking for diagonal scenarios
		
		row = 1 ;
		col = 1 ;
		countX = 1 ;
		countO = 1 ;
		
		for(row = 1 ; row <= 3 ; row++){
			for(col = 1 ; col <= 3 ; col++){
				if((row == 1 && col == 3) || (row == 2 && col == 2) || (row == 3 && col == 1)) {
					if(arr[row][col] == "X"){
						countX++ ;
					} else if (arr[row][col] == "O"){
						countO++ ;
					}
				}
				
			}
			
			if(countX == 4){
				System.out.println("\n\nX won the game");
				state = false ;
				System.exit(0);
			} else if(countO == 4){
				System.out.println("\n\nO won the game");
				state = false ;
				System.exit(0);
			}			
			
			if(col == 4){
				col = 1 ;
			}
		}
		
		return state ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = new String[4][4] ;
		int rowNo = 0 , colNo = 0 ;
		boolean gameState = true ;
		
		Scanner sc = new Scanner(System.in) ;
		
		for(int count = 1 ; count < 10 ; count++){
			if((count % 2) != 0){
				System.out.println("\n\nPlayer X, enter the row and col no [1-3] :");
			} else {
				System.out.println("\n\nPlayer O, enter the row and col no [1-3] :");
			}
			
			rowNo = sc.nextInt() ;
			colNo = sc.nextInt() ;
			
			if((rowNo > 3 || rowNo <= 0) || (colNo > 3 || colNo <= 0)) {
				System.out.println("Row No entered " + rowNo + " is incorrect. Please enter row no between 1-3.");
				System.out.println("Col No entered " + colNo + " is incorrect. Please enter col no between 1-3.");
				count-- ;		
				continue ;
			}
			
			if((count % 2) != 0){
				arr[rowNo][colNo] = "X" ;
			} else {
				arr[rowNo][colNo] = "O" ;
			}
			
			arr = fillXOrO(arr, rowNo, colNo) ;
			
			if(count >= 5) {
				gameState = checkForResult(arr) ;
				if(count == 9 && gameState == true) {
					System.out.println("\n\n Match drawn");
				}
			}
		}	
		
		sc.close();
	}

}