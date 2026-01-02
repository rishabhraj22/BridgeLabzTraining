package com.encapsulationpolymorphism.LibraryManagementSystem;

public interface Reservable {
    void reserveItem(String borrowerName, String borrowerId);
    boolean checkAvailability();
}
