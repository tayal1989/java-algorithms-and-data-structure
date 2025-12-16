package com.learning.java8features;

import java.util.ArrayList;
import java.util.function.BiFunction;

class BiFunctionEmployee {
    String name;
    int eno;

    BiFunctionEmployee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return this.name + " : " + this.eno;
    }
}

public class BiFunctionExample {
    public static void main(String[] args) {
        ArrayList<BiFunctionEmployee> al = new ArrayList<>();
        BiFunction<String, Integer, BiFunctionEmployee> bf = (name, eno) -> new BiFunctionEmployee(name, eno);
        al.add(bf.apply("Vishal", 101));
        al.add(bf.apply("Naina", 102));
        al.add(bf.apply("Myra", 103));
        al.add(bf.apply("Bimla", 104));

        for(int i = 0; i < al.size(); i++) {
            System.out.println("Employee Number : " + al.get(i).eno);
            System.out.println("Employee Number : " + al.get(i).name);
            System.out.println();
        }

    }
}
