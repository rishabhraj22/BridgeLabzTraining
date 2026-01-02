package com.encapsulationpolymorphism.OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50; // per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getBaseTotal() + (NON_VEG_CHARGE * getQuantity());
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
