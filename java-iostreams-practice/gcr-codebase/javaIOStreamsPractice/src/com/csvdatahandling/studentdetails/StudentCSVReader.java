package com.csvdatahandling.studentdetails;
import java.io.*;
import java.util.*;

public class StudentCSVReader {

    public List<Student> readStudents(String filePath) {
        List<Student> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double marks = Double.parseDouble(data[3]);

                list.add(new Student(id, name, age, marks));
            }
        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
        return list;
    }
}
