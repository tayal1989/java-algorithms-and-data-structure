package com.learning.threads;

public class DeadlockSituation {

	public static void main(String[] args) {
		/*
		 * If a thread calls join method on the same thread itself then 
		 * the program will be stucked/paused(this is something like 
		 * deadlock situation). In this case, thread has to wait for 
		 * infinite amount of time.
		 */
		
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
