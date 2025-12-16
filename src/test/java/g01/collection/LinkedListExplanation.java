package g01.collection;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class LinkedListExplanation {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>() ;
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		Iterator<Integer> itr = ll.iterator();
		
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next() ;
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
		}

		if(ll instanceof Serializable) {
			System.out.println("LinkedList can implement Serializable");
		}
		
		if(ll instanceof Cloneable) {
			System.out.println("LinkedList can implement Cloneable");
		}
		
		if(ll instanceof RandomAccess) {
			System.out.println("LinkedList can implement RandomAccess");
		}

	}

}
