package com.Searching.ChallengeProblem.ProblemOne;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadPerformanceService {

    public long readUsingFileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Word Count: " + wordCount);

        return endTime - startTime;
    }

    public long readUsingInputStreamReader(String filePath) {
        long startTime = System.currentTimeMillis();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Word Count: " + wordCount);

        return endTime - startTime;
    }
}
