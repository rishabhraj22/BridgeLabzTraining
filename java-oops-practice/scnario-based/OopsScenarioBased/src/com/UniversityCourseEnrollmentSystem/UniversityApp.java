package com.UniversityCourseEnrollmentSystem;

public class UniversityApp {
    public static void main(String[] args) {

        Course java = new Course("CS101", "Java Programming", 4);
        Course db = new Course("CS102", "Databases", 3);

        Student s1 = new Undergraduate(1, "Rohit", "AI");
        Student s2 = new Postgraduate(2, "Anita");

        s1.enroll(java);
        s1.enroll(db);

        s2.enroll(java);

        Faculty f1 = new Faculty(101, "Dr. Mehta");

        f1.assignGrade(s1, 0, "A");
        f1.assignGrade(s1, 1, "B");
        f1.assignGrade(s2, 0, "P"); // Pass/Fail

        s1.displayCategory();
        System.out.println(s1.getTranscript());

        s2.displayCategory();
        System.out.println(s2.getTranscript());
    }
}

