package com.CourseManagement;

public class Course {
    protected String courseName;
    protected int duration; // hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }

    public String getCourseName() {
        return courseName;
    }
}

