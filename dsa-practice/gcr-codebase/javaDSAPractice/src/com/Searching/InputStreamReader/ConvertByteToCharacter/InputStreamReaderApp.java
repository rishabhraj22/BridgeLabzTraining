package com.Searching.InputStreamReader.ConvertByteToCharacter;
import java.util.Scanner;

public class InputStreamReaderApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        InputStreamReaderService service = new InputStreamReaderService();
        service.readFileUsingInputStreamReader(filePath);

        sc.close();
    }
}
