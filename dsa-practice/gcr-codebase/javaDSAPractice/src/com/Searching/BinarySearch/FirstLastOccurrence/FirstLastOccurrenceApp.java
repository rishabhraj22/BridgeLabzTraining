package com.Searching.BinarySearch.FirstLastOccurrence;
import java.util.Scanner;

public class FirstLastOccurrenceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        FirstLastOccurrenceService service = new FirstLastOccurrenceService();

        int firstIndex = service.findFirstOccurrence(arr, target);
        int lastIndex = service.findLastOccurrence(arr, target);

        if (firstIndex == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First Occurrence Index: " + firstIndex);
            System.out.println("Last Occurrence Index : " + lastIndex);
        }

        sc.close();
    }
}
