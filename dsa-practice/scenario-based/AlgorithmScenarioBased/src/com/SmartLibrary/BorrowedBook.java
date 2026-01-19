package com.SmartLibrary;
public class BorrowedBook {

    private String title;
    private String author;

    public BorrowedBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
