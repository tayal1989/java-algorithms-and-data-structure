package com.learning.designpatterns.factory;

public class AutomationEngineer implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Automation Engineer Salary");
        return 50000;
    }
}
