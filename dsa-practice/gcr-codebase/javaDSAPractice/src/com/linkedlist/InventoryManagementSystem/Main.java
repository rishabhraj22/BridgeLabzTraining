package com.linkedlist.InventoryManagementSystem;

public class Main {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000);

        System.out.println("Inventory:");
        inventory.displayAll();

        inventory.updateQuantity(102, 25);
        inventory.searchByItemName("Laptop");

        inventory.calculateTotalValue();

        System.out.println("\nSorted by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("\nSorted by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayAll();
    }
}

