package com.inheritence.OnlineRetailOrderManagement;

public class OrderTest {
    public static void main(String[] args) {

        Order order1 = new Order(101, "01-09-2025");
        Order order2 = new ShippedOrder(102, "02-09-2025", "TRK12345");
        Order order3 = new DeliveredOrder(103, "03-09-2025", "TRK67890", "05-09-2025");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}

