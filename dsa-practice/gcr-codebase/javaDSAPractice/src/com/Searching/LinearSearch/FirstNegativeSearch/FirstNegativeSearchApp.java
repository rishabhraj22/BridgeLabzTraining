package com.Searching.LinearSearch.FirstNegativeSearch;
import java.util.Scanner;

public class FirstNegativeSearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        FirstNegativeSearchService service = new FirstNegativeSearchService();
        int index = service.findFirstNegativeIndex(arr);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }

        sc.close();
    }
}
