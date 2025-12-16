package com.learning.threads;

// Program 07

class DisplayClass {
		public void displayNumber() {	//If the method is non-synchronized then irregular output will come
//		public synchronized void displayNumber() {	//If the method is non-synchronized then irregular output will come
			try {
				for(int i = 0 ; i < 5 ; i++) {
					System.out.print(i);
					Thread.sleep(1000);
				}
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
		
//		public void displayChar() {
		public synchronized void displayChar() {
			try {
				for(int i = 65 ; i < 75 ; i++) {
					System.out.print((char)i);
					Thread.sleep(1000);
				}
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
}

class MyThreadSynchMethod1 implements Runnable {
	
	DisplayClass d ;
	
	public MyThreadSynchMethod1(DisplayClass d) {
		this.d = d ;
	}

	public void run() {
		d.displayNumber();
	}

}

class MyThreadSynchMethod2 implements Runnable {
	
	DisplayClass d ;
	
	public MyThreadSynchMethod2(DisplayClass d) {
		this.d = d ;
	}

	public void run() {
		d.displayChar();
	}

}

class ThreadSynchronizedDemoWithMutlipleThreadClass {

	public static void main(String[] args) {
		DisplayClass d = new DisplayClass();
		
		MyThreadSynchMethod1 r1 = new MyThreadSynchMethod1(d);
		MyThreadSynchMethod2 r2 = new MyThreadSynchMethod2(d);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
