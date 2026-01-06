package com.Searching.InputStreamReader.ConsoleToFile;
import java.util.Scanner;

public class ConsoleToFileApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path to write data: ");
        String filePath = sc.nextLine();

        ConsoleToFileService service = new ConsoleToFileService();
        service.readFromConsoleAndWriteToFile(filePath);

        sc.close();
    }
}
