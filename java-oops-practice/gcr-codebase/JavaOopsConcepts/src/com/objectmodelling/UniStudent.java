package com.objectmodelling;

import java.util.ArrayList;

public class UniStudent {

    // Declaring student name
    String studentName;

    // List to store enrolled courses
    ArrayList<UniCourse> courses;

    // Parameterized constructor
    public UniStudent(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Method for student to enroll in a course
    public void enrollCourse(UniCourse course) {

        courses.add(course);
        course.addStudent(this);

        System.out.println(studentName + " enrolled in " + course.courseName);
    }

    // Method to display student's courses
    public void displayCourses() {

        System.out.println("\nStudent: " + studentName);
        System.out.println("Enrolled Courses:");

        for (UniCourse course : courses) {
            System.out.println(course.courseName);
        }
    }
}

