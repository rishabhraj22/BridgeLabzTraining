package com.lambdaexpression.nameuppercasing;
import java.util.*;

public class HRLetterMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            employees.add(new Employee(sc.nextLine()));
        }

        System.out.println("\nNames in uppercase:");
        employees.stream()
                 .map(Employee::getName)
                 .map(String::toUpperCase)  // method reference
                 .forEach(System.out::println);

        sc.close();
    }
}
