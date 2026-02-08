package com.collectors;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class EmployeeSalaryCategorization {

    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.add(new Employee(name, dept, salary));
        }

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(groupingBy(e -> e.department,
                                averagingDouble(e -> e.salary)));

        System.out.println("\nAverage salary by department:");
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg));
    }
}
