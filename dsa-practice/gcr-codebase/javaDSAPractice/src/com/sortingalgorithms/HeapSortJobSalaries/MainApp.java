package com.sortingalgorithms.HeapSortJobSalaries;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();

        double[] salaryArray = new double[n];

        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaryArray[i] = sc.nextDouble();
        }

        JobSalaries jobSalaries = new JobSalaries(salaryArray);

        HeapSort.sort(jobSalaries.getSalaries());

        System.out.println("Salary Demands in Ascending Order:");
        jobSalaries.displaySalaries();

        sc.close();
    }
}
