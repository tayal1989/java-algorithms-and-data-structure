package com.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {

	public static void main(String[] args) {
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> innerList1 = new ArrayList<String>();
		innerList1.add("a");
		innerList1.add("b");
		innerList1.add("c");
		
		ArrayList<String> innerList2 = new ArrayList<String>();
		innerList2.add("d");
		innerList2.add("e");
		innerList2.add("f");
		
		list.add(innerList1);
		list.add(innerList2);
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(1).get(2));
	}

}
