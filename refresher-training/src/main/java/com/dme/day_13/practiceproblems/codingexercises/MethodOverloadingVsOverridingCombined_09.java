package com.dme.day_13.classwork.practiceproblems.codingexercises;

class Shape_09 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Shape2D extends Shape_09 {
    @Override
    void draw() {
        System.out.println("Drawing a 2D shape");
    }
    void draw(String color) {
        System.out.println("Drawing a 2D shape in " + color + " color");
    }
}

public class MethodOverloadingVsOverridingCombined_09 {

    public static void main(String[] args) {
        Shape2D shape = new Shape2D();
        shape.draw();
        shape.draw("Red");
    }
}
