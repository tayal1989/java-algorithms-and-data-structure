package com.learning.threads;

// Program 03

class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Child Thread : " + i);
		}
	}

}

class ThreadRunnableDemo {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY);	// Setting child thread priority, 10 is highest and 1 is lowest
		t.start();
		
		System.out.println("Main Thread Priority : " + Thread.NORM_PRIORITY);	// Normal priority is 5
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

}
