package com.javastreams.readuserinput;
import java.io.FileWriter;
import java.io.IOException;

public class UserFileWriter {

    private String filePath;

    public UserFileWriter(String filePath) {
        this.filePath = filePath;
    }

    public void saveUserData(String name, int age, String language) throws IOException {

        FileWriter writer = new FileWriter(filePath, true);

        writer.write("Name: " + name + "\n");
        writer.write("Age: " + age + "\n");
        writer.write("Favorite Language: " + language + "\n");
        writer.write("-----------------------------\n");

        writer.close();
    }
}
