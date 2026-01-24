package com.exceptions.trywithresources;
public class FileApp {

    public static void main(String[] args) {

        try {
            String line = FileLineReader.readFirstLine("info.txt");

            if (line != null) {
                System.out.println("First line: " + line);
            } else {
                System.out.println("File is empty");
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
