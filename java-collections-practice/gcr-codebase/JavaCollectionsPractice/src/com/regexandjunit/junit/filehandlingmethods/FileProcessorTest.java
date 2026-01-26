package com.regexandjunit.junit.filehandlingmethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final String filename = "testfile.txt";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(filename));
    }

    @Test
    @DisplayName("Content should be written and read correctly")
    void testWriteAndReadFile() throws IOException {
        FileProcessor processor = new FileProcessor();

        processor.writeToFile(filename, "JUnit File Test");
        String content = processor.readFromFile(filename);

        assertEquals("JUnit File Test", content);
    }

    @Test
    @DisplayName("File should exist after writing")
    void testFileExists() throws IOException {
        FileProcessor processor = new FileProcessor();

        processor.writeToFile(filename, "Check File");

        assertTrue(Files.exists(Path.of(filename)));
    }

    @Test
    @DisplayName("Reading non-existing file should throw IOException")
    void testFileNotFoundException() {
        FileProcessor processor = new FileProcessor();

        assertThrows(
                IOException.class,
                () -> processor.readFromFile("non_existing_file.txt")
        );
    }
}
