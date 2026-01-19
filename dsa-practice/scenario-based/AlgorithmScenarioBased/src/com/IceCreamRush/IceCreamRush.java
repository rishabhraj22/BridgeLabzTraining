package com.IceCreamRush;
import java.util.Scanner;

public class IceCreamRush {

    // Bubble Sort by sales count (Descending: most popular first)
    public static void bubbleSort(IceCreamFlavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent flavors
                if (flavors[j].getSalesCount() < flavors[j + 1].getSalesCount()) {
                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of ice cream flavors: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        IceCreamFlavor[] flavors = new IceCreamFlavor[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Flavor " + (i + 1));

            System.out.print("Flavor Name: ");
            String name = sc.nextLine();

            System.out.print("Weekly Sales Count: ");
            int sales = sc.nextInt();
            sc.nextLine();

            flavors[i] = new IceCreamFlavor(name, sales);
        }

        // Sort flavors by popularity
        bubbleSort(flavors);

        System.out.println("\n🍦 IceCreamRush – Flavors Sorted by Popularity:");
        for (IceCreamFlavor f : flavors) {
            f.display();
        }
    }
}
