package com.javagenerics.MultiLevelUniversityCourseManagementSystem;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        System.out.print("Enter number of exam courses: ");
        int e = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < e; i++) {
            System.out.print("Course name: ");
            String name = sc.nextLine();
            System.out.print("Credits: ");
            int credits = sc.nextInt(); sc.nextLine();
            examCourses.addCourse(new ExamCourse(name, credits));
        }

        System.out.print("Enter number of assignment courses: ");
        int a = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < a; i++) {
            System.out.print("Course name: ");
            String name = sc.nextLine();
            System.out.print("Credits: ");
            int credits = sc.nextInt(); sc.nextLine();
            assignmentCourses.addCourse(new AssignmentCourse(name, credits));
        }

        System.out.print("Enter number of research courses: ");
        int r = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < r; i++) {
            System.out.print("Course name: ");
            String name = sc.nextLine();
            System.out.print("Credits: ");
            int credits = sc.nextInt(); sc.nextLine();
            researchCourses.addCourse(new ResearchCourse(name, credits));
        }

        System.out.println("\n📘 Exam Courses:");
        CourseUtil.displayCourses(examCourses.getCourses());

        System.out.println("\n📝 Assignment Courses:");
        CourseUtil.displayCourses(assignmentCourses.getCourses());

        System.out.println("\n🔬 Research Courses:");
        CourseUtil.displayCourses(researchCourses.getCourses());

        sc.close();
    }
}
