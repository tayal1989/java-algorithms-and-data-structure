package com.learning.threads;

class ThreadA extends Thread {
	int total = 0 ;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
		
			for(int i = 1 ; i <= 100 ; i++) {
				total = total + i ;
			}
			
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}
}

class ThreadWaitSynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadA b = new ThreadA();
		b.start();
//		Thread.sleep(10000);		//1st solution but it is making CPU idle for 10 seconds
//		b.join();					//2nd solution but it will wait for the complete execution of method
//		b.wait();					//If we use this without using synchronized then it will
									//throw IllegalMonitorStateException
		
		Thread.sleep(10000); 		//Now this will wait for forever as child thread has already
									//given notification when main thread was sleeping but main thread
									//have no information regarding this. To avoid this kind of scenario,
									//always give wait with time period.
		synchronized (b) {
			System.out.println("Main Thread trying to call wait() method");
//			b.wait();
			b.wait(10000);
			System.out.println(b.total);
		}
	}
}
