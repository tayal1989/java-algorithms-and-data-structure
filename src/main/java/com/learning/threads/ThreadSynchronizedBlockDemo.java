package com.learning.threads;

// Program 08

class DisplaySyncBlock {
		public void wish(String name) {
			;;;;;;;	// 1 lakh lines of code
			synchronized (this) {
//			synchronized (DisplaySyncBlock.class) {	// For getting class level lock
				try {
					for(int i = 0 ; i < 5 ; i++) {
						System.out.print("Good Morning : ");
						Thread.sleep(1000);
						System.out.println(name);
					}
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}			
			;;;;;;;	// 1 lakh lines of code
		}
}

class MyThreadSynchBlockMethod implements Runnable {
	
	DisplaySyncBlock d ;
	String name ;
	
	public MyThreadSynchBlockMethod(DisplaySyncBlock d, String name) {
		this.d = d ;
		this.name = name ;
	}

	public void run() {
		d.wish(name);
	}

}

class ThreadSynchronizedBlockDemo {

	public static void main(String[] args) {
		DisplaySyncBlock d1 = new DisplaySyncBlock();
		
		MyThreadSynchBlockMethod r1 = new MyThreadSynchBlockMethod(d1, "Vishal");
		MyThreadSynchBlockMethod r2 = new MyThreadSynchBlockMethod(d1, "Naina");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
