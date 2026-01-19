package com.FleetManager;
import java.util.Scanner;

public class FleetManager {

    // Merge Sort for vehicles based on mileage
    public static void mergeSort(Vehicle[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge logic (ascending mileage = earlier maintenance)
    public static void merge(Vehicle[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].getMileage() <= R[j].getMileage()) {
                arr[k] = L[i];
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

        System.out.print("Enter total number of vehicles from all depots: ");
        int n = sc.nextInt();
        sc.nextLine();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter vehicle " + (i + 1));

            System.out.print("Vehicle ID: ");
            String id = sc.nextLine();

            System.out.print("Mileage (km): ");
            int mileage = sc.nextInt();
            sc.nextLine();

            vehicles[i] = new Vehicle(id, mileage);
        }

        // Create master maintenance schedule
        mergeSort(vehicles, 0, n - 1);

        System.out.println("\n🔧 Master Maintenance Schedule (Low Mileage First):");
        for (Vehicle v : vehicles) {
            v.display();
        }
    }
}
