package com.Searching.ChallengeProblem.ProblemOne;
import java.util.Scanner;

public class PerformanceComparisonApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== String Performance Test =====
        System.out.print("Enter number of times to append (e.g. 1000000): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        StringPerformanceService stringService = new StringPerformanceService();

        long bufferTime = stringService.testStringBufferPerformance(n);
        long builderTime = stringService.testStringBuilderPerformance(n);

        System.out.println("\n--- String Performance Results ---");
        System.out.println("StringBuffer Time  : " + bufferTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");

        // ===== File Read Performance Test =====
        System.out.print("\nEnter large file path (e.g. 100MB file): ");
        String filePath = sc.nextLine();

        FileReadPerformanceService fileService = new FileReadPerformanceService();

        long fileReaderTime = fileService.readUsingFileReader(filePath);
        long inputStreamReaderTime = fileService.readUsingInputStreamReader(filePath);

        System.out.println("\n--- File Reading Performance Results ---");
        System.out.println("FileReader Time        : " + fileReaderTime + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

        sc.close();
    }
}
