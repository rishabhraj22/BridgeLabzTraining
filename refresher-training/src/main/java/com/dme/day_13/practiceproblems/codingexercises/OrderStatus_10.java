package com.dme.day_13.classwork.practiceproblems.codingexercises;

enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED;
    boolean isFinal() {
        if (this == DELIVERED || this == CANCELLED) {
            return true;
        }
        return false;
    }
}

class Order {
    int orderId;
    OrderStatus status;
    Order(int orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.PLACED;
    }
    void updateStatus(OrderStatus newStatus) {
        status = newStatus;
        System.out.println("Order " + orderId + " status: " + status);
        System.out.println("Is final? " + status.isFinal());
    }
}

public class OrderStatus_10 {
    public static void main(String[] args) {
        Order order = new Order(101);
        order.updateStatus(OrderStatus.PLACED);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);
    }
}
