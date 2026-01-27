package com.annotationsandreflection.reflection.createobject;

public class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public void show() {
        System.out.println("Student Name: " + name);
    }
}
