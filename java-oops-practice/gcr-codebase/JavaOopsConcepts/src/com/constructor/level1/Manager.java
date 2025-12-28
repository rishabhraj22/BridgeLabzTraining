package com.constructor.level1;

public class Manager extends Employee {

    // Parameterized constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);     // public
        System.out.println("Department: " + department);      // protected
        System.out.println("Salary: " + getSalary());         // private via method
    }
}

