package com.Searching.ChallengeProblem.ProblemTwo;
public class MissingPositiveService {

    // Finds the first missing positive integer using marking approach
    public int findFirstMissingPositive(int[] arr) {

        int n = arr.length;

        // Step 1: Mark numbers <=0 or >n as 1 (out of range)
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 1;
            }
        }

        // Step 2: Use index marking
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

        // Step 3: Find first positive index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
