package com.learning.threads;

class DaemonThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Lazy Thread");
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

class ThreadDaemonDemo {
	public static void main(String[] args) {
		System.out.println("Is Main Thread a daemon thread : " + Thread.currentThread().isDaemon());
		DaemonThread t = new DaemonThread();
		System.out.println("Is Child Thread a daemon thread : " + t.isDaemon());
		t.setDaemon(true);
		t.start();
		System.out.println("End of main thread");
		System.out.println("As soon as main thread execution gets over, child thread execution " + 
		"also gets over. JVM will not care child tasks are remaining or not.");
	}

}
