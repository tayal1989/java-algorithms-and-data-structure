package com.learning.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(20);
        al.add(25);
        al.add(15);
        al.add(0);
        System.out.println("Original Array List : " + al);

        //Stream with filter
        List<Integer> listWithFilter = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Updated List after filter : " + listWithFilter);

        //Stream with Map
        List<Integer> listWithMap = al.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println("Updated List after Map : " + listWithMap);

        //Stream with Count
        long lessThan10 = al.stream().filter(i -> i < 10).count();
        System.out.println("Less than 10 no are : " + lessThan10);

        //Stream with Sorted(Ascending)
        List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List : " + sortedList);

        //Stream with Sorted(Descending)
        List<Integer> sortedListDesc = al.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
        System.out.println("Sorted List : " + sortedListDesc);

        //Stream with Sorted(Descending) using compareTo
        List<Integer> sortedListDescCompareTo = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Sorted List : " + sortedListDescCompareTo);

        //Stream with Min
        int minNumber = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum number in array list : " + minNumber);

        //Stream with Min
        int maxNumber = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Maximum number in array list : " + maxNumber);
    }
}
