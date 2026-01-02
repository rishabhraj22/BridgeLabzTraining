package com.UniversityCourseEnrollmentSystem;

class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    public Course(String code, String name, int credits) {
        this.courseCode = code;
        this.courseName = name;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }
}

