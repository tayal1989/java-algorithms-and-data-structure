package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 06-Jun-2021 1:47:12 pm
 * @classDescription
*/

public class ThreadGroupEnumerateDemo {

	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		
		for(Thread t1 : t) {
			System.out.println(t1.getName() + "....." + t1.isDaemon());
		}
	}

}
