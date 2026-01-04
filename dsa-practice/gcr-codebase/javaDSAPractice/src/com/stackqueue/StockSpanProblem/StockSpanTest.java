package com.stackqueue.StockSpanProblem;
import java.util.Arrays;

public class StockSpanTest {

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Prices: " + Arrays.toString(prices));

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Stock Span:   " + Arrays.toString(span));
    }
}
