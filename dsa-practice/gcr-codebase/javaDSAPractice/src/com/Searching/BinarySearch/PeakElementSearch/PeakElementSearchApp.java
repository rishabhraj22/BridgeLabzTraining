package com.Searching.BinarySearch.PeakElementSearch;
import java.util.Scanner;

public class PeakElementSearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PeakElementSearchService service = new PeakElementSearchService();
        int index = service.findPeakElementIndex(arr);

        System.out.println("Peak element found at index: " + index);
        System.out.println("Peak element value: " + arr[index]);

        sc.close();
    }
}
