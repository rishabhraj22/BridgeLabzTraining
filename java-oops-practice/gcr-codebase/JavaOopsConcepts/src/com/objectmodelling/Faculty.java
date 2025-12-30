package com.objectmodelling;

public class Faculty {

    // Declaring faculty attributes
    String facultyName;
    String specialization;

    // Parameterized constructor
    public Faculty(String facultyName, String specialization) {
        this.facultyName = facultyName;
        this.specialization = specialization;
    }

    // Method to display faculty details
    public void displayFaculty() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Specialization: " + specialization);
    }
}

