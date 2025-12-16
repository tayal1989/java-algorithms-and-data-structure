package com.learning.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearningTreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		/*
		 * For an empty tree-set, when trying to insert null 
		 * as the first value, one will get NPE from JDK 7. 
		 * From JDK 7 onwards, null is not at all accepted 
		 * by TreeSet. However, up to JDK 6, null was accepted 
		 * as the first value, but any insertion of more null 
		 * values in the TreeSet resulted in NullPointerException. 
		 * Hence, it was considered as a bug and thus 
		 * removed in JDK 7.
		 */
		
//		set.add(null);
//		System.out.println(set);

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
