package com.TailorShop;
public class Order {

    private int orderId;
    private String customerName;
    private int deliveryDate; // YYYYMMDD format

    public Order(int orderId, String customerName, int deliveryDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryDate = deliveryDate;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }

    public void display() {
        System.out.println(
            "Order ID: " + orderId +
            ", Customer: " + customerName +
            ", Delivery Date: " + deliveryDate
        );
    }
}
