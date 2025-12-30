package com.objectmodelling;

import java.util.ArrayList;

public class Department {

    // Declaring department name
    String departmentName;

    // Department owns Employee objects
    ArrayList<Employee> employees;

    // Parameterized constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    // Method to add employee to department
    public void addEmployee(String name, int id) {

        Employee emp = new Employee(name, id);
        employees.add(emp);
    }

    // Method to display department details
    public void displayDepartment() {

        System.out.println("\nDepartment: " + departmentName);

        // Displaying all employees
        for (Employee emp : employees) {
            emp.displayEmployee();
            System.out.println();
        }
    }
}

