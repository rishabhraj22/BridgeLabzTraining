package com.constructor.level1;

public class CourseDriver {

    public static void main(String[] args) {

        // Creating course objects
        Course c1 = new Course("Java", 6, 15000);
        Course c2 = new Course("Python", 4, 12000);

        // Displaying course details
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println();

        // Updating institute name
        Course.updateInstituteName("XYZ Training Center");

        // Displaying updated course details
        c1.displayCourseDetails();
    }
}

