package com.learning.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ImplementingComparatorMainClass {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>(new ImplementingComparator());
		
		set.add(2);
		set.add(3);
		set.add(1);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
