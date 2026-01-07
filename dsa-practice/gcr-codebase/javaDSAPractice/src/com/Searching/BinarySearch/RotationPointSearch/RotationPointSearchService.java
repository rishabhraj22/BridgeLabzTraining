package com.Searching.BinarySearch.RotationPointSearch;
public class RotationPointSearchService {

    public int findRotationPointIndex(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2; // safe mid calculation

            if (arr[mid] > arr[right]) {
                // Minimum is in right half
                left = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                right = mid;
            }
        }

        // left == right is the index of smallest element
        return left;
    }
}
