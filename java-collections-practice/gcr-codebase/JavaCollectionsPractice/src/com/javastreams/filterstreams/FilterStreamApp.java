package com.javastreams.filterstreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilterStreamApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter destination file path: ");
        String destFile = sc.nextLine();

        TextFileReader readerProvider = new TextFileReader();
        TextFileWriter writerProvider = new TextFileWriter();
        LowerCaseFilter filter = new LowerCaseFilter();

        try (
            BufferedReader reader = readerProvider.getReader(sourceFile);
            BufferedWriter writer = writerProvider.getWriter(destFile)
        ) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(filter.convertToLower(line));
                writer.newLine();
            }

            System.out.println("✅ File converted to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
