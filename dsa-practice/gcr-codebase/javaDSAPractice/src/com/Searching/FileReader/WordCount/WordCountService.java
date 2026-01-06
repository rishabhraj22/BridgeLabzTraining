package com.Searching.FileReader.WordCount;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountService {

    public int countWordOccurrence(String filePath, String targetWord) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+"); // split by spaces

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }

        return count;
    }
}
