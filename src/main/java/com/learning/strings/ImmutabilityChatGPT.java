package com.learning.strings;

import java.util.ArrayList;
import java.util.List;

public class ImmutabilityChatGPT {

    private final int id;
    private final String name;
    private final List<String> skills;

    public ImmutabilityChatGPT(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        // Defensive copy
        this.skills = new ArrayList<>(skills);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        // Return defensive copy
        return new ArrayList<>(skills);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ImmutabilityChatGPT icg = new ImmutabilityChatGPT(1, "Vishal", list);
        list.add("Java");
        System.out.println(icg.getSkills());
        System.out.println(list);

        /*
        At Object Creation
            main list  ---> []
            Employee.skills ---> []   (separate copy)

        After list.add("Java")
            main list  ---> ["Java"]
            Employee.skills ---> []   (unchanged ✅)
         */
    }

}
