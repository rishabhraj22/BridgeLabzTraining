package com.objectmodelling;

import java.util.ArrayList;

public class University {

    // Declaring university name
    String universityName;

    // Composition: University owns Department objects
    ArrayList<UniDepartment> departments;

    // Parameterized constructor
    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    // Method to add department to university
    public void addDepartment(UniDepartment csDept) {
        departments.add(csDept);
    }

    // Method to display university structure
    public void displayUniversity() {

        System.out.println("University Name: " + universityName);

        for (UniDepartment dept : departments) {
            dept.displayDepartment();
        }
    }

    // Method to delete university
    public void deleteUniversity() {

        // Clearing all departments
        departments.clear();

        System.out.println("\nUniversity deleted. All departments removed.");
    }
}

