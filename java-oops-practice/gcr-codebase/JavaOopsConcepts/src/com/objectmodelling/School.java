package com.objectmodelling;

import java.util.ArrayList;

public class School {

    // Declaring school name
    String schoolName;

    // Aggregation: School has Student objects
    ArrayList<Student> students;

    // Parameterized constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    // Method to add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display students in school
    public void displayStudents() {

        System.out.println("\nSchool Name: " + schoolName);
        System.out.println("Students in School:");

        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }
}

