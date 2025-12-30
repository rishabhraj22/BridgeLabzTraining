package com.objectmodelling;

public class UniversityManagementDriver {

    public static void main(String[] args) {

        // Creating student objects
        UniStudent s1 = new UniStudent("Ravi");
        UniStudent s2 = new UniStudent("Neha");

        // Creating professor objects
        Professor p1 = new Professor("Dr. Sharma", "Computer Science");

        // Creating course objects
        UniCourse c1 = new UniCourse("Data Structures");
        UniCourse c2 = new UniCourse("Operating Systems");

        // Assigning professor to courses
        c1.assignProfessor(p1);
        c2.assignProfessor(p1);

        // Students enrolling in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        // Displaying details
        s1.displayCourses();
        s2.displayCourses();

        c1.displayCourse();
        c2.displayCourse();
    }
}

