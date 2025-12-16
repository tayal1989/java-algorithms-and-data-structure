package com.learning.threads;

// Program 05

class MyThreadJoinMethod implements Runnable {

	public void run() {
		try {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.println("Sita Thread");
				Thread.sleep(2000);	// After 5 SOPs, then Ram thread will begin execution
				//Thread.sleep(10);	// As soon as Sita gets printed 10 times, then Ram thread will begin execution
									// no need of waiting for 10 seconds
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
}

class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadJoinMethod r = new MyThreadJoinMethod();
		Thread t = new Thread(r);
		t.start();
		
		t.join();	//As this flow belongs to main thread therefore 
					//Main Thread will wait for child thread completion
		//t.join(10000);
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Ram Thread");
		}
	}

}
