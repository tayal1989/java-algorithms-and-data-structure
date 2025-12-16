package com.learning.arrays;

public class Merge2SortedArray {

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 8} ;
		int[] b = {2, 4, 6, 8} ;
		
		int[] c = new int[a.length + b.length] ;
		
		int m = a.length ;
		int n = b.length ;
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				c[k] = a[i] ;
				i++ ;
			} else if(b[j] < a[i]) {
				c[k] = b[j] ;
				j++ ;
			} else {
				c[k] = a[i] ;
				i++ ;
			}
			k++ ;
		}
		
		while(i < m) {
			c[k] = a[i] ;
			i++ ;
			k++ ;
		}
		
		while(j < n) {
			c[k] = b[j] ;
			j++ ;
			k++ ;
		}
		
		for(int ind = 0 ; ind < c.length ; ind++) {
			if(ind != c.length - 1) {
				System.out.print(c[ind] + " ");
			} else {
				System.out.print(c[ind]);
			}
			
		}

	}

}
