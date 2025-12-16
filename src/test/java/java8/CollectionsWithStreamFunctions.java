package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsWithStreamFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(35);
        System.out.println("Initial input : " + arrayList);

        // Using filter
        List<Integer> listWithFilter = arrayList.stream().
                filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Output with filter : " + listWithFilter);

        // Using map
        List<Integer> listWithMap = arrayList.stream().
                map(i -> i * 2).collect(Collectors.toList());
        System.out.println("Output with map : " + listWithMap);

        // Using count
        long listWithCount = arrayList.stream().filter(i -> i > 20).count();
        System.out.println("Output with count : " + listWithCount);

        // Sorting (Ascending)
        arrayList.add(12);
        System.out.println("New Array List : " + arrayList);
        List<Integer> listWithSortingAsc = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("Output with Asc order : " + listWithSortingAsc);
        arrayList.remove(arrayList.size() - 1);
        System.out.println("New Array List : " + arrayList);

        // Sorting (Descending)
        List<Integer> listWithSortingDesc = arrayList.stream().
                sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
        System.out.println("Output with Desc order : " + listWithSortingDesc);

        // Sorting (Using compareTo)
        List<Integer> listWithSortingCompTo = arrayList.stream().
                sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Output with Desc order(compare to) : " + listWithSortingCompTo);

        // Minimum
        int minNumber = arrayList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Min number in array list : " + minNumber);

        // Maximum
        int maxNumber = arrayList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Min number in array list : " + maxNumber);
    }
}
