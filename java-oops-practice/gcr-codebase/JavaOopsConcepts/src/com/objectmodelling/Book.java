package com.objectmodelling;

public class Book {

    // Declaring book attributes
    String title;
    String author;

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

