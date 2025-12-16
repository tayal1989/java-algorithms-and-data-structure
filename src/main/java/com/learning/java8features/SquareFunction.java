package com.learning.java8features;

import java.util.function.Function;

public class SquareFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i * i;

		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Square of no " + i + " is : " + f1.apply(i));
		}

	}

}
