package com.CourseManagement;

import java.util.*;

public class CourseManager {

    private List<Course> allCourses;                 // iteration
    private Map<String, Course> courseByName;        // fast lookup
    private Map<String, List<OnlineCourse>> byPlatform;

    public CourseManager() {
        allCourses = new ArrayList<>();
        courseByName = new HashMap<>();
        byPlatform = new HashMap<>();
    }

    public void addCourse(Course course) {
        allCourses.add(course);
        courseByName.put(course.getCourseName(), course);

        if (course instanceof OnlineCourse online) {
            byPlatform
                .computeIfAbsent(online.getPlatform(), k -> new ArrayList<>())
                .add(online);
        }
    }

    public Course getCourseByName(String name) {
        return courseByName.get(name);
    }

    public void displayCoursesByPlatform(String platform) {
        List<OnlineCourse> courses = byPlatform.get(platform);

        if (courses == null) {
            System.out.println("No courses found on " + platform);
            return;
        }

        for (Course c : courses) {
            c.displayDetails();
            System.out.println("------------------");
        }
    }

    public void displayAllCourses() {
        for (Course c : allCourses) {
            c.displayDetails();
            System.out.println("------------------");
        }
    }
}

