package com.encapsulationpolymorphism.OnlineFoodDeliverySystem;

import java.util.List;

public class OrderProcessor {

    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();
                System.out.println(discountable.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");

            grandTotal += finalPrice;
        }

        System.out.println("Grand Total Order Amount: " + grandTotal);
    }
}

