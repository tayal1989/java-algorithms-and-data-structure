package com.learning.threads;

// Program 04

class MyThreadYieldMethod implements Runnable {

	public void run() {
		Thread.currentThread().setPriority(2);	// Line 1
		for(int i = 0 ; i < 10 ; i++) {
			Thread.yield();
			System.out.println("Child Thread : " + i);
		}
	}

}

class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThreadYieldMethod r = new MyThreadYieldMethod();
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

}

/*
* If line 1 is commented then both main and child thread will have same priority.
* However, chances of completing main thread 1 increases as we are introducing 
* yield() method.
* 
* If line is not commented then child method has priority 2 and main method has 
* priority 5 so 100% chance is that main method will be completed first.
*/