package com.Searching.BinarySearch.RotationPointSearch;
import java.util.Scanner;

public class RotationPointSearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        RotationPointSearchService service = new RotationPointSearchService();
        int index = service.findRotationPointIndex(arr);

        System.out.println("Rotation point (smallest element) index: " + index);
        System.out.println("Smallest element value: " + arr[index]);

        sc.close();
    }
}
