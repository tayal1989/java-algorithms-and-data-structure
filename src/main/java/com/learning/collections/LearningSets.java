package com.learning.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearningSets {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println("\n" + set);	// Set don't have get function
	}

}
