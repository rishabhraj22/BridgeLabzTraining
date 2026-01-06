package com.sortingalgorithms.MergeSortBookPrices;
public class MergeSort {

    public static void sort(double[] arr) {
        if (arr.length < 2) {
            return; // already sorted
        }

        int mid = arr.length / 2;

        double[] left = new double[mid];
        double[] right = new double[arr.length - mid];

        // Copy data to left array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // Copy data to right array
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort both halves
        sort(left);
        sort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    private static void merge(double[] arr, double[] left, double[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[]
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[]
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
