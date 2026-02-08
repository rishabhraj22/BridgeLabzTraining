package com.designpattern.smartuniversitylibrarymanagementsystem.notifications;
import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Observer> observers = new ArrayList<>();

    // Subscribe
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Unsubscribe
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // When a new book arrives
    public void addNewBook(String bookName) {
        System.out.println("\n📚 New book added to catalog: " + bookName);
        notifyAllObservers("The book '" + bookName + "' is now available!");
    }

    // Notify all subscribers
    private void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
