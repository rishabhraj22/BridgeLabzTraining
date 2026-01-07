package com.Searching.ChallengeProblem.ProblemTwo;
import java.util.Arrays;

public class BinarySearchService {

    public int findTargetIndex(int[] arr, int target) {

        // Sort the array before binary search
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2; // safe mid

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }
}
