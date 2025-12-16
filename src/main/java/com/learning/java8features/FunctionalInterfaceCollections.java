package com.learning.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(10);
        al.add(20);
        al.add(5);
        System.out.println("Before sorting, array list : " + al);

        Comparator<Integer> c1 = (I1, I2) -> I1 < I2 ? -1 : (I1 > I2) ? 1 : 0;
        Collections.sort(al, c1);

        System.out.println("After sorting, array list : " + al);
    }

}
