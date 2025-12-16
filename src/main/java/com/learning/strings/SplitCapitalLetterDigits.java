package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitCapitalLetterDigits {

	public static void main(String[] args) {
		List<String> inputString = Arrays.asList("MAjay25", "MVijay26", "MRam24");
		
		for(int ind = 0 ; ind < inputString.size() ; ind++) {
			String[] split1 = inputString.get(ind).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
			String[] split2 = split1[0].split("(?<=.)(?=\\p{Lu})");
			List<String> list = new ArrayList<String>();
			for(int i = 0 ; i < split2.length ; i++) {
				list.add(split2[i]);
			}
			list.add(split1[1]);
			System.out.println(list);
		}
	}

}
