package com.learning.threads;

/**
 * <h1>RaceThreadDemo.java</h1>
 * The RaceThreadDemo.java program implements an application that
 * 
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		26-Sep-2016
 */

public class RaceThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racer racer = new Racer() ;
		
		Thread tortoiseThread = new Thread(racer, "Tortoise") ;
		Thread hareThread = new Thread(racer, "Hare") ;
		
		//Start() function will start the threads
		tortoiseThread.start();
		hareThread.start();
		
	}

}
