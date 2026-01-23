package com.javastreams.serialisation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeInput {

    public static List<Employee> readEmployees() {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEmployee " + i);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.add(new Employee(id, name, dept, salary));
        }

        return employees;
    }
}
