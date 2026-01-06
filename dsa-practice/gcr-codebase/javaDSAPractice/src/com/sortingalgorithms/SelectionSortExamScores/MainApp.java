package com.sortingalgorithms.SelectionSortExamScores;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scoreArray = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scoreArray[i] = sc.nextInt();
        }

        ExamScores examScores = new ExamScores(scoreArray);

        SelectionSort.sort(examScores.getScores());

        System.out.println("Exam Scores in Ascending Order:");
        examScores.displayScores();

        sc.close();
    }
}
