package com.javastreams.countwords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class FileWordReader {

    private WordCounter counter = new WordCounter();

    public Map<String, Integer> readAndCount(String filePath, Map<String, Integer> map)
            throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            counter.countWords(line, map);
        }

        reader.close();
        return map;
    }
}
