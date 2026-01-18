package com.javagenerics.MultiLevelUniversityCourseManagementSystem;
import java.util.List;

public class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
}
