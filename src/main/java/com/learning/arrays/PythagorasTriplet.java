package com.learning.arrays;

import java.util.Arrays;
 
/**
 * <h1>PythagorasTriplet</h1>
 * The PythagorasTriplet.java program will find the triplets which follow the pythagoras theoram
 * 
 * <p>
 * For example : <br>
 * input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13} ;	<br>
 *	will give output as
 * Pythagoras Triplets are :5 12 13
 * Pythagoras Triplets are :6 8 10
 * Pythagoras Triplets are :3 4 5
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class PythagorasTriplet{ 
		public static void main(String[] args){
			
			int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13} ;
			int[] outputArr = new int[arr.length] ;
			
			for(int i = 0 ; i < arr.length ; i++){
				outputArr[i] = arr[i] * arr[i] ;
			}
			
			Arrays.sort(outputArr) ;
			int k = outputArr.length - 1 ;
			
			while(k >= 2) {
				int j = k - 1 ;
				int i = 0 ;
				while(i < j){
					if(outputArr[k] == outputArr[i] + outputArr[j]){
						System.out.println("Pythagoras Triplets are :" + arr[i] + " " + arr[j] + " " + arr[k]);
						break ;
					} else if(outputArr[i] + outputArr[j] < outputArr[k]) {
						i++ ;
					} else {
						j-- ;
					}
				}
				k-- ;
			}
		}
	
}

