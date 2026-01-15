package com.ExamProctor;
import java.util.HashMap;
import java.util.Stack;

public class StudentSession {

    private Stack<Integer> navigationStack;          // question navigation
    private HashMap<Integer, String> answerMap;      // questionId -> answer

    public StudentSession() {
        navigationStack = new Stack<>();
        answerMap = new HashMap<>();
    }

    // Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Answer a question
    public void answerQuestion(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question: " + questionId);
    }

    public Stack<Integer> getNavigationStack() {
        return navigationStack;
    }

    public HashMap<Integer, String> getAnswerMap() {
        return answerMap;
    }
}
