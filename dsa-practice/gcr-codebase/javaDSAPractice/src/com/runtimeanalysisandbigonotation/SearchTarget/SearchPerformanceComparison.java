package com.runtimeanalysisandbigonotation.SearchTarget;
import java.util.*;

public class SearchPerformanceComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Fill array
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        // -------- Linear Search --------
        long startLinear = System.nanoTime();
        int linearResult = LinearSearch.search(arr, target);
        long endLinear = System.nanoTime();

        System.out.println("\nLinear Search Result Index: " + linearResult);
        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");

        // -------- Binary Search --------
        Arrays.sort(arr); // Important for Binary Search

        long startBinary = System.nanoTime();
        int binaryResult = BinarySearch.search(arr, target);
        long endBinary = System.nanoTime();

        System.out.println("\nBinary Search Result Index: " + binaryResult);
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
    }
}
