package com.sortingalgorithms.QuickSortProductPrices;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        double[] priceArray = new double[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            priceArray[i] = sc.nextDouble();
        }

        ProductPrices productPrices = new ProductPrices(priceArray);

        QuickSort.sort(productPrices.getPrices(), 0, productPrices.getPrices().length - 1);

        System.out.println("Product Prices in Ascending Order:");
        productPrices.displayPrices();

        sc.close();
    }
}
