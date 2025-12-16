package com.learning.threads;

// Program 06

class Display {
		public synchronized void wish(String name) {
		/*
		 * If a thread wants to execute a static synchronized method then
		 * thread require class level lock. Once thread got class level 
		 * lock then it is allowed to execute any static synchronized method of
		 * that class. Once method execution completes, automatically, thread
		 * releases the lock.
		 */
//		public static synchronized void wish(String name) { // 
			try {
				for(int i = 0 ; i < 3 ; i++) {
					System.out.print("Good Morning : ");
					Thread.sleep(1000);
					System.out.println(name);
				}
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
}

class MyThreadSynchronizedMethod implements Runnable {
	
	Display d ;
	String name ;
	
	public MyThreadSynchronizedMethod(Display d, String name) {
		this.d = d ;
		this.name = name ;
	}

	public void run() {
		d.wish(name);
	}

}

class ThreadSynchronizedDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
//		Display d2 = new Display();	// Multiple threads operating on multiple objects 
									// then there is no impact of synchronization
		
		MyThreadSynchronizedMethod r1 = new MyThreadSynchronizedMethod(d1, "Vishal");
		MyThreadSynchronizedMethod r2 = new MyThreadSynchronizedMethod(d1, "Naina");
//		MyThreadSynchronizedMethod r2 = new MyThreadSynchronizedMethod(d2, "Naina");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
