package com.javastreams.readlargefile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {

    public void readFile(String filePath, ErrorLineFilter filter)
            throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            if (filter.containsError(line)) {
                System.out.println(line);
            }
        }

        reader.close();
    }
}
