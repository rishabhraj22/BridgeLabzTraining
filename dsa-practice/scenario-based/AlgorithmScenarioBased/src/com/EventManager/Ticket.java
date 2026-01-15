package com.EventManager;
public class Ticket {

    private int ticketId;
    private String eventName;
    private double price;

    public Ticket(int ticketId, String eventName, double price) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Ticket ID: " + ticketId +
                           ", Event: " + eventName +
                           ", Price: " + price);
    }
}
