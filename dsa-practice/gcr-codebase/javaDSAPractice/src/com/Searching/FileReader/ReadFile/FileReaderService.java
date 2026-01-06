package com.Searching.FileReader.ReadFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {

    public void readFileLineByLine(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
