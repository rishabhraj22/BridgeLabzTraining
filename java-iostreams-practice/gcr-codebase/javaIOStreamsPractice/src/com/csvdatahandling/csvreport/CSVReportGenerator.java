package com.csvdatahandling.csvreport;
import java.io.*;
import java.util.*;

public class CSVReportGenerator {

    public void generate(String path, List<Employee> employees) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("EmployeeID,Name,Department,Salary");
            bw.newLine();

            for (Employee e : employees) {
                bw.write(e.id + "," + e.name + "," + e.department + "," + e.salary);
                bw.newLine();
            }

            System.out.println("CSV Report generated successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
