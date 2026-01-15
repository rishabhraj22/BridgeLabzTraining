package com.ExamProctor;
import java.util.Scanner;



public class ExamProctorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExamProctorManager manager = new ExamProctorManager();
        StudentSession session = new StudentSession();

        // Preload exam questions
        manager.addQuestion(1, "A");
        manager.addQuestion(2, "B");
        manager.addQuestion(3, "C");
        manager.addQuestion(4, "D");

        int choice;

        do {
            System.out.println("\n---- Exam Proctor Menu ----");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. View Navigation History");
            System.out.println("4. Submit Exam and View Score");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Question ID to Visit: ");
                    int visitId = sc.nextInt();
                    sc.nextLine();
                    session.visitQuestion(visitId);
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Your Answer: ");
                    String ans = sc.nextLine();

                    session.answerQuestion(qId, ans);
                    break;

                case 3:
                    manager.displayNavigation(session.getNavigationStack());
                    break;

                case 4:
                    int score = manager.calculateScore(session.getAnswerMap());
                    System.out.println("Exam submitted.");
                    System.out.println("Your Score: " + score);
                    break;

                case 5:
                    System.out.println("Exiting Exam Proctor System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
