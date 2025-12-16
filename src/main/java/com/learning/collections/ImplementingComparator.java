package com.learning.collections;

import java.util.Comparator;

public class ImplementingComparator implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		//return o1.compareTo(o2); // will return 1, 2, 3
		return o2.compareTo(o1); // will return 3, 2, 1
		//return -o1.compareTo(o2); // will return 3, 2, 1
		//return -o2.compareTo(o1); // will return 1, 2, 3
	}

}
