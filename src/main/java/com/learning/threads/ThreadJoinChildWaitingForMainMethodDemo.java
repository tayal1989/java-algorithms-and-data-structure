package com.learning.threads;

class MyThreadJoinChildWaitingForMainMethod implements Runnable {
	public static Thread mt ;
	
	public void run() {
		try {
			mt.join();	// In this example, child thread calls join method on main thread object.
						// Hence, child thread has to wait until completing main thread.
						// In this case, output will be Main Thread - 10 times and then followed
						// by Child Thread - 10 times.
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Child Thread : " + i);
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

class ThreadJoinChildWaitingForMainMethodDemo {

	public static void main(String[] args) {
		MyThreadJoinChildWaitingForMainMethod.mt = Thread.currentThread();
		
		MyThreadJoinChildWaitingForMainMethod r = new MyThreadJoinChildWaitingForMainMethod();
		Thread t = new Thread(r);
		t.start();
		
		/*
		 * If main thread calls join method on child thread object and child thread
		 * calls join method on main thread object then both threads will wait forever
		 * and the program will be stucked/paused(this is something like deadlock).
		 */
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		try {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(2000);
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
