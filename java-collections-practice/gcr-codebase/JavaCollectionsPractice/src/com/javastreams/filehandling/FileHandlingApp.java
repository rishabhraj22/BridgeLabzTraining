package com.javastreams.filehandling;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter destination file path: ");
        String destinationFile = sc.nextLine();

        if (!FileValidator.isFileAvailable(sourceFile)) {
            System.out.println("❌ Source file does not exist.");
            return;
        }

        try {
            FileCopier.copyTextFile(sourceFile, destinationFile);
            System.out.println("✅ File copied successfully.");
        } catch (IOException e) {
            System.out.println("⚠️ Error while copying file: " + e.getMessage());
        }

        sc.close();
    }
}
