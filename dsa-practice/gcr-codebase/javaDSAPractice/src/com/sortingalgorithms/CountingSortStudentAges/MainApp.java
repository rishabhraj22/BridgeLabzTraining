package com.sortingalgorithms.CountingSortStudentAges;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ageArray = new int[n];

        System.out.println("Enter student ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ageArray[i] = sc.nextInt();
        }

        StudentAges studentAges = new StudentAges(ageArray);

        // Since age range is fixed: 10 to 18
        CountingSort.sort(studentAges.getAges(), 10, 18);

        System.out.println("Student Ages in Ascending Order:");
        studentAges.displayAges();

        sc.close();
    }
}
