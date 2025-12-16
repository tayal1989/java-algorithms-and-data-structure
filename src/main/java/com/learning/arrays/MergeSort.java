package com.learning.arrays;

/**
 * <h1>MergeSorting</h1>
 * MergeSort is a Divide and Conquer algorithm. 
 * 
 * <p>
 * Merge Sort divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. 
 * The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that 
 * assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. <br>
 * If r > l	<br>
 * 1. Find the middle point to divide the array into two halves:  <br>
 * 		middle m = (l+r)/2	<br>
 * 2. Call mergeSort for first half:   <br>
 *      Call mergeSort(arr, l, m)		<br>
 * 3. Call mergeSort for second half:
 *      Call mergeSort(arr, m+1, r)	<br>
 * 4. Merge the two halves sorted in step 2 and 3:	<br>
 *      Call merge(arr, l, m, r)
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n log n)
 */

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 4, 1} ;
		System.out.println("Original Array : ");
		printArray(arr);
		mergeSort(arr, 0, arr.length - 1) ;
		System.out.println("Array after merge sort : ");
		printArray(arr);
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l + r) / 2 ;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			sort(arr, l, m, r) ;
		}
	}

	private static void sort(int[] arr, int l, int m, int r) {
		System.out.println("L : " + l + " M : " + m + " R : " + r);
		int n1 = m - l + 1 ;
		int n2 = r - m ;
		int[] leftArr = new int[n1] ;
		int[] rightArr = new int[n2] ;
		
		for(int i = 0 ; i < n1 ; i++) {
			leftArr[i] = arr[i + l] ;
		}
		
		for(int i = 0 ; i < n2 ; i++) {
			rightArr[i] = arr[m + 1 + i] ;
		}
		
		int i = 0 , j = 0 , k = l ;
		
		while(i < n1 && j < n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i] ;
				i++ ;
			} else {
				arr[k] = rightArr[j] ;
				j++ ;
			}
			k++ ;
		}
		
		while(i < n1) {
			arr[k] = leftArr[i] ;
			i++ ;
			k++ ;
		}
		
		while(j < n2) {
			arr[k] = rightArr[j] ;
			j++ ;
			k++ ;
		}
		
	}

	private static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
