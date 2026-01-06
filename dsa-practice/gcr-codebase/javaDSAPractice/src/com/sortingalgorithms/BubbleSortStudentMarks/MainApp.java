package com.sortingalgorithms.BubbleSortStudentMarks;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marksArray = new int[n];

        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marksArray[i] = sc.nextInt();
        }

        StudentMarks studentMarks = new StudentMarks(marksArray);

        BubbleSort.sort(studentMarks.getMarks());

        System.out.println("Marks in Ascending Order:");
        studentMarks.displayMarks();

        sc.close();
    }
}
