package com.Searching.InputStreamReader.ConsoleToFile;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFileService {

    public void readFromConsoleAndWriteToFile(String filePath) {

        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(filePath, true) // append mode
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(input);
                writer.write(System.lineSeparator());
            }

            System.out.println("Data successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
