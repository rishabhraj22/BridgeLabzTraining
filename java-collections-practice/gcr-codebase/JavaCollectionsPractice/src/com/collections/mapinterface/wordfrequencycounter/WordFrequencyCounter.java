package com.collections.mapinterface.wordfrequencycounter;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWords(File file) throws IOException {

        Map<String, Integer> freqMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {

            line = line.toLowerCase();                 // ignore case
            line = line.replaceAll("[^a-z0-9 ]", " "); // remove punctuation

            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        br.close();
        return freqMap;
    }
}
