package com.learning.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class FunctionStudent {
    int marks;
    String name;

    FunctionStudent(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return this.name + " : " + this.name;
    }
}

class FunctionEmployeeMain {
    public static void main(String[] args) {
        List<FunctionStudent> list = new ArrayList<>();
        list.add(new FunctionStudent(100, "Vishal"));
        list.add(new FunctionStudent(65, "Naina"));
        list.add(new FunctionStudent(45, "Bimla"));
        list.add(new FunctionStudent(55, "Myra"));
        list.add(new FunctionStudent(25, "Rohit"));

        Function<FunctionStudent, String> func = s -> {
          int marks = s.marks;
          String grade = "";
          if(marks > 80) grade = "A[Distinction]";
          else if (marks > 60) grade = "B[First Class]";
          else if (marks > 50) grade = "C[Second Class]";
          else if (marks > 40) grade = "D[Third Class]";
          else grade = "Fail";
          return grade;
        };

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " got " + list.get(i).marks + " and got grade : " + func.apply(list.get(i)));
        }

        Predicate<FunctionStudent> p1 = s1 -> s1.marks < 60;
        System.out.println("\nStudents who got less than 60 marks are : ");
        for (int i = 0; i < list.size(); i++) {
            if(p1.test(list.get(i))) {
                System.out.println(list.get(i).name + " got " + list.get(i).marks + " marks.");
            }
        }
    }
}
