package com.javastreams.countwords;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public Map<String, Integer> countWords(String line, Map<String, Integer> map) {

        String[] words = line.toLowerCase().split("\\W+");

        for (String word : words) {
            if (word.isEmpty()) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
