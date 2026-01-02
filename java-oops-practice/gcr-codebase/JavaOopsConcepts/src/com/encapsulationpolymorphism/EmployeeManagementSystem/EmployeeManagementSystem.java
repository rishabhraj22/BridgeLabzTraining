package com.encapsulationpolymorphism.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Rohit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Aman", 500, 40);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism in action
        for (Employee emp : employees) {
            emp.displayDetails();  // Runtime binding
        }
    }
}

