package com.learning.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueWordsInSentence {

	public static void main(String[] args) {
		String sent = "my my my name name is is vishal";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] words = sent.split(" ");
		for(int i = 0; i < words.length; i++) {
			if(map.get(words[i]) != null) {
				map.put(words[i], map.get(words[i]) + 1);
			} else {
				map.put(words[i], 1);
			}
		}
		
		for (String key : map.keySet()) {
			System.out.print(key + " ");
		}

	}

}
