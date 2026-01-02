package com.encapsulationpolymorphism.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Clean Code", "Robert C. Martin"));
        items.add(new Magazine(2, "National Geographic", "Various"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        // Polymorphism: same reference, different behavior
        for (LibraryItem item : items) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem("Rishabh", "STU12345");
            }

            System.out.println("----------------------------------");
        }
    }
}

