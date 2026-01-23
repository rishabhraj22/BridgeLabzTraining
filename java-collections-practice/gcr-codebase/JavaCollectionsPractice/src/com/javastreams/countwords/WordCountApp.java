package com.javastreams.countwords;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordCountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordMap = new HashMap<>();

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        FileWordReader reader = new FileWordReader();
        TopWordFinder finder = new TopWordFinder();

        try {
            reader.readAndCount(filePath, wordMap);

            List<Map.Entry<String, Integer>> topWords =
                    finder.getTopWords(wordMap, 5);

            System.out.println("\n📊 Top 5 Most Frequent Words:");
            for (Map.Entry<String, Integer> entry : topWords) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
