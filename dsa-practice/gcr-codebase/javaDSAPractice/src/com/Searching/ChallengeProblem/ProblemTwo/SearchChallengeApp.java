package com.Searching.ChallengeProblem.ProblemTwo;
import java.util.Scanner;

public class SearchChallengeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ===== Linear Search: First Missing Positive =====
        MissingPositiveService missingService = new MissingPositiveService();
        int missing = missingService.findFirstMissingPositive(arr.clone());

        System.out.println("First missing positive number: " + missing);

        // ===== Binary Search: Target Index =====
        System.out.print("Enter target number to search: ");
        int target = sc.nextInt();

        BinarySearchService binaryService = new BinarySearchService();
        int index = binaryService.findTargetIndex(arr, target);

        if (index != -1) {
            System.out.println("Target found at index (after sorting): " + index);
        } else {
            System.out.println("Target not found in the array.");
        }

        sc.close();
    }
}
