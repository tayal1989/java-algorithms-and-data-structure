package com.learning.arrays;

import java.util.Scanner;

/**
 * <h1>OddEvenNoInOddEvenIndexSingleArray</h1>
 * The OddEvenNoInOddEvenIndexSingleArray.java program will make sure that 
 * odd number must go to odd index and even no must go to even
 * index. There will be only one array used here, so optimizing the code but
 * increasing the complexity.
 * 
 * <p>
 * We have basically swapped the elements in the array given instead of writing in another
 * array. If there is an odd number in even index, then swap this element with that number
 * which has an even number in odd index
 * For example : <br>
 * inputArray = {2, 3, 1, 5, 6, 4} ;	<br>
 * outputArray = {2, 3, 6, 1, 4, 5}
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class OddEvenNoInOddEvenIndexSingleArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1, 2, 3, 4, 5, 6} ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("How many elements you want to enter(Kindly chose an even number) : ");
		int lenOfArray = sc.nextInt() ;
		
		int[] arr = new int[lenOfArray] ;
		
		System.out.println("Kindly enter the numbers(make sure that it contains equal no of even and odd no : )");
		
		for(int input = 0 ; input < arr.length ; input++){
			arr[input] = sc.nextInt() ;
		}
		
		int temp = 0 ;
		
		for(int ind = 0 ; ind < arr.length ; ind++){
			if(((arr[ind] % 2) == 0) && ((ind % 2) == 0)){
				continue ;
			} else if(((arr[ind] % 2) != 0) && ((ind % 2) != 0)){
				continue ;				
			} else if(((arr[ind] % 2) != 0) && ((ind % 2) == 0)){
				for(int j = ind + 1 ; j < arr.length ; j++){
					if((arr[j] % 2) == 0){
						temp = arr[ind] ;
						arr[ind] = arr[j] ;
						arr[j] = temp ;
						break ;
					}
				continue ;
				}
				
			} else if(((arr[ind] % 2) == 0) && ((ind % 2) != 0)){
				for(int j = ind + 1 ; j < arr.length ; j++){
					if((arr[j] % 2) != 0){
						temp = arr[ind] ;
						arr[ind] = arr[j] ;
						arr[j] = temp ;
						break ;
					}
				continue ;
				}
				
			}
		}
		
		System.out.println("Output array : ");
		
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nOutput index : ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
