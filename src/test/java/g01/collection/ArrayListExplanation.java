package g01.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;

public class ArrayListExplanation {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>() ;
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			int i = itr.next() ;
			if(itr.next() % 2 == 0) {
				System.out.println(i);
			}
			
		}

		if(al instanceof Serializable) {
			System.out.println("Arraylist can implement Serializable");
		}
		
		if(al instanceof Cloneable) {
			System.out.println("Arraylist can implement Cloneable");
		}
		
		if(al instanceof RandomAccess) {
			System.out.println("Arraylist can implement RandomAccess");
		}

	}

}
