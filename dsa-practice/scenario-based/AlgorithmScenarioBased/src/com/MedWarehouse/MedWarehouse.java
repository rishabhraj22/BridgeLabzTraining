package com.MedWarehouse;
import java.util.Scanner;

public class MedWarehouse {

    // Merge Sort by expiry date (earliest expiry first)
    public static void mergeSort(Medicine[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge logic (Stable)
    public static void merge(Medicine[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            // Earlier expiry first
            if (L[i].getExpiryDate() <= R[j].getExpiryDate()) {
                arr[k] = L[i]; // stability preserved
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

        System.out.print("Enter total number of medicines (all branches): ");
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] medicines = new Medicine[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter medicine " + (i + 1));

            System.out.print("Medicine Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (YYYYMMDD): ");
            int expiry = sc.nextInt();
            sc.nextLine();

            medicines[i] = new Medicine(name, expiry);
        }

        // Create master expiry list
        mergeSort(medicines, 0, n - 1);

        System.out.println("\n🚨 Master Expiry List (Soonest First):");
        for (Medicine m : medicines) {
            m.display();
        }
    }
}
