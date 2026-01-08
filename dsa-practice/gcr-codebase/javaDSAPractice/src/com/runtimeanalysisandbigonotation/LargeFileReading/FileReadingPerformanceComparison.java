package com.runtimeanalysisandbigonotation.LargeFileReading;
import java.util.Scanner;

public class FileReadingPerformanceComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();

        // -------- FileReader --------
        long startFileReader = System.nanoTime();
        FileReaderUtil.readFile(filePath);
        long endFileReader = System.nanoTime();

        System.out.println("\nFileReader Time: " + (endFileReader - startFileReader) + " ns");

        // -------- InputStreamReader --------
        long startInputStreamReader = System.nanoTime();
        InputStreamReaderUtil.readFile(filePath);
        long endInputStreamReader = System.nanoTime();

        System.out.println("InputStreamReader Time: " + (endInputStreamReader - startInputStreamReader) + " ns");
    }
}
