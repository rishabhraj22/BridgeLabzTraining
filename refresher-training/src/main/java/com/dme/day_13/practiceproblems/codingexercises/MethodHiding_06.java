package com.dme.day_13.classwork.practiceproblems.codingexercises;

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class MethodHiding_06 {

    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
