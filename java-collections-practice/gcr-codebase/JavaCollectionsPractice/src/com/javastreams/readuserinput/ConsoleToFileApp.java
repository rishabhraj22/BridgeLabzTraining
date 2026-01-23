package com.javastreams.readuserinput;
import java.io.IOException;

public class ConsoleToFileApp {

    public static void main(String[] args) {

        UserInputReader inputReader = new UserInputReader();
        UserFileWriter fileWriter = new UserFileWriter("user_data.txt");

        try {
            String name = inputReader.readName();
            int age = inputReader.readAge();
            String language = inputReader.readLanguage();

            fileWriter.saveUserData(name, age, language);

            System.out.println("✅ User data saved successfully.");

        } catch (NumberFormatException e) {
            System.out.println("❌ Age must be a number.");
        } catch (IOException e) {
            System.out.println("❌ File/Input error: " + e.getMessage());
        }
    }
}
