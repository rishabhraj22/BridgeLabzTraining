package com.restaurantorderprocessingsystem;
public class RestaurantMain {

    public static void main(String[] args) {

        System.out.println("Restaurant Order Processing Started...\n");

        // Create 4 chef threads with different dishes and times
        ChefThread chef1 = new ChefThread("Chef-1", "Pizza", 3000);   // 3 seconds
        ChefThread chef2 = new ChefThread("Chef-2", "Pasta", 2000);   // 2 seconds
        ChefThread chef3 = new ChefThread("Chef-3", "Salad", 1000);   // 1 second
        ChefThread chef4 = new ChefThread("Chef-4", "Burger", 2500);  // 2.5 seconds

        // Start all chefs
        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        // Manager (main thread) waits for all chefs to finish
        try {
            chef1.join();
            chef2.join();
            chef3.join();
            chef4.join();
        } catch (InterruptedException e) {
            System.out.println("Manager thread interrupted.");
        }

        System.out.println("Kitchen closed - All orders completed");
    }
}
