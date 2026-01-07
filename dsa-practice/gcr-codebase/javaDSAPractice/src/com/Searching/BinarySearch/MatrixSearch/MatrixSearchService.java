package com.Searching.BinarySearch.MatrixSearch;
public class MatrixSearchService {

    public boolean searchInMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2; // safe mid calculation

            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false; // target not found
    }
}
