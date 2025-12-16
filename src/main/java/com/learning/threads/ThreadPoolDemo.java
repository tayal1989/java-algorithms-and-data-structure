package com.learning.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Vishal Agarwal
 * @version Creation time: 12-Jun-2021 9:30:37 pm
 * @classDescription
*/

class PrintJob implements Runnable {

	String name;
	
	PrintJob(String name) {
		this.name = name ;
	}
	
	public void run() {
		System.out.println(name + "...job started by thread:" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(name + "...job completed by thread:" + Thread.currentThread().getName());
	}
}

class ThreadPoolDemo {

	public static void main(String[] args) {
		PrintJob[] printJobs = { new PrintJob("Durga"),
								new PrintJob("Vishal"),
								new PrintJob("Naina"),
								new PrintJob("Pihu"),
								new PrintJob("Myra"),
								new PrintJob("Rohit")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(PrintJob job:printJobs) {
			service.submit(job);
		}
		
		service.shutdown();
	}

}
