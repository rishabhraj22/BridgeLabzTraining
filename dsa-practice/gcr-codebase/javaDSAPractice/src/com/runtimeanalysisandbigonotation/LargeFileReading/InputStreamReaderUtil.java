package com.runtimeanalysisandbigonotation.LargeFileReading;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderUtil {

    public static void readFile(String filePath) {

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                // Just reading, not printing
            }

        } catch (IOException e) {
            System.out.println("Error reading file using InputStreamReader: " + e.getMessage());
        }
    }
}
