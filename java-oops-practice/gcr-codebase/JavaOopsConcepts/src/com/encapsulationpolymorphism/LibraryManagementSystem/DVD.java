package com.encapsulationpolymorphism.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // Short-term loan
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerId) {
        if (isAvailable()) {
            assignBorrower(borrowerName, borrowerId);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

