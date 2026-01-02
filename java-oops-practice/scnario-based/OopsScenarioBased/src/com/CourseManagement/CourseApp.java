package com.CourseManagement;

public class CourseApp {
    public static void main(String[] args) {

        CourseManager manager = new CourseManager();

        Course c1 = new Course("Java Basics", 40);
        OnlineCourse c2 = new OnlineCourse(
                "OOP in Java", 50, "Coursera", true);

        PaidOnlineCourse c3 = new PaidOnlineCourse(
                "Advanced Java", 60, "Udemy", true, 5000, 20);

        c3.enrollStudent("Ravi");
        c3.enrollStudent("Anita");
        c3.enrollStudent("Ravi"); // duplicate ignored

        manager.addCourse(c1);
        manager.addCourse(c2);
        manager.addCourse(c3);

        System.out.println("🔹 All Courses");
        manager.displayAllCourses();

        System.out.println("🔹 Courses on Udemy");
        manager.displayCoursesByPlatform("Udemy");

        System.out.println("🔹 Search Course");
        Course searched = manager.getCourseByName("Advanced Java");
        searched.displayDetails();
    }
}

