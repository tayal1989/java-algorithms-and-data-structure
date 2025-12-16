package com.learning.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6} ;
		int rotateBy = 3 ;
		rotateByLeftArray(arr, rotateBy);
		System.out.println();
		int[] arr1 = {1, 2, 3, 4, 5, 6} ;
		rotateByRightArray(arr1, rotateBy);
	}
	
	public static void rotateByLeftArray(int[] arr, int rotateByLeft) {
		int ind = 0 ;
		int temp = 0 ;
		
		while(ind < rotateByLeft) {
			temp = arr[0] ;
			
			for(int i = 0 ; i < arr.length - 1 ; i++) {
				arr[i] = arr[i + 1] ;
			}
			
			arr[arr.length - 1] = temp ;
			ind++ ;
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void rotateByRightArray(int[] arr, int rotateByRight) {
		int ind = 0 ;
		int temp = 0 ;
		
		while(ind < rotateByRight) {
			temp = arr[arr.length - 1] ;
			
			for(int i = arr.length - 1 ; i > 0 ; i--) {
				arr[i] = arr[i - 1] ;
			}
			
			arr[0] = temp ;
			ind++ ;
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
