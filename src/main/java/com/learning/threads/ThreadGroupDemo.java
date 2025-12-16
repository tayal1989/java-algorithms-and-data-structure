package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 06-Jun-2021 12:38:29 pm
 * @classDescription To learn thread group demo
*/

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
		System.out.println(g2.getParent().getName());
		
		ThreadGroup tg = new ThreadGroup("Thread Group");
		System.out.println(tg.getMaxPriority());
		
		Thread t1 = new Thread(tg, "First Thread");
		Thread t2 = new Thread(tg, "Second Thread");
		
		tg.setMaxPriority(3);
		
		Thread t3 = new Thread(tg, "Third Thread");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		tg.list();
	}

}
