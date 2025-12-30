package com.objectmodelling;

import java.util.ArrayList;

public class Course {

    // Declaring course name
    String courseName;

    // List to store enrolled students
    ArrayList<Student> enrolledStudents;

    // Parameterized constructor
    public Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    // Method to add student to course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to display students enrolled in the course
    public void displayEnrolledStudents() {

        System.out.println("\nCourse: " + courseName);
        System.out.println("Enrolled Students:");

        for (Student student : enrolledStudents) {
            System.out.println(student.studentName);
        }
    }
}

