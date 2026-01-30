package com.csvdatahandling.searchforarecord;
import java.io.*;

public class EmployeeSearchService {

    public void searchByName(String path, String searchName) {

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); // header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);
                    found = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
