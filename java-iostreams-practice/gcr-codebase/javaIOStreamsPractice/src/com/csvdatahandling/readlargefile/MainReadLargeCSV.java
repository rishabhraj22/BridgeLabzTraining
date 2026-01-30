package com.csvdatahandling.readlargefile;
import java.io.*;
import java.util.*;

public class MainReadLargeCSV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter large CSV path: ");
        String path = sc.nextLine();

        int batchSize = 100;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String line;

            List<String> batch = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                batch.add(line);
                count++;

                if (batch.size() == batchSize) {
                    System.out.println("Processed: " + count + " records");
                    batch.clear();
                }
            }

            if (!batch.isEmpty()) {
                System.out.println("Processed: " + count + " records");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
