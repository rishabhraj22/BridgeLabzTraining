package com.FoodFest;
import java.util.Scanner;

public class FoodFest {

    // Merge Sort by footfall (descending: highest performance first)
    public static void mergeSort(FoodStall[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge logic (Stable)
    public static void merge(FoodStall[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        FoodStall[] L = new FoodStall[n1];
        FoodStall[] R = new FoodStall[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            // Higher footfall first
            if (L[i].getFootfall() >= R[j].getFootfall()) {
                arr[k] = L[i];  // stability preserved
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of food stalls (all zones): ");
        int n = sc.nextInt();
        sc.nextLine();

        FoodStall[] stalls = new FoodStall[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter stall " + (i + 1));

            System.out.print("Stall Name: ");
            String name = sc.nextLine();

            System.out.print("Footfall Count: ");
            int count = sc.nextInt();
            sc.nextLine();

            stalls[i] = new FoodStall(name, count);
        }

        // Create master performance list
        mergeSort(stalls, 0, n - 1);

        System.out.println("\n📊 FoodFest – Master Stall Performance Report:");
        for (FoodStall s : stalls) {
            s.display();
        }
    }
}
