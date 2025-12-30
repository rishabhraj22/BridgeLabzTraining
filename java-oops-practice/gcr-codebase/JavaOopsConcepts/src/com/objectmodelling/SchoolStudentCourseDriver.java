package com.objectmodelling;

public class SchoolStudentCourseDriver {

    public static void main(String[] args) {

        // Creating School object
        School school = new School("Green Valley School");

        // Creating Student objects
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Neha");

        // Creating Course objects
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Adding students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Enrolling students in courses (Association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // Displaying school students
        school.displayStudents();

        // Displaying courses for each student
        s1.displayCourses();
        s2.displayCourses();

        // Displaying students for each course
        c1.displayEnrolledStudents();
        c2.displayEnrolledStudents();
    }
}

