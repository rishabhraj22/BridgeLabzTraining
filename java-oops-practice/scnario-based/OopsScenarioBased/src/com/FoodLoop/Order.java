package com.FoodLoop;
import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    private double total;
    private String status = "Created"; // protected

    public void addItem(FoodItem item, int qty) {
        if (item.reduceStock(qty)) {
            items.add(item);
            quantities.add(qty);
            System.out.println("Added " + qty + " x " + item.name);
        } else {
            System.out.println("❌ Not enough stock for " + item.name);
        }
    }

    private double calculateTotal() {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).price * quantities.get(i);
        }
        return sum;
    }

    private double calculateDiscount() {
        double discount = 0;
        for (int i = 0; i < items.size(); i++) {
            double itemTotal = items.get(i).price * quantities.get(i);
            discount += items.get(i).applyDiscount(itemTotal);
        }
        return discount;
    }

    @Override
    public void placeOrder() {
        total = calculateTotal();
        double discount = calculateDiscount();
        total = total - discount;

        status = "Placed";

        System.out.println("\n--- Order Placed ---");
        System.out.println("Total Amount: ₹" + (total + discount));
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        status = "Cancelled";
        System.out.println("❌ Order Cancelled");
    }

    public void showOrderDetails() {
        System.out.println("\n--- Order Details ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).name + " | Qty: " + quantities.get(i));
        }
        System.out.println("Order Status: " + status);
    }
}
