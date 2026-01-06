package com.sortingalgorithms.QuickSortProductPrices;
public class ProductPrices {

    private double[] prices;

    public ProductPrices(double[] prices) {
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
