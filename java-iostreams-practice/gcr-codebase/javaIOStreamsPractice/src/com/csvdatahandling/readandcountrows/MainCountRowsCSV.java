package com.csvdatahandling.readandcountrows;
import java.io.*;
import java.util.*;

public class MainCountRowsCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV file path: ");
        String path = sc.nextLine();

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine(); // skip header

            while (br.readLine() != null) {
                count++;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Total records (excluding header): " + count);
    }
}
