package com.csvdatahandling.sortbysalary;
import java.io.*;
import java.util.*;

public class EmployeeSortService {

    public void sortAndPrintTop5(String path) {

        List<String[]> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String header = br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                list.add(line.split(","));
            }

            list.sort((a, b) -> Double.compare(
                    Double.parseDouble(b[3]),
                    Double.parseDouble(a[3])
            ));

            System.out.println("\nTop 5 highest paid employees:\n");

            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(String.join(",", list.get(i)));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
