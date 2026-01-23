package com.javastreams.readuserinput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputReader {

    private BufferedReader reader;

    public UserInputReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readName() throws IOException {
        System.out.print("Enter your name: ");
        return reader.readLine();
    }

    public int readAge() throws IOException {
        System.out.print("Enter your age: ");
        return Integer.parseInt(reader.readLine());
    }

    public String readLanguage() throws IOException {
        System.out.print("Enter your favorite programming language: ");
        return reader.readLine();
    }
}
