package com.learning.arrays;

public class ReduceSizeOfArrayLongSolution {

	public static void myMethod(int[] arr) {
		int[] outputArr = new int[arr.length];
		int min = arr[0];
		int diff = 0;
		int countArr = 0;
		int ind = 0;
		int num = 0;

		while (num < arr.length) {
			countArr = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					countArr++;
				}
			}

			outputArr[ind] = countArr;
			ind++;

			// find the min element
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i] && arr[i] != 0) {
					min = arr[i]; // 1, 2
				}
			}

			// finding the difference and updating array values
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					diff = arr[i] - min;
					arr[i] = diff; // 0, 2, 2, 6, 8 //0, 0, 0, 4, 6 //0, 0, 0, 0, 2
				}
			}

			min = arr[arr.length - 1];

			// If all elements are 0 or not, if all are 0 then break else continue
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					break;
				}
			}
			num++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(outputArr[i] + " ");
		}
	}

	public static void main(String[] args) {
//		int[] arr = { -1, 0, 3, 7, 9 };
//		int[] arr = { 0, 0, 3, 7, 9 };
		int[] arr = { 1, 3, 3, 7, 9 };
//		int[] arr = { 1, 1, 1, 1, 9 };
		myMethod(arr);
	}

}
