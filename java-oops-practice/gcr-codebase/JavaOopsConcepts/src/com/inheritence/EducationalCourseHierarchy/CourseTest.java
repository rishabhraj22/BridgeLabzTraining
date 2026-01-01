package com.inheritence.EducationalCourseHierarchy;

public class CourseTest {
    public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 40);
        Course c2 = new OnlineCourse("OOP in Java", 50, "Coursera", true);
        Course c3 = new PaidOnlineCourse("Advanced Java", 60, "Udemy", true, 5000, 20);

        c1.displayDetails();
        System.out.println("-------------------");

        c2.displayDetails();
        System.out.println("-------------------");

        c3.displayDetails();
    }
}

