package com.exceptions.checkedexceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {

    public static void main(String[] args) {

        String fileName = "data.txt";

        try {
            readFile(fileName);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    // Method that may throw a checked exception
    private static void readFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        System.out.println("File contents:\n");

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
