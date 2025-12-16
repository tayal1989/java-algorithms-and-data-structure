package com.learning.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueNumber {

	public static void main(String[] args) {

		int[] a = {1, 1, 2, 3, 4, 2, 3} ;
		HashMap<Integer, Integer> hmap = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(hmap.get(a[i]) != null) {
				hmap.put(a[i], hmap.get(a[i]) + 1) ;
			} else {
				hmap.put(a[i], 1) ;
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("Unique Element : " + entry.getKey());
			}
		}

	}

}
