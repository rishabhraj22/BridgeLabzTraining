package com.objectmodelling;

public class Professor {

    // Declaring professor attributes
    String professorName;
    String specialization;

    // Parameterized constructor
    public Professor(String professorName, String specialization) {
        this.professorName = professorName;
        this.specialization = specialization;
    }

    // Method to display professor details
    public void displayProfessor() {
        System.out.println("Professor Name: " + professorName);
        System.out.println("Specialization: " + specialization);
    }
}

