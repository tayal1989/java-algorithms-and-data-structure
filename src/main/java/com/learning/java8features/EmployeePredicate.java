package com.learning.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmployeePredicate {
    String name;
    int salary;

    EmployeePredicate(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String toString() {
        return this.salary + " : " + this.name;
    }
}

class MainEmployeePredicate {
    public static void main(String[] args) {
        List<EmployeePredicate> list = new ArrayList<>();
        list.add(new EmployeePredicate(1000, "Vishal"));
        list.add(new EmployeePredicate(4000, "Naina"));
        list.add(new EmployeePredicate(3000, "Myra"));
        list.add(new EmployeePredicate(2000, "Bimla"));
        Predicate<EmployeePredicate> p1 = ep -> ep.salary > 2000;

        for(int i = 0; i < list.size(); i++) {
            // It will print those employees whose salary > 2000
            if(p1.test(list.get(i))) {
                System.out.println(list.get(i));
            }
        }
    }
}
