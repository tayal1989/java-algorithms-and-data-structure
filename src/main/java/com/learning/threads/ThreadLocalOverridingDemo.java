package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 19-Jun-2021 11:22:22 am
 * @classDescription
*/

// Program 12

class ThreadLocalOverridingDemo {

	public static void main(String[] args) {
		ThreadLocal<String> tl = new ThreadLocal<String>() {
			public String initialValue() {
				return "abc";
			}
		};
		
		System.out.println(tl.get());
		tl.set("Vishal");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
