package com.collections.shoppingcart;
import java.util.*;

public class ShoppingCart {

    // fast lookup
    private Map<String, Double> priceMap = new HashMap<>();

    // insertion order
    private Map<String, Double> cart = new LinkedHashMap<>();

    public void addItem(String name, double price) {
        priceMap.put(name, price);
        cart.put(name, price);
    }

    public void displayInsertionOrder() {
        System.out.println("\nCart (Insertion Order):");
        cart.forEach((k, v) -> System.out.println(k + " : ₹" + v));
    }

    public void displaySortedByPrice() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, Double> e : cart.entrySet()) {
            sorted.computeIfAbsent(e.getValue(), k -> new ArrayList<>())
                  .add(e.getKey());
        }

        System.out.println("\nCart (Sorted by Price):");
        sorted.forEach((price, items) ->
                items.forEach(item -> System.out.println(item + " : ₹" + price)));
    }

    public double getTotal() {
        double total = 0;
        for (double price : cart.values()) total += price;
        return total;
    }
}
