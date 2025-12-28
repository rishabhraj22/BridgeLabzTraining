package com.constructor.level1;

public class LibraryBook {

    // Declaring book attributes
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow book
    public void borrowBook() {

        // Checking availability
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to display book status
    public void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Available: " + available);
    }
}


