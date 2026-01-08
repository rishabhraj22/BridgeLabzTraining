package com.runtimeanalysisandbigonotation.StringConcatenation;
import java.util.Scanner;

public class StringConcatPerformanceComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of concatenations: ");
        int n = sc.nextInt();

        // -------- Using String --------
        long startString = System.nanoTime();
        String result1 = StringConcatUsingString.concatenate(n);
        long endString = System.nanoTime();

        System.out.println("\nString Time: " + (endString - startString) + " ns");

        // -------- Using StringBuilder --------
        long startBuilder = System.nanoTime();
        String result2 = StringConcatUsingStringBuilder.concatenate(n);
        long endBuilder = System.nanoTime();

        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ns");

        // -------- Using StringBuffer --------
        long startBuffer = System.nanoTime();
        String result3 = StringConcatUsingStringBuffer.concatenate(n);
        long endBuffer = System.nanoTime();

        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ns");
    }
}
