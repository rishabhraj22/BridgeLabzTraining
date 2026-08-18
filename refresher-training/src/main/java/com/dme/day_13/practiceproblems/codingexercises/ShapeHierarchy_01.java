package com.dme.day_13.classwork.practiceproblems.codingexercises;

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape_09 {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape_09 {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape_09 {
    double base;
    double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeHierarchy_01 {

    public static void main(String[] args) {
        Shape_09[] shapes = {new Circle(5), new Rectangle(4, 6), new Triangle(4, 5)};
        for (Shape_09 s : shapes) {
            System.out.println("Area = " + s.area());
        }
    }

}
