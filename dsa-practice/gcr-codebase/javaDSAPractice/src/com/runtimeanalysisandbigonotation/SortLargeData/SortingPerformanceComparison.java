package com.runtimeanalysisandbigonotation.SortLargeData;
import java.util.*;

public class SortingPerformanceComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        Random rand = new Random();

        // Fill array with random numbers
        for (int i = 0; i < n; i++) {
            original[i] = rand.nextInt(100000);
        }

        // Copy arrays for fair comparison
        int[] arrBubble = Arrays.copyOf(original, n);
        int[] arrMerge = Arrays.copyOf(original, n);
        int[] arrQuick = Arrays.copyOf(original, n);

        // -------- Bubble Sort --------
        long startBubble = System.nanoTime();
        BubbleSort.sort(arrBubble);
        long endBubble = System.nanoTime();
        System.out.println("\nBubble Sort Time: " + (endBubble - startBubble) + " ns");

        // -------- Merge Sort --------
        long startMerge = System.nanoTime();
        MergeSort.sort(arrMerge, 0, arrMerge.length - 1);
        long endMerge = System.nanoTime();
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) + " ns");

        // -------- Quick Sort --------
        long startQuick = System.nanoTime();
        QuickSort.sort(arrQuick, 0, arrQuick.length - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) + " ns");
    }
}
