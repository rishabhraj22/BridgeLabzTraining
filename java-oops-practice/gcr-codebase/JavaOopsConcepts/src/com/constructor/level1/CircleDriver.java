package com.constructor.level1;

public class CircleDriver {

    public static void main(String[] args) {

        // Creating circle using default constructor
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + c1.calculateArea());

        System.out.println();

        // Creating circle using parameterized constructor
        Circle c2 = new Circle(5.0);
        System.out.println("Radius: " + c2.radius);
        System.out.println("Area: " + c2.calculateArea());
    }
}

