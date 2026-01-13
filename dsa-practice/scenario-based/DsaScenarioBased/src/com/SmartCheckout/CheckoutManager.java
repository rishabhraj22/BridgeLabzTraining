package com.SmartCheckout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CheckoutManager {

    private Queue<Customer> customerQueue;
    private HashMap<String, Item> inventory;

    public CheckoutManager() {
        customerQueue = new LinkedList<>();
        inventory = new HashMap<>();
    }

    // Add item to inventory
    public void addItemToInventory(String name, double price, int stock) {
        inventory.put(name, new Item(name, price, stock));
    }

    // Display inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("Current Inventory:");
        for (Item item : inventory.values()) {
            System.out.println(item);
        }
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println("Customer added to queue: " + customer.getCustomerName());
    }

    // Process next customer
    public void processNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        System.out.println("Processing customer: " + customer.getCustomerName());

        double totalBill = 0.0;

        for (Map.Entry<String, Integer> entry : customer.getCart().entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();

            if (!inventory.containsKey(itemName)) {
                System.out.println("Item not found: " + itemName);
                continue;
            }

            Item item = inventory.get(itemName);

            if (item.getStock() < quantity) {
                System.out.println("Not enough stock for: " + itemName);
                continue;
            }

            double cost = item.getPrice() * quantity;
            totalBill += cost;
            item.reduceStock(quantity);

            System.out.println(itemName + " x " + quantity + " = " + cost);
        }

        System.out.println("Total Bill: " + totalBill);
    }

    // Display customer queue
    public void displayQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("Customer queue is empty.");
            return;
        }

        System.out.println("Customers in Queue:");
        for (Customer c : customerQueue) {
            System.out.println(c.getCustomerName());
        }
    }
}
