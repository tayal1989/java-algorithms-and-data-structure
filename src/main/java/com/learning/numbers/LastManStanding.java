package com.learning.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vishal Agarwal
 * @version Creation time: 04-Sep-2021 12:45:54 pm
 * @classDescription
*/

public class LastManStanding {

	public static void main(String[] args) {
		List<Integer> winnerList = new ArrayList<Integer>();
		List<Integer> loserList = new ArrayList<Integer>();
		int noOfPlayers = 16 ;
		int start = 1 ;
		int end = noOfPlayers ;
		while(start < end) {
			if(start % 2 != 0) {
				System.out.println("Player " + start + " will go against Player " + end + ", winner will be : " + start);
				winnerList.add(start);
			} else {
				System.out.println("Player " + start + " will go against Player " + end + ", winner will be : " + start);
				loserList.add(end);
			}
			start++ ;
			end-- ;
		}
		
		start = 0 ;
		end = winnerList.size() ;
		while(winnerList.get(0) < winnerList.get(winnerList.size())) {
			
		}
	}

}
