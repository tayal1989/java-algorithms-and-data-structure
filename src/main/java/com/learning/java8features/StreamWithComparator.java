package com.learning.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("AAA");
        list.add("AAAAA");
        list.add("A");
        list.add("AAAA");
        System.out.println("Original list : " + list);
        Comparator<String> comp = (s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if(l1 < l2) return -1;
            else if (l1 > l2) return +1;
            else return 0;
        };
        List<String> updatedList = list.stream().sorted(comp).collect(Collectors.toList());
        System.out.println("List in ascending order : " + updatedList);

        updatedList.stream().forEach(System.out::println);
    }
}
