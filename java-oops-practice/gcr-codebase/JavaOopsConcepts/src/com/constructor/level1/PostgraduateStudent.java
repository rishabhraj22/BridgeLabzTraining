package com.constructor.level1;

public class PostgraduateStudent extends Student {

    // Parameterized constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to display postgraduate student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);   // public
        System.out.println("Name: " + name);                // protected
        System.out.println("CGPA: " + getCGPA());            // private via method
    }
}

