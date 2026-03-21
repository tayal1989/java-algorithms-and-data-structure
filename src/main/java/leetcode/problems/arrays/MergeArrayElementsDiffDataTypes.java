package leetcode.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayElementsDiffDataTypes {

    public static void main(String[] args) {
        Object[] arr1 = {1,3,5,6,8};
        Object[] arr2 = {"a","b","c","d"};
        int i = 0;
        int j = 0;

        List<Object> list = new ArrayList<>();

        // Expected output = 1,a,3,b,5,c,6,d,8

        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length) {
                list.add(arr1[i]);
                i++;
            }

            if (j < arr2.length) {
                list.add(arr2[j]);
                j++;
            }
        }

        System.out.println(list);
    }
}
