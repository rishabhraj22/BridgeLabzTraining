package com.Searching.FileReader.ReadFile;
import java.util.Scanner;

public class FileReaderApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path to read: ");
        String filePath = sc.nextLine();

        FileReaderService service = new FileReaderService();
        service.readFileLineByLine(filePath);

        sc.close();
    }
}
