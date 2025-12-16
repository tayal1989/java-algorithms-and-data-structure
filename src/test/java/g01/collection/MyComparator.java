package g01.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		Integer i = (Integer) o1;
		Integer j = (Integer) o2;
		
		if(i < j) {
			return 1 ;
		} else if(i > j) {
			return -1 ;
		} else {
			return 0;
		}
	}

}
