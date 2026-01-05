package com.CampusConnect;
import java.util.Scanner;

public class CampusConnectApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty Input
        System.out.println("Enter Faculty Details");
        System.out.print("ID: ");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String fname = sc.nextLine();

        System.out.print("Email: ");
        String femail = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Course Input
        System.out.println("\nEnter Course Details");
        System.out.print("Course Code: ");
        String code = sc.nextLine();

        System.out.print("Course Name: ");
        String cname = sc.nextLine();

        Course course = new Course(code, cname, faculty);

        // Student Input
        System.out.print("\nEnter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("ID: ");
            int sid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String sname = sc.nextLine();

            System.out.print("Email: ");
            String semail = sc.nextLine();

            students[i] = new Student(sid, sname, semail);
            students[i].enrollCourse(course);
        }

        // Grade Assignment
        System.out.println("\nAssign Grades (0–10)");
        for (int i = 0; i < n; i++) {
            System.out.print("Grade for " + students[i].name + ": ");
            int grade = sc.nextInt();
            students[i].assignGrade(0, grade);
        }

        // Display Results
        course.showDetails();

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.printDetails();
        }

        sc.close();
    }
}
