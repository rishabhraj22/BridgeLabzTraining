package com.UniversityCourseEnrollmentSystem;

class Faculty {
    private int facultyId;
    private String name;

    public Faculty(int id, String name) {
        this.facultyId = id;
        this.name = name;
    }

    public void assignGrade(Student student, int index, String grade) {
        student.enrollments.get(index).assignGrade(grade);
    }
}

