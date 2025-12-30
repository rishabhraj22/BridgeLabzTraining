package com.objectmodelling;

import java.util.ArrayList;

public class Student {

    // Declaring student name
    String studentName;

    // List to store courses enrolled by student
    ArrayList<Course> courses;

    // Parameterized constructor
    public Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {

        // Adding course to student's list
        courses.add(course);

        // Adding student to course's list
        course.addStudent(this);
    }

    // Method to display courses of the student
    public void displayCourses() {

        System.out.println("\nStudent: " + studentName);
        System.out.println("Enrolled Courses:");

        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

