package com.Searching.StringBuffer.StringPerformance;
import java.util.Scanner;

public class StringPerformanceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to append (e.g. 1000000): ");
        int n = sc.nextInt();

        StringPerformanceService service = new StringPerformanceService();

        long bufferTime = service.testStringBufferPerformance(n);
        long builderTime = service.testStringBuilderPerformance(n);

        System.out.println("\nPerformance Results:");
        System.out.println("StringBuffer Time  : " + bufferTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");

        sc.close();
    }
}
