package com.EduMentor;
import java.util.Scanner;

public class EduMentorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instructor Input
        System.out.println("Enter Instructor Details");
        System.out.print("ID: ");
        int iid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String iname = sc.nextLine();

        System.out.print("Email: ");
        String iemail = sc.nextLine();

        Instructor instructor = new Instructor(iid, iname, iemail);

        // Learner Input
        System.out.println("\nEnter Learner Details");
        System.out.print("ID: ");
        int lid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String lname = sc.nextLine();

        System.out.print("Email: ");
        String lemail = sc.nextLine();

        System.out.print("Course Type (short / full-time): ");
        String courseType = sc.nextLine();

        Learner learner = new Learner(lid, lname, lemail, courseType);

        // Quiz Setup
        System.out.print("\nEnter number of quiz questions: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter difficulty level (Easy / Medium / Hard): ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(n, difficulty);

        System.out.println("\nEnter Questions & Answers (Instructor Only)");
        for (int i = 0; i < n; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            String q = sc.nextLine();

            System.out.print("Correct Answer: ");
            String a = sc.nextLine();

            quiz.setQuestion(i, q, a);
        }

        // Conduct Quiz
        double percentage = quiz.conductQuiz();
        learner.setPercentage(percentage);

        // Display Result
        System.out.println("\n--- Result ---");
        learner.printDetails();

        if (percentage >= 40) {
            learner.generateCertificate();
        } else {
            System.out.println("❌ Certificate not generated (Score below passing criteria)");
        }

        sc.close();
    }
}
