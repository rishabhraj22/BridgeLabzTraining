package com.ExamProctor;
import java.util.HashMap;
import java.util.Stack;
import java.util.Map;

public class ExamProctorManager {

    private HashMap<Integer, Question> questionBank;

    public ExamProctorManager() {
        questionBank = new HashMap<>();
    }

    // Add question to exam
    public void addQuestion(int questionId, String correctAnswer) {
        questionBank.put(questionId, new Question(questionId, correctAnswer));
    }

    // Auto-calculate score
    public int calculateScore(HashMap<Integer, String> studentAnswers) {

        int score = 0;

        for (Map.Entry<Integer, String> entry : studentAnswers.entrySet()) {

            int qId = entry.getKey();
            String studentAnswer = entry.getValue();

            if (questionBank.containsKey(qId)) {
                Question q = questionBank.get(qId);

                if (q.getCorrectAnswer().equalsIgnoreCase(studentAnswer)) {
                    score++;
                }
            }
        }

        return score;
    }

    // Display navigation history
    public void displayNavigation(Stack<Integer> navigationStack) {

        if (navigationStack.isEmpty()) {
            System.out.println("No navigation history.");
            return;
        }

        System.out.println("Question Navigation History (Last Visited First):");
        for (int qId : navigationStack) {
            System.out.println("Question " + qId);
        }
    }
}
