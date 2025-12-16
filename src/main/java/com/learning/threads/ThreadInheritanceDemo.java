package com.learning.threads;

/**
 * @author Vishal Agarwal
 * @version Creation time: 19-Jun-2021 1:51:22 pm
 * @classDescription
*/

class ParentThread extends Thread {
//	public static ThreadLocal<String> tl = new ThreadLocal<String>();	// It will produce null value in child thread
//	public static InheritableThreadLocal<String> tl = new InheritableThreadLocal<String>();	// It will produce pp value in child thread
	public static InheritableThreadLocal<String> tl = new InheritableThreadLocal<String>() {
		@Override
		public String childValue(String p) {
			return "cc" ;
		}
	};	// It will produce cc value in child thread
	
	@Override
	public void run() {
		tl.set("pp");
		System.out.println("Parent thread value : " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("Child thread value : " + ParentThread.tl.get());
	}
}

class ThreadInheritanceDemo {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}

}
