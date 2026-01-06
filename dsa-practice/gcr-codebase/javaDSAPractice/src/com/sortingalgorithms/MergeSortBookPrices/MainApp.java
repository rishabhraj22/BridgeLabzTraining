package com.sortingalgorithms.MergeSortBookPrices;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] priceArray = new double[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            priceArray[i] = sc.nextDouble();
        }

        BookPrices bookPrices = new BookPrices(priceArray);

        MergeSort.sort(bookPrices.getPrices());

        System.out.println("Book Prices in Ascending Order:");
        bookPrices.displayPrices();

        sc.close();
    }
}
