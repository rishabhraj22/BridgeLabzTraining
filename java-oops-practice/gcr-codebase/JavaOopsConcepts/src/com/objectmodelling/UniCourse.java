package com.objectmodelling;

import java.util.ArrayList;

public class UniCourse {

    // Declaring course name
    String courseName;

    // Course has students
    ArrayList<UniStudent> students;

    // Assigned professor for the course
    Professor professor;

    // Parameterized constructor
    public UniCourse(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Method to add student to course
    public void addStudent(UniStudent student) {
        students.add(student);
    }

    // Method to assign professor to course
    public void assignProfessor(Professor professor) {
        this.professor = professor;

        // Displaying assignment message
        System.out.println(professor.professorName + " assigned to teach " + courseName);
    }

    // Method to display course details
    public void displayCourse() {

        System.out.println("\nCourse: " + courseName);

        // Displaying professor details
        if (professor != null) {
            System.out.println("Taught by: " + professor.professorName);
        } else {
            System.out.println("No professor assigned.");
        }

        // Displaying enrolled students
        System.out.println("Enrolled Students:");
        for (UniStudent student : students) {
            System.out.println(student.studentName);
        }
    }
}

