package com.sortingalgorithms.SelectionSortExamScores;
public class ExamScores {

    private int[] scores;

    public ExamScores(int[] scores) {
        this.scores = scores;
    }

    public int[] getScores() {
        return scores;
    }

    public void displayScores() {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
