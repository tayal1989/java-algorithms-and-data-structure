package com.learning.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppManager {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Open Netflix");
        list.add("Open Zoom");
        list.add("Close Netflix");
        list.add("Clear");

        list.add("Open Netflix");
        list.add("Open Terminal");
        list.add("Close Netflix");
        list.add("Open Zoom");

        System.out.println("Final app list : " + getFinalApps(list));
    }

    public static List<String> getFinalApps(List<String> list) {
        List<String> outputList = new LinkedList<>();

        for (String s : list) {
            String[] parts = s.split(" ");
            String action = parts[0].toLowerCase();

            if (action.equals("clear")) {
                outputList.clear();
            } else if (parts.length > 1) {
                String app = parts[1];
                if (action.equals("open")) {
                    outputList.remove(app); // Remove duplicate if already present
                    outputList.add(app);
                } else if (action.equals("close")) {
                    outputList.remove(app);
                }
            }
        }

        return outputList;
    }
}
