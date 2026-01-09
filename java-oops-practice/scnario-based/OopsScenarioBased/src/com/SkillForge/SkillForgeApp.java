package com.SkillForge;
import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🎓 Welcome to SkillForge – Online Learning Portal");

        // Instructor Input
        System.out.print("Enter Instructor ID: ");
        int iid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Instructor Name: ");
        String iname = sc.nextLine();

        Instructor instructor = new Instructor(iid, iname);

        // Course Input
        System.out.print("\nEnter Course Title: ");
        String title = sc.nextLine();

        System.out.print("Do you want to add custom modules? (yes/no): ");
        String modChoice = sc.nextLine();

        Course course;

        if (modChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter number of modules: ");
            int m = sc.nextInt();
            sc.nextLine();

            String[] modules = new String[m];
            for (int i = 0; i < m; i++) {
                System.out.print("Module " + (i + 1) + ": ");
                modules[i] = sc.nextLine();
            }

            course = new Course(title, instructor, modules);
        } else {
            course = new Course(title, instructor);
        }

        // Student Input
        System.out.print("\nEnter Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();

        Student student = new Student(sid, sname);
        student.setTotalModules(course.getModuleCount());

        int choice;
        do {
            System.out.println("\n--- SkillForge Menu ---");
            System.out.println("1. View Course");
            System.out.println("2. Complete Module");
            System.out.println("3. View Progress");
            System.out.println("4. Generate Certificate");
            System.out.println("5. Add Review");
            System.out.println("6. View Reviews");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    course.showCourse();
                    break;

                case 2:
                    student.completeModule();
                    break;

                case 3:
                    student.showProfile();
                    break;

                case 4:
                    student.generateCertificate();
                    break;

                case 5:
                    System.out.print("Enter your review: ");
                    String review = sc.nextLine();
                    course.addReview(review);
                    System.out.println("Review added.");
                    break;

                case 6:
                    course.showReviews();
                    break;

                case 7:
                    System.out.println("Thank you for using SkillForge 🎓");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
