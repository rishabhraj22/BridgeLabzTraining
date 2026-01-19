package com.RoboWarehouse;
import java.util.Scanner;

public class RoboWarehouse {

    // Insertion Sort for dynamic shelf loading
    public static void insertionSort(PackageItem[] packages, int count) {

        for (int i = 1; i < count; i++) {
            PackageItem key = packages[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && packages[j].getWeight() > key.getWeight()) {
                packages[j + 1] = packages[j];
                j--;
            }

            packages[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of packages to load: ");
        int n = sc.nextInt();

        PackageItem[] shelf = new PackageItem[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nLoading Package " + (i + 1));

            System.out.print("Enter Package ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Package Weight (kg): ");
            double weight = sc.nextDouble();

            shelf[count] = new PackageItem(id, weight);
            count++;

            // Maintain sorted shelf after each insertion
            insertionSort(shelf, count);
        }

        System.out.println("\n📦 Shelf State (Sorted by Weight - Ascending):");
        for (int i = 0; i < count; i++) {
            shelf[i].display();
        }
    }
}
