package com.javastreams.readlargefile;
import java.io.IOException;
import java.util.Scanner;

public class LargeFileErrorScannerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter large file path: ");
        String filePath = sc.nextLine();

        LargeFileReader reader = new LargeFileReader();
        ErrorLineFilter filter = new ErrorLineFilter();

        try {
            reader.readFile(filePath, filter);
            System.out.println("\n✅ Scan completed.");

        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
