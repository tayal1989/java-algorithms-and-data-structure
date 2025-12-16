package com.learning.threads;

// 02 Program

public class ThreadNameDemo {
	public static void main(String[] args) {
		System.out.println("Default Thread Name : " + Thread.currentThread().getName());
		System.out.println("Default Thread Priority : " + Thread.NORM_PRIORITY);
		System.out.println("Default Thread Priority : " + Thread.MIN_PRIORITY);
		System.out.println("Default Thread Priority : " + Thread.MAX_PRIORITY);
		
		Thread t = new Thread();
		System.out.println("Another Thread Name : " + t.getName());
		
		// setting name of thread
		Thread.currentThread().setName("VishalThread");
		System.out.println("New thread name : " + Thread.currentThread().getName());
		System.out.println("Now observe the exception, observe the thread name");
		System.out.println(10/0);
	}

}
