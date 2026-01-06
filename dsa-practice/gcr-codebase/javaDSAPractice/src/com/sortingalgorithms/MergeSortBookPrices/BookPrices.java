package com.sortingalgorithms.MergeSortBookPrices;
public class BookPrices {

    private double[] prices;

    public BookPrices(double[] prices) {
        this.prices = prices;
    }

    public double[] getPrices() {
        return prices;
    }

    public void displayPrices() {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
