package com.learning.designpatterns.factory;

public class FactoryMainClass {

    public static void main(String[] args) {
        Employee qaEngineerEmployee = EmployeeFactory.createEmployee("QAEngineer");
        int qaSalary = qaEngineerEmployee.getSalary();
        System.out.println("QA Engineer Salary : " + qaSalary);

        Employee automationEngineerEmployee = EmployeeFactory.createEmployee("AutomationEngineer");
        int automationSalary = automationEngineerEmployee.getSalary();
        System.out.println("QA Engineer Salary : " + automationSalary);
    }
}
