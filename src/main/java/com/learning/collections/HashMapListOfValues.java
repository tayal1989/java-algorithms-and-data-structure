package com.learning.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMapListOfValues {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		map.put("a", list1);
		map.put("b", list2);
		
		
		Iterator<Map.Entry<String, ArrayList<Integer>>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, ArrayList<Integer>> entry = itr.next();
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			for(int i = 0; i < entry.getValue().size(); i++) {
				System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue().get(i));
			}
			
			Iterator<Integer> itrInnerSet = entry.getValue().iterator();
			while(itrInnerSet.hasNext()) {
				System.out.println("Key : " + entry.getKey() + " Value : " + itrInnerSet.next());
			}
		}
		
		System.out.println();
		
		HashMap<String, HashSet<Integer>> mapSet = new HashMap<String, HashSet<Integer>>();
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		mapSet.put("a", set1);
		mapSet.put("b", set2);
		
		
		Iterator<Map.Entry<String, HashSet<Integer>>> itrSet = mapSet.entrySet().iterator();
		while(itrSet.hasNext()) {
			Map.Entry<String, HashSet<Integer>> entry = itrSet.next();
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			Iterator<Integer> itrInnerSet = entry.getValue().iterator();
			while(itrInnerSet.hasNext()) {
				System.out.println("Key : " + entry.getKey() + " Value : " + itrInnerSet.next());
			}
		}
	}

}
