package g01.collection;

import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tsc = new TreeSet<Integer>(new MyComparator());
		
		tsc.add(10);
		tsc.add(0);
		tsc.add(15);
		tsc.add(20);
		tsc.add(20);
		
		System.out.println(tsc);
	}

}
