package com.learning.threads;

// Program 09

class ThreadB extends Thread {
	int total = 0 ;
	
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
		
			for(int i = 1 ; i <= 100 ; i++) {
				total = total + i;
			}
			
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}
}

class ThreadWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("Main Thread trying to call wait() method");
			b.wait(10000);
			System.out.println("Main Thread got notification from notify() method");
			System.out.println("Total of 100 numbers is : " + b.total);
		}
	}
}
