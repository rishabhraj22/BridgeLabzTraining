package com.constructor.level1;

public class Student {

    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double cgpa;

    // Parameterized constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public method to update CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

