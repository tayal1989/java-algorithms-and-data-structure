package com.learning.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearningHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

		// using keySet() for iteration over keys
		for (String name : map.keySet()) {
			System.out.println("key: " + name);
		}

		// using values() for iteration over keys
		for (Integer url : map.values()) {
			System.out.println("value: " + url);
		}

		// using iterators
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

}
