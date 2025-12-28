package com.constructor.level1;

public class Book2 {

    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Parameterized constructor
    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get author name
    public String getAuthor() {
        return author;
    }

    // Public method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }
}

