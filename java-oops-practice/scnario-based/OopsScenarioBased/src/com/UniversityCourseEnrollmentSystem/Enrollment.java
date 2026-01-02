package com.UniversityCourseEnrollmentSystem;

class Enrollment implements Graded {
    private Course course;
    private String grade;
    private double gradePoint;

    public Enrollment(Course course) {
        this.course = course;
    }

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;

        // Polymorphic grading logic
        switch (grade) {
            case "A": gradePoint = 4.0; break;
            case "B": gradePoint = 3.0; break;
            case "C": gradePoint = 2.0; break;
            case "P": gradePoint = 3.0; break; // Pass
            case "F": gradePoint = 0.0; break;
            default: gradePoint = 0.0;
        }
    }

    public int getCredits() {
        return course.getCredits();
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public String getCourseName() {
        return course.getCourseName();
    }
}

