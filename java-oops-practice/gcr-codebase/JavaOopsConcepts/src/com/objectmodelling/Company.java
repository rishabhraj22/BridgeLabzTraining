package com.objectmodelling;

import java.util.ArrayList;

public class Company {

    // Declaring company name
    String companyName;

    // Company owns Department objects
    ArrayList<Department> departments;

    // Parameterized constructor
    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    // Method to add department to company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display company structure
    public void displayCompany() {

        System.out.println("Company Name: " + companyName);

        // Displaying all departments
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    // Method to close company
    public void closeCompany() {

        departments.clear();

        System.out.println("\nCompany closed. All departments and employees removed.");
    }
}

