package com.learning.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class FootballTeamSelection {
	
	public static List<List<String>> getSelectionStatus(List<List<String>> applications) {
        List<List<String>> output = new ArrayList<List<String>>() ;
        List<String> selectedCandidate = new ArrayList<String>();
        List<String> rejectedCandidate = new ArrayList<String>();
        List<String> finalList = new ArrayList<String>();
        
        
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        HashMap<String, Integer> hmapd = new HashMap<String, Integer>();
        
        for(int i = 0 ; i < applications.size(); i++) {
            if(((Double.parseDouble(applications.get(i).get(1)) >= 5.8) && (Integer.parseInt(applications.get(i).get(2)) <= 23)) && ((Integer.parseInt(applications.get(i).get(3)) >= 50) || (Integer.parseInt(applications.get(i).get(4)) >= 30))) {
            	if((Integer.parseInt(applications.get(i).get(3)) >= 50) && (Integer.parseInt(applications.get(i).get(4)) < 30)) {
                    hmap.put(applications.get(i).get(0), Integer.parseInt(applications.get(i).get(3)));
                } else if((Integer.parseInt(applications.get(i).get(3)) < 50) && (Integer.parseInt(applications.get(i).get(4)) >= 30)) {
                    hmapd.put(applications.get(i).get(0), Integer.parseInt(applications.get(i).get(4)));
                }
            } else {
            	rejectedCandidate.add(applications.get(i).get(0) + " " + "REJECT NA");
            }
        }

        int countStriker = 0 ;
        int countDefender = 0 ;
        
        Iterator<Integer> maxGoals = hmap.values().iterator();
        int maxGoalsDone = 0 ;
        int goalsScored = 0 ;
        
        while(maxGoals.hasNext()) {
        	goalsScored = maxGoals.next();
        	if(maxGoalsDone < goalsScored) {
        		maxGoalsDone = goalsScored ;
        	}
        }
        
        Iterator<String> itr = hmap.keySet().iterator();
        
        while(itr.hasNext()) {
        	String playerName = itr.next();
        	if(hmap.get(playerName) == maxGoalsDone) {
        		countStriker++ ;
        		selectedCandidate.add(playerName + " SELECT STRIKER");
        	} else {
        		rejectedCandidate.add(playerName + " REJECT NA");
        	}
        }
        
        Iterator<Integer> maxDefend = hmapd.values().iterator();
        int maxGoalsDefended = 0 ;
        int goalsDefended = 0 ;
        
        while(maxDefend.hasNext()) {
        	goalsDefended = maxDefend.next();
        	if(maxGoalsDefended < goalsDefended) {
        		maxGoalsDefended = goalsDefended ;
        	}
        }
        
        Iterator<String> itr1 = hmapd.keySet().iterator();
        
        while(itr1.hasNext()) {
        	String playerName = itr1.next();
        	if(hmapd.get(playerName) == maxGoalsDefended) {
        		countDefender++ ;
        		selectedCandidate.add(playerName + " SELECT DEFENDER");
        	} else {
        		rejectedCandidate.add(playerName + " REJECT NA");
        	}
        }
        
        String playerName = "" ;
        String typeOfPlayer = "" ;
        
        
        for(int i = 0 ; i < applications.size(); i++) {
        	boolean selectedFlag = false ;
        	boolean rejectedFlag = false ;
        	for(int j = 0 ; j < selectedCandidate.size(); j++) {
        		playerName = selectedCandidate.get(j).split(" ")[0];
        		typeOfPlayer = selectedCandidate.get(j).split(" ")[2];
	        	if(playerName.equalsIgnoreCase(applications.get(i).get(0))) {	        		
	        		selectedFlag = true ;
	        		break ;
	        	}
        	}
        	
        	for(int j = 0 ; j < rejectedCandidate.size(); j++) {
        		playerName = rejectedCandidate.get(j).split(" ")[0];
	        	if(playerName.equalsIgnoreCase(applications.get(i).get(0))) {
	        		rejectedFlag = true ;
	        		break ;
	        	}
        	}
        	
        	if(selectedFlag && (countStriker == countDefender)) {
        		finalList.add(applications.get(i).get(0) + " SELECT " + typeOfPlayer);
        	} else if(rejectedFlag || (countStriker != countDefender)) {
        		finalList.add(applications.get(i).get(0) + " REJECT NA");
        	}
        }
        
        output.add(finalList);
        
        return output;
    }
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		
		list1.add("Boateng");
		list1.add("6.1");
		list1.add("22");
		list1.add("24");
		list1.add("45");
		
		list2.add("Kaka");
		list2.add("6");
		list2.add("22");
		list2.add("1");
		list2.add("1");
		
		list3.add("Ronaldo");
		list3.add("5.8");
		list3.add("21");
		list3.add("120");
		list3.add("0");
		
		list4.add("Suarez");
		list4.add("5.9");
		list4.add("20");
		list4.add("100");
		list4.add("1");
		
		List<List<String>> outerList = new ArrayList<List<String>>();
		outerList.add(list1);
		outerList.add(list2);
		outerList.add(list3);
		outerList.add(list4);
		
//		for(int i = 0 ; i < outerList.size() ; i++ ) {
//			System.out.println(outerList.get(i));
//		}
		
		List<List<String>> output = new ArrayList<List<String>>();
		
		output = getSelectionStatus(outerList);
		
		for(int i = 0 ; i < output.size() ; i++ ) {
			for(int j = 0 ; j < output.get(i).size(); j++) {
				System.out.println(output.get(i).get(j));
			}
			
		}
	}

}
