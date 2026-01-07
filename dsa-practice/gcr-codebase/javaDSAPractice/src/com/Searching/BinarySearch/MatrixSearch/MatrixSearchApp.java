package com.Searching.BinarySearch.MatrixSearch;
import java.util.Scanner;

public class MatrixSearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        MatrixSearchService service = new MatrixSearchService();
        boolean found = service.searchInMatrix(matrix, target);

        if (found) {
            System.out.println("Target value found in the matrix.");
        } else {
            System.out.println("Target value NOT found in the matrix.");
        }

        sc.close();
    }
}
