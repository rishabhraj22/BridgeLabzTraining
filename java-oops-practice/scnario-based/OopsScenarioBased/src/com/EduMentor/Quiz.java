package com.EduMentor;
import java.util.Scanner;

class Quiz {

    private String[] questions;
    private String[] correctAnswers;
    private int score;
    private String difficulty;

    public Quiz(int numOfQuestions, String difficulty) {
        this.questions = new String[numOfQuestions];
        this.correctAnswers = new String[numOfQuestions];
        this.difficulty = difficulty;
        this.score = 0;
    }

    public void setQuestion(int index, String question, String answer) {
        questions[index] = question;
        correctAnswers[index] = answer;
    }

    public double conductQuiz() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Quiz Started (Difficulty: " + difficulty + ") ---");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            System.out.print("Your Answer: ");
            String userAns = sc.nextLine();

            if (userAns.equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / questions.length * 100;
        return percentage;
    }
}
