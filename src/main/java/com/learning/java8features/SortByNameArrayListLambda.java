package com.learning.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    String name;
    int eno;

    Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return name + " : " + eno;
    }
}

class SortByNameArrayListLambda {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Vishal", 88));
        list.add(new Employee("Bimla", 89));
        list.add(new Employee("Naina", 90));
        list.add(new Employee("Myra", 91));
        System.out.println(list);

        Collections.sort(list, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
        System.out.println(list);

        Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println(list);
    }
}
