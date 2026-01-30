package com.csvdatahandling.detectduplicates;
import java.io.*;
import java.util.*;

public class MainDetectDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CSV file path: ");
        String path = sc.nextLine();

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String id = line.split(",")[0];

                if (!seen.add(id)) {
                    duplicates.add(line);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nDuplicate records:");
        for (String d : duplicates) {
            System.out.println(d);
        }
    }
}
