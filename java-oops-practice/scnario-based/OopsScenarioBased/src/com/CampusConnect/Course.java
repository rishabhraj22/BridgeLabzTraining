package com.CampusConnect;
import java.util.ArrayList;
import java.util.List;

class Course {
	private String courseCode;
    private String courseName;
    private Faculty faculty;
    private List<Student> students = new ArrayList<>();

    public Course(String code, String name, Faculty faculty) {
        this.courseCode = code;
        this.courseName = name;
        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void showDetails() {
        System.out.println("\nCourse: " + courseName);
        faculty.printDetails();
        System.out.println("Enrolled Students: " + students.size());
    }
}
