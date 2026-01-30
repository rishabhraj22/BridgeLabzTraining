package com.csvdatahandling.filterrecords;
import java.io.*;

public class StudentFilterService {

    public void filter(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // header
            System.out.println("Students scoring more than 80:\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                double marks = Double.parseDouble(data[3]);

                if (marks > 80) {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
