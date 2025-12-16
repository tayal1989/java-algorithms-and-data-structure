package g01.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Vishal");
		hmap.put(2, "Naina");
		hmap.put(3, "Pihu");
		hmap.put(4, "ABC");
		hmap.put(5, "XYZ");
		
		for(Map.Entry<Integer, String> map : hmap.entrySet()) {
			System.out.println(map.getKey() + " --> " + map.getValue());
		}
	}

}
