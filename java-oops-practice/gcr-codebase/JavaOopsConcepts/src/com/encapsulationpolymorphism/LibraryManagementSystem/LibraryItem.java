package com.encapsulationpolymorphism.LibraryManagementSystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Encapsulated borrower details
    private String borrowerName;
    private String borrowerId;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation: controlled access
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void assignBorrower(String name, String id) {
        this.borrowerName = name;
        this.borrowerId = id;
        this.isAvailable = false;
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.borrowerId = null;
        this.isAvailable = true;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    protected String getMaskedBorrowerId() {
        if (borrowerId == null) return "N/A";
        return "XXXX" + borrowerId.substring(borrowerId.length() - 2);
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Availability: " + (isAvailable ? "Available" : "Issued"));
    }
}

