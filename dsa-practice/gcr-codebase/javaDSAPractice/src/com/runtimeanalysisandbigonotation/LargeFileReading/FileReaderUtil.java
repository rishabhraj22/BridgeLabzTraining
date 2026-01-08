package com.runtimeanalysisandbigonotation.LargeFileReading;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    public static void readFile(String filePath) {

        try (FileReader reader = new FileReader(filePath)) {

            int ch;
            while ((ch = reader.read()) != -1) {
                // Just reading, not printing (printing slows performance)
            }

        } catch (IOException e) {
            System.out.println("Error reading file using FileReader: " + e.getMessage());
        }
    }
}
