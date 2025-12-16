package com.learning.designpatterns.factory;

public class QAEngineer implements Employee {

    @Override
    public int getSalary() {
        System.out.println("QA Salary");
        return 30000;
    }
}
