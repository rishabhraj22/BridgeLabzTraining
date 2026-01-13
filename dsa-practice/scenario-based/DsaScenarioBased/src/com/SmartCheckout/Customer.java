package com.SmartCheckout;
import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String customerName;
    private HashMap<String, Integer> cart; // itemName -> quantity

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new HashMap<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public HashMap<String, Integer> getCart() {
        return cart;
    }

    public void addItemToCart(String itemName, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("Items:\n");

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}
