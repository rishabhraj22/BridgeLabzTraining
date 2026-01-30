package com.csvdatahandling.csvreport;
import java.util.*;

public class MainGenerateCSVReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter output CSV path: ");
        String path = sc.nextLine();

        EmployeeDAO dao = new EmployeeDAO();
        CSVReportGenerator gen = new CSVReportGenerator();

        gen.generate(path, dao.fetchEmployees());
    }
}
