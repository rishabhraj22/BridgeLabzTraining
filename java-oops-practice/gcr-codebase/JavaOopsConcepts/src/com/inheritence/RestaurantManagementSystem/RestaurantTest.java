package com.inheritence.RestaurantManagementSystem;

public class RestaurantTest {
    public static void main(String[] args) {

        Worker w1 = new Chef("Rahul", 101);
        Worker w2 = new Waiter("Amit", 102);

        ((Person) w1).displayInfo();
        w1.performDuties();
        System.out.println("------------------");

        ((Person) w2).displayInfo();
        w2.performDuties();
    }
}

