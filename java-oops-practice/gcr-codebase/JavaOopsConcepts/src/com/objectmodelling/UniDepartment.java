package com.objectmodelling;

import java.util.ArrayList;

public class UniDepartment {

    // Declaring department name
    String departmentName;

    // List of faculty working in department (Aggregation)
    ArrayList<Faculty> facultyMembers;

    // Parameterized constructor
    public UniDepartment(String departmentName) {
        this.departmentName = departmentName;
        facultyMembers = new ArrayList<>();
    }

    // Method to add faculty to department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Method to display department details
    public void displayDepartment() {

        System.out.println("\nDepartment: " + departmentName);
        System.out.println("Faculty Members:");

        for (Faculty faculty : facultyMembers) {
            faculty.displayFaculty();
            System.out.println();
        }
    }
}

