package g01.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
	public int compare(Integer i, Integer j) {
		if (i < j) {
			return 1 ;
		} else if(i > j) {
			return -1 ;
		} else {
			return 0;
		}
	}

}
