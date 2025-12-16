package com.learning.practise;

import java.util.*;

public class MinValueInHashMap {

	public static void main(String args[])
    { 
  
        // Creating hashMap 
        Map<String, Integer> map = new HashMap<>();
  
        // Putting key-value pairs in map 
        map.put("F", 10); 
        map.put("B", 15); 
        map.put("A", 20); 
        map.put("D", 25); 
  
        // Print the map 
//        System.out.println("Map: " + map); 
//        
//        int maxValueInMap=(Collections.min(map.values()));  // This will return max value in the Hashmap
//        for (Entry<String, Integer> entry : map.entrySet()) {  // Iterate through hashmap
//            if (entry.getValue()==maxValueInMap) {
//                System.out.println(entry.getKey());     // Print the key with max value
//            }
//        }
  
        // getting minimum value using min() 
        int minValue = Collections.min(map.values()); 
  
        // getting maximum value using max() 
        int maxValue = Collections.max(map.values()); 
  
        // printing the minimum value 
        System.out.println("Minimum Value of Map is: "
                           + minValue); 
  
        // printing the maximum value 
        System.out.println("Maximum Value of Map is: "
                           + maxValue);
    } 
}
