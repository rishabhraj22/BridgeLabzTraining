package com.streamapi.stockpricelogger;
import java.util.*;

class StockPriceLogger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stock prices: ");
        int n = sc.nextInt();

        List<Double> prices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price " + (i + 1) + ": ");
            prices.add(sc.nextDouble());
        }

        System.out.println("\nLive Stock Prices:");

        prices.forEach(price -> System.out.println("Price: " + price));
    }
}
