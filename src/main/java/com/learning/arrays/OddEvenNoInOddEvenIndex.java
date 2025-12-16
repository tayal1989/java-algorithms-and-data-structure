package com.learning.arrays;

import java.util.Scanner;

/**
 * <h1>OddEvenNoInOddEvenIndex</h1>
 * The OddEvenNoInOddEvenIndex.java program will make sure that 
 * odd number must go to odd index and even no must go to even
 * index. There will be arrays used here, one for inputting elements
 * and another for storing the output.
 * 
 * <p>
 * For example : <br>
 * inputArray = {2, 3, 1, 5, 6, 4} ;	<br>
 * outputArray = {2, 3, 6, 1, 4, 5}
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class OddEvenNoInOddEvenIndex {

	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 4, 5, 6} ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("How many elements you want to enter(Kindly chose an even number) : ");
		int lenOfArray = sc.nextInt() ;
		
		int[] arr = new int[lenOfArray] ;
		
		System.out.println("Kindly enter the numbers(make sure that it contains equal no of even and odd no : )");
		
		for(int input = 0 ; input < arr.length ; input++){
			arr[input] = sc.nextInt() ;
		}
		
		int[] outputArr = new int[arr.length] ;
		
		int evenIndex = 0, oddIndex = 1 ;
		
		for(int ind = 0 ; ind < arr.length ; ind++){
			if(((arr[ind] % 2) == 0) && ((ind % 2) == 0)){
				outputArr[evenIndex] = arr[ind] ;
				evenIndex = evenIndex + 2 ;
			} else if((arr[ind] % 2) == 0){
				outputArr[evenIndex] = arr[ind] ;
				evenIndex = evenIndex + 2 ;
			} else {
				outputArr[oddIndex] = arr[ind] ;
				oddIndex = oddIndex + 2 ;
			}
		}
		
		System.out.println("Output array : ");
		
		for(int i = 0 ; i < outputArr.length ; i++){
			System.out.print(outputArr[i] + " ");
		}
		
		sc.close();
	}

}
