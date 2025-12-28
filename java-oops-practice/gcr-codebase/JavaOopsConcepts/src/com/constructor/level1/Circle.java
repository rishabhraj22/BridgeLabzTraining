package com.constructor.level1;

public class Circle {

    // Declaring radius variable
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calling parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

