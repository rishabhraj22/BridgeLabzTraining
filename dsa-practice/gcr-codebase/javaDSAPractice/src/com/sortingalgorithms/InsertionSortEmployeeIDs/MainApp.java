package com.sortingalgorithms.InsertionSortEmployeeIDs;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] idsArray = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            idsArray[i] = sc.nextInt();
        }

        EmployeeIDs employeeIDs = new EmployeeIDs(idsArray);

        InsertionSort.sort(employeeIDs.getEmployeeIds());

        System.out.println("Employee IDs in Ascending Order:");
        employeeIDs.displayEmployeeIds();

        sc.close();
    }
}
