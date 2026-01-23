package com.collections.mapinterface.groupbydepartment;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            employees.add(new Employee(name, dept));
        }

        Map<String, List<Employee>> grouped =
                EmployeeGrouper.groupByDepartment(employees);

        System.out.println("\nEmployees grouped by department:");
        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
