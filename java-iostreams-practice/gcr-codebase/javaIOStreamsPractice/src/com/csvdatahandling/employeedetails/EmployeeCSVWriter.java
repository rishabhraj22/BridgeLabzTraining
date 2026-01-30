package com.csvdatahandling.employeedetails;
import java.io.*;
import java.util.*;

public class EmployeeCSVWriter {

    public void writeToCSV(String filePath, List<Employee> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            for (Employee e : list) {
                bw.write(e.id + "," + e.name + "," + e.department + "," + e.salary);
                bw.newLine();
            }

            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
