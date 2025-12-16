package com.learning.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAsValueInHashMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        list.add(1);
        list.add(2);
        map.put("key", list);
        System.out.println(map.get("key"));
        System.out.println(map.get("key").get(0));
    }
}
