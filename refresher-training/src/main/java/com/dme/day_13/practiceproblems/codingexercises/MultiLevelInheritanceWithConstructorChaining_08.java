package com.dme.day_13.classwork.practiceproblems.codingexercises;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}


class Student extends Person {
    String course;
    Student(String name, String course) {
        super(name);
        this.course = course;
    }
}


class GraduateStudent extends Student {
    String thesisTitle;
    GraduateStudent(String name, String course, String thesisTitle) {
        super(name, course);
        this.thesisTitle = thesisTitle;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class MultiLevelInheritanceWithConstructorChaining_08 {

    public static void main(String[] args) {
        GraduateStudent student = new GraduateStudent("Rishabh","Computer Science","Artificial Intelligence");
        student.display();
    }
}
