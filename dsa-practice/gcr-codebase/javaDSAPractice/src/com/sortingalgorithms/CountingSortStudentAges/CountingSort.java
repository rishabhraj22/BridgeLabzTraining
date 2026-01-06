package com.sortingalgorithms.CountingSortStudentAges;
public class CountingSort {

    public static void sort(int[] arr, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Step 1: Store frequency of each age
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 2: Cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Step 3: Place elements in correct position (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy output array to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
