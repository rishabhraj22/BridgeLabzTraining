package com.Searching.BinarySearch.PeakElementSearch;
public class PeakElementSearchService {

    public int findPeakElementIndex(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2; // safe mid

            if (arr[mid] < arr[mid + 1]) {
                // Peak is in right half
                left = mid + 1;
            } else {
                // Peak is in left half or at mid
                right = mid;
            }
        }

        // left == right is a peak element index
        return left;
    }
}
