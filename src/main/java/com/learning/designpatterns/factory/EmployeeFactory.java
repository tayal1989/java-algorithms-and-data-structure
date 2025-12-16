package com.learning.designpatterns.factory;

public class EmployeeFactory {

    public static Employee createEmployee(String typeOfEmployee) {
        if(typeOfEmployee.trim().equalsIgnoreCase("QAEngineer")) {
            return new QAEngineer();
        } else if (typeOfEmployee.trim().equalsIgnoreCase("AutomationEngineer")) {
            return new AutomationEngineer();
        } else {
            return null;
        }
    }
}
