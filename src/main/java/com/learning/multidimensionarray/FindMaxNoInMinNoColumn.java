package com.learning.multidimensionarray;

public class FindMaxNoInMinNoColumn {

	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} } ;
		
		int min = arr[0][0] ;
		int max = arr[0][0] ;
		int colNo = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j] ;
					colNo = j ;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i][colNo] > max) {
				max = arr[i][colNo] ;
			}
		}
		
		System.out.println("Min number : " + min);
		System.out.println("Max number in min number column : " + max);

	}

}
