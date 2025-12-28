package com.constructor.level1;

public class EBook extends Book2 {

    // Parameterized constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display eBook details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);       // public
        System.out.println("Title: " + title);     // protected
        System.out.println("Author: " + getAuthor()); // private via method
    }
}

