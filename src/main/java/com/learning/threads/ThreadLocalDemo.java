package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 17-Jun-2021 10:44:25 am
 * @classDescription
*/

// Program 11

public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal<String> tl = new ThreadLocal<String>();
		System.out.println(tl.get());
		tl.set("Vishal");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
