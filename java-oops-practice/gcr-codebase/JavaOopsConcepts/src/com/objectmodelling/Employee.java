package com.objectmodelling;

public class Employee {

    // Declaring employee attributes
    String employeeName;
    int employeeId;

    // Parameterized constructor
    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

