package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 06-Jun-2021 1:32:47 pm
 * @classDescription
*/

class MyThreadGroup extends Thread {
	
	MyThreadGroup(ThreadGroup g, String name) {
		super(g, name);
	}
	
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

class ThreadGroupMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Thread Group");
		ThreadGroup cg = new ThreadGroup(pg, "Chile Thread Group");
		MyThreadGroup t1 = new MyThreadGroup(pg, "Child Thread 1 of Parent Thread Group");
		MyThreadGroup t2 = new MyThreadGroup(pg, "Child Thread 2 of Parent Thread Group");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}

}
