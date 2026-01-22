package com.collections.mapinterface.wordfrequencycounter;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        try {
            Map<String, Integer> result =
                    WordFrequencyCounter.countWords(file);

            System.out.println("Word Frequency:");
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
