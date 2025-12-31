import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array to store questions
        String[] questions = {
            "1. Which language is used for Android development?\nA. Python\nB. Java\nC. C++\nD. Ruby",
            "2. Which keyword is used to inherit a class in Java?\nA. this\nB. super\nC. extends\nD. implements",
            "3. Which data type is used to store decimal values?\nA. int\nB. char\nC. boolean\nD. double",
            "4. Which loop executes at least once?\nA. for\nB. while\nC. do-while\nD. foreach",
            "5. Which company developed Java?\nA. Microsoft\nB. Apple\nC. Sun Microsystems\nD. Google"
        };

        // Array to store correct answers
        char[] answers = {'B', 'C', 'D', 'C', 'C'};

        // Variable to store score
        int score = 0;

        // Loop to ask each question
        for (int i = 0; i < questions.length; i++) {

            // Displaying question
            System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");

            // Taking user answer
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Checking answer using switch
            switch (userAnswer) {

                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("Invalid option selected.");
            }
        }

        // Displaying final score
        System.out.println("\n--- Quiz Result ---");
        System.out.println("Your Score: " + score + " out of " + questions.length);
    }
}
