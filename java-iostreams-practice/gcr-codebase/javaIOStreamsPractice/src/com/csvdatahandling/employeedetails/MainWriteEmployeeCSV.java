package com.csvdatahandling.employeedetails;
import java.util.*;

public class MainWriteEmployeeCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter CSV output path: ");
        String path = sc.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter employee " + i + " details");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, dept, salary));
        }

        EmployeeCSVWriter writer = new EmployeeCSVWriter();
        writer.writeToCSV(path, employees);
    }
}
