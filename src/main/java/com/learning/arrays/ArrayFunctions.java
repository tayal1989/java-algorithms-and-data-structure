package com.learning.arrays;

import java.util.Scanner;

/**
 * <h1>ArrayFunctions</h1>
 * The ArrayFunctions.java program covers array related functions like sorting, searching, addition and average
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date	21-Jul-2016
 */

public class ArrayFunctions {
	
	/**
	 * Method will find the average of numbers
	 * @param arr - Array with values
	 * @category complexity - O(n)
	 */
	public static void average(int[] arr){
		int sum = 0 ;
		
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i] ;
		}
		
		System.out.println("Average of number is : " + sum/arr.length);
	}
	
	
	/**
	 * Method will find the largest number in the given array
	 * @param arr - Array with values
	 * @category complexity - O(n)
	 */
	public static void largestNumberInArray(int[] arr){
		int large = arr[0] ;
		
		for(int i = 0; i < arr.length; i++){
			if(large < arr[i]){
				large = arr[i] ;
			}
		}
		
		System.out.println("Largest number in array is : " + large);
	}
	
	
	/**
	 * Method will find the smallest number in the given array
	 * @param arr - Array with values
	 * @category complexity - O(n)
	 */
	public static void smallestNumberInArray(int[] arr){
		int small = arr[0] ;
		
		for(int i = 1; i < arr.length; i++){
			if(small > arr[i]){
				small = arr[i] ;
			}
		}
		
		System.out.println("Smallest number in array is : " + small);
	}
	
	
	/**
	 * Method will swap the numbers in the given array
	 * @param arr - Array with values
	 * @category complexity - O(n)
	 */
	public static void swapNumberInArray(int[] arr){
		int temp ;
		
		for(int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println("Swapped numbers are : ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
	
	
	/**
	 * Method will search number in the given array by looking for the
	 * element one by one i.e. first it will go to first element then second
	 * then third and so on.
	 * @param arr - Array with values
	 * @param sc - Scanner object for the number which is to be found out
	 * @category complexity - O(n)
	 */
	public static void linearSearchInArray(int[] arr, Scanner sc){
		System.out.println("Enter the element to be searched : ");
		int findNumber = sc.nextInt();
		boolean flag = true ;
		
		for(int i = 0; i < arr.length; i++){
			if(findNumber == arr[i]){
				System.out.println("Element " + findNumber + " is found at position :" + (i + 1));
				flag = false ;
			}
		}
		
		if(flag == true){
			System.out.println("Element you entered is not present in the array");
		}		
	}
	
	
	/**
	 * The algorithm works by selecting the smallest unsorted item and then 
	 * swapping it with the item in the next position to be filled. The selection sort 
	 * works as follows: you look through the entire array for the smallest element, 
	 * once you find it you swap it (the smallest element) with the first element of the array. 
	 * Then you look for the smallest element in the remaining array 
	 * (an array without the first element) and swap it with the second element. Then you look 
	 * for the smallest element in the remaining array 
	 * (an array without first and second elements) and swap it with the third element, and so on
	 * Example :	<br>
	 *	29, 64, 73, 34, 20, <br>
	 *	20, 64, 73, 34, 29, <br>
	 *	20, 29, 73, 34, 64  <br>
	 *	20, 29, 34, 73, 64  <br>
	 *	20, 29, 34, 64, 73
	 * @param arr - Array with values
	 * @category complexity - O(n2)
	 */
	public static void selectionSortingInArray(int[] arr){
		
		for(int i = 0; i < arr.length - 1; i++){
			int minIndex = i ;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j ;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Sorted numbers are : ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	
	/**
	 * The bubble sort algorithm works by comparing each item in the list 
	 * with the item next to it, and swapping them if required. In other words, 
	 * the largest element has bubbled to the top of the array. The algorithm repeats 
	 * this process until it makes a pass all the way through the list without swapping any items
	 * Example :	<br>
	 * 7, 5, 2, 4, 3, 9	<br>
	 *	5, 7, 2, 4, 3, 9	<br>
	 *	5, 2, 7, 4, 3, 9	<br>
	 *	5, 2, 4, 7, 3, 9	<br>
	 *	5, 2, 4, 3, 7, 9	<br>
	 *	5, 2, 4, 3, 7, 9
	 * @param arr - Array with values
	 * @category complexity - O(n2)
	 */
	public static void bubbleSortingInArray(int[] arr){
		
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i ; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted numbers are : ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	
	/**
	 * To sort unordered list of elements, we remove its entries one at a time 
	 * and then insert each of them into a sorted part (initially empty)
	 * Example :	<br>
	 * 29, 20, 73, 34, 64		<br>
	 *	29, 20, 73, 34, 64 	<br>
	 *	20, 29, 73, 34, 64 	<br>
	 *	20, 29, 73, 34, 64 	<br>
	 *	20, 29, 34, 73, 64 	<br>
	 *	20, 29, 34, 64, 73 
	 * @param arr - Array with values
	 * @category complexity - O(n2)
	 */
	public static int[] insertionSortingInArray(int[] arr){
		
		for(int i = 1; i < arr.length; i++){
			for(int j = i; j > 0; j--){
				if(arr[j] < arr[j - 1]){
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted numbers are : ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		return arr ;
	}
	
	
	/**
	 * Binary search is a fast search algorithm with run-time complexity of Ο(log n). 
	 * This search algorithm works on the principle of divide and conquer. 
	 * For this algorithm to work properly the data collection should be in sorted form.
	 * Binary search search a particular item by comparing the middle most item of the collection. 
	 * If match occurs then index of item is returned. If middle item is greater than 
	 * item then item is searched in sub-array to the right of the middle item 
	 * other wise item is search in sub-array to the left of the middle item. 
	 * This process continues on sub-array as well until the size of sub-array reduces to zero.
	 * @param arr - Array with values
	 * @param sc - Scanner object for the number which is to be found out
	 * @category complexity - O(log n)
	 */
	public static int binarySearchInArray(int[] arr, boolean printStatement, Scanner sc){
		if(printStatement == false) {
			System.out.println("Enter the element to be searched : ");
		} else {
			System.out.println("Enter the element to be deleted : ");
		}
		
		int findNumber = sc.nextInt();
		int start = 0 , end = arr.length - 1, mid = 0 ;
		boolean flag = false ;
		
		while(start <= end){
			mid = (start + end)/2;
			if(findNumber == arr[mid]){
				flag = true ;				
				break;
			}else{
				if(arr[mid] > findNumber){
					end = mid - 1 ;
				}else{
					start = mid + 1 ;
				}
			}
		}
		
		if(printStatement == true) {
			if(flag == true) {
				System.out.println("Element " + findNumber + " is found at position :" + (mid));
			} else {
				System.out.println("Element you entered is not present in the array");
			}
		} else {
			if(flag == true) {
				System.out.println("Element " + findNumber + " is found at position :" + (mid + 1));
			} else {
				System.out.println("Element you entered is not present in the array");
			}
		}
		
		return mid ;
	}

	/**
	 * This method will help the user to insert an element in
	 * a sorted/ordered array
	 * @param arr - ordered array
	 * @param sc - Scanner object for the number which is to be found out
	 * @category complexity - O(n)
	 */
	public static void insertingElement(int[] arr, Scanner sc) {
		int index = 0, origInd = 0 ;
		System.out.println("Enter the element to be inserted in the given array : ");
		
		int insertElement = sc.nextInt() ;
		
		for(int ind = 0 ; ind < arr.length ;  ind++ ) {
			if(insertElement >= arr[arr.length - 1]) {
				index = arr.length ;
				break ;
			} else if (insertElement < arr[0]) {
				index = 0 ;
				break ;
			} else if (insertElement >= arr[ind] && insertElement <= arr[ind + 1] ) {	
				index = ind + 1 ;
				break ;
			}
		}
		
		int outputArr[] = new int[arr.length + 1] ;
		
		for(int ind = 0; ind < outputArr.length ; ind++) {
				if(ind == index) {
					outputArr[ind] = insertElement ;				
				} else {
					outputArr[ind] = arr[origInd] ;
					origInd++ ;
				}
		}
		
		System.out.println("New array after inserting the element : ");
		
		for(int i = 0; i < outputArr.length; i++){
			System.out.println(outputArr[i]);
		}
		
	}
	
	
	/**
	 * This method will help the user to delete an element in
	 * a sorted/ordered array
	 * @param arr - ordered array
	 * @param sc - Scanner object for the number which is to be found out
	 * @category complexity - O(n)
	 */
	public static void deletingElement(int[] arr, Scanner sc) {				
		int pos = ArrayFunctions.binarySearchInArray(arr, true, sc) ;
				
		for(int ind = pos; ind < arr.length - 1 ; ind++) {
			arr[ind] = arr[ind + 1] ;
		}
		
		System.out.println("New array after deleting the element : ");
		
		for(int i = 0; i < arr.length - 1; i++){
			System.out.println(arr[i]);
		}		
	}
	
	
	public static void findLengthOfArr(int[] arr) {
		int count = 0 ;
		for(int i : arr) {
			count++ ;
		}
		
		System.out.println("Length of array : " + count);
	}
	
	/**
	 * It will reverse the elements of the array
	 * @param arr - array elements
	 */
	public static void reverseOfArray(int[] arr) {
		System.out.println("Actual array : ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println("\nNew array after reversing the elements : ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * Main function to run this class, covers all the array functions
	 * @param args - user defined arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to enter in an array?");
		int size = sc.nextInt();
		
		int[] array = new int[size];		
		
		System.out.println("Enter the numbers : ");
		 
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println("Entered numbers are : ");
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		ArrayFunctions.findLengthOfArr(array);
		ArrayFunctions.average(array);
		ArrayFunctions.reverseOfArray(array);
		ArrayFunctions.largestNumberInArray(array);
		ArrayFunctions.smallestNumberInArray(array);
		ArrayFunctions.swapNumberInArray(array);
		ArrayFunctions.linearSearchInArray(array, sc);
		array = ArrayFunctions.insertionSortingInArray(array);
		ArrayFunctions.binarySearchInArray(array, false, sc);
		//ArrayFunctions.selectionSortingInArray(array);
		//ArrayFunctions.bubbleSortingInArray(array);		
		//ArrayFunctions.insertingElement(array, sc);
		ArrayFunctions.deletingElement(array, sc);
		
		sc.close();
	}

}
