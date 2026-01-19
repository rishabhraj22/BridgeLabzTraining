package com.FlashDealz;
import java.util.Scanner;

public class FlashDealzApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("⚡ Welcome to FlashDealz – Discount Sorting System");

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Discount (%): ");
            double discount = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(id, name, discount);
        }

        System.out.println("\n🚀 Sorting products by highest discount using Quick Sort...");
        QuickSort.quickSort(products, 0, products.length - 1);

        System.out.println("\n🏆 Top Discounted Products:");
        for (Product p : products) {
            p.show();
        }

        sc.close();
    }
}
