package com.EduResults;
import java.util.Scanner;

public class EduResultsApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🏫 Welcome to EduResults – Rank Sheet Generator");

        System.out.print("Enter total number of students (all districts combined): ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(id, name, marks);
        }

        System.out.println("\n📊 Merging and Sorting Rank List using Merge Sort...");
        MergeSort.mergeSort(students, 0, students.length - 1);

        System.out.println("\n🏆 Final State-Wise Rank List (High → Low):");
        for (Student s : students) {
            s.show();
        }

        sc.close();
    }
}
