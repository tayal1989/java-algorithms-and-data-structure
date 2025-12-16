package com.learning.threads;

class MyThreadInterruptMethod implements Runnable {

	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Child Thread : " + i);
				Thread.sleep(2000);
			}
		} catch(InterruptedException ie) {
			System.out.println("Child Thread got interrupted");
		}
	}

}

class ThreadInterruptDemo {

	public static void main(String[] args) {
		MyThreadInterruptMethod r = new MyThreadInterruptMethod();
		Thread t = new Thread(r);
		t.start();
		t.interrupt();
		
		System.out.println("End of main");
	}

}
