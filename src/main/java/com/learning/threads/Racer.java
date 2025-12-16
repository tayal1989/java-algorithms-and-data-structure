/**
 * 
 */
package com.learning.threads;

/**
 * <h1>Racers.java</h1>
 * The Racers.java program implements an application that will show the working of Thread
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

public class Racer implements Runnable {

	public static String winner ;
	
	public void race () {
		for(int dist = 1 ; dist <= 10 ; dist++) {
			System.out.println("Distance covered by " + Thread.currentThread().getName() + " is " + dist + " meters");
			boolean isRaceWon = this.isRaceWon(dist) ;
			
			if(isRaceWon) {
				break ;
			}
		}
	}
	
	private boolean isRaceWon(int dist) {
		boolean isRaceWon = false ;
		if(Racer.winner == null  && dist == 10 ) {
			Racer.winner = Thread.currentThread().getName() ;
			System.out.println("Winner is :--> " + Racer.winner);
			isRaceWon = true ;
		} else if (Racer.winner == null) {
			isRaceWon = false;
		} else if (Racer.winner != null) {
			isRaceWon = true ;
		}
		return isRaceWon ;
	}

	public void run() {
		// TODO Auto-generated method stub
		this.race();
	}
		
		
	

}
