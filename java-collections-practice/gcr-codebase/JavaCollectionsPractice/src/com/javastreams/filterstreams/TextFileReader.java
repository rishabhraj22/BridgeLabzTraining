package com.javastreams.filterstreams;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextFileReader {

    public BufferedReader getReader(String filePath) throws IOException {
        return new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8
                )
        );
    }
}
