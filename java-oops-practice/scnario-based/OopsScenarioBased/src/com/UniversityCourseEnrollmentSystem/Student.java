package com.UniversityCourseEnrollmentSystem;

import java.util.ArrayList;
import java.util.List;

abstract class Student {
    protected int studentId;
    protected String name;
    protected List<Enrollment> enrollments = new ArrayList<>();

    private double gpa;   // sensitive

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student(int studentId, String name, String elective) {
        this(studentId, name);
        System.out.println("Elective chosen: " + elective);
    }

    public void enroll(Course course) {
        enrollments.add(new Enrollment(course));
    }

    protected void calculateGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (Enrollment e : enrollments) {
            totalPoints += e.getGradePoint() * e.getCredits();
            totalCredits += e.getCredits();
        }

        if (totalCredits > 0)
            gpa = totalPoints / totalCredits;
    }

    public String getTranscript() {
        calculateGPA();
        return "Student: " + name + " | GPA: " + gpa;
    }

    public abstract void displayCategory();
}

