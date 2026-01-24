package com.exceptions.trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {

    public static String readFirstLine(String fileName) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();
        }
    }
}
