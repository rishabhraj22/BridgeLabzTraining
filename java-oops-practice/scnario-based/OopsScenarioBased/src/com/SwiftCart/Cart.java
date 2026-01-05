package com.SwiftCart;
import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<Product> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    private double totalPrice;

    public Cart() {
        this.totalPrice = 0;
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
        totalPrice += product.getPrice() * quantity;
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (int i = 0; i < products.size(); i++) {
            double itemTotal = products.get(i).getPrice() * quantities.get(i);
            discount += products.get(i).getDiscount(itemTotal);
        }

        totalPrice -= discount;
        System.out.println("Total Discount Applied: ₹" + discount);
    }

    @Override
    public double generateBill() {
        return totalPrice;
    }

    public void showCart() {
        System.out.println("\n--- Cart Items ---");
        for (int i = 0; i < products.size(); i++) {System.out.println(products.get(i).name + " | Qty: " + quantities.get(i) + " | Price: ₹" + products.get(i).getPrice());
        }
    }
}
