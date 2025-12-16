package com.learning.strings;

/**
 * @author Vishal Agarwal
 * @version Creation time: 08-Jun-2021 3:34:33 pm
 * @classDescription
*/

public class FindNumericAlphabetic {

	public static void main(String[] args) {
		System.out.println(verifyTextEnteredIsStringOrNumericOrAlphaNumeric("aabb aabb".toLowerCase()));
	}

	private static String verifyTextEnteredIsStringOrNumericOrAlphaNumeric(String text) {
		if (text.matches("[0-9]+")) {
			return "isNumeric";
		} else if (text.matches("[a-z ]+")) {
			return "isAlphabetic";
		} else if (text.matches("[a-z0-9]+")) {
			return "isAlphaNumeric";
		} else {
			return "containsSpecialCharacter";
		}
	}
}
