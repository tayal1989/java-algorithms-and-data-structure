package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 19-Jun-2021 11:24:20 am
 * @classDescription
*/

class CustomerThread extends Thread {
	static Integer custId = 0 ;
	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " executed with customer id : " + tl.get());
	}
}

class ThreadLocalMultipleIdDemo {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
