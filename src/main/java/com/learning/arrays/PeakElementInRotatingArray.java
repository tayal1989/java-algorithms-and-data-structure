package com.learning.arrays;

/**
 * <h1>PeakElementInRotatingArray</h1>
 * The PeakElementInRotatingArray.java program will find a peak element in a 
 * rotating array i.e. array will be increasing then decreasing then increasing and vice
 * versa.
 * 
 * <p>
 * Given an array of integers. Find a peak element in it. An array element is peak if it is NOT 
 * smaller than its neighbors. For corner elements, we need to consider only one neighbor. 
 * For example, for input array {5, 10, 20, 15}, 20 is the only peak element. 
 * For input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90. 
 * Note that we need to return any one peak element. <br>
 * <br>
 * Following corner cases give better idea about the problem. <br>
 * 1) If input array is sorted in strictly increasing order, the last element is always a peak element.
 * For example, 50 is peak element in {10, 20, 30, 40, 50}. <br>
 * 2) If input array is sorted in strictly decreasing order, the first element is always a peak element. 
 * 100 is the peak element in {100, 80, 60, 50, 20}.	<br>
 * 3) If all elements of input array are same, every element is a peak element. <br>
 * <br>
 * It is clear from above examples that there is always a peak element in input array in any input array.
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(log n)
 */

public class PeakElementInRotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {1,3,5,7,19,221,132,56,8,6,4,2,1,-3,-17} ;
		
		int[] arr = {1,3,5,7,19,121,221,56,8,6,4,164,1,-3, -17} ;
		
		int mid = arr.length / 2 ;
		
		int peakElement = arr[mid] ;
		
		System.out.println("Peak element : " + arr[mid] + " mid : " + mid + " arr length : " + arr.length);
		
		int j = 1, temp = arr[0] ;
		
		while(j < mid){
			if(((mid + j) < arr.length) && ((mid - j) >= 0)){
				if (arr[mid + j] < arr[mid - j]) {
					temp = arr[mid - j] ;
				} else {
					temp = arr[mid + j] ;
				}
			}
			
			if(peakElement < temp){
				peakElement = temp ;
			}
			
			j++ ;
		}
		
		if((arr.length % 2) == 0) {
			if(peakElement < arr[0]){
				peakElement = arr[0] ;
			}
		}
		
		System.out.println("Highest number : " + peakElement);
	}

}
