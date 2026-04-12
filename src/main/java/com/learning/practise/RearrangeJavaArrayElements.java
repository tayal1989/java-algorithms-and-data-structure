package com.learning.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RearrangeJavaArrayElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeElements(new int[] {2,3,4,5,1,2,3,3,4})));
    }

    public static int[] rearrangeElements(int[] arr) {
        int[] outputArr = new int[arr.length];

        HashMap<Integer, Integer> hmap = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hmap.containsKey(arr[i])) {
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            } else {
                hmap.put(arr[i], 1);
            }
        }

//        System.out.println(hmap);
        int k = 0;

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1) {
                for (int i = 0; i < entry.getValue(); i++) {
                    outputArr[k++] = entry.getKey();
                }
            } else if (entry.getValue() == 1) {
                outputArr[k++] = entry.getKey();
            }
        }

        return outputArr;
    }
}
