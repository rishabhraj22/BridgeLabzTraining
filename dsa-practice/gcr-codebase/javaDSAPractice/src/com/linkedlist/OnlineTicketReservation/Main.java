package com.linkedlist.OnlineTicketReservation;

public class Main {

    public static void main(String[] args) {

        CircularTicketList tickets = new CircularTicketList();

        tickets.addTicket(101, "Riya", "Inception", "A12", "18:30");
        tickets.addTicket(102, "Aman", "Inception", "A13", "18:31");
        tickets.addTicket(103, "Kunal", "Interstellar", "B10", "19:00");

        System.out.println("All Tickets:");
        tickets.displayTickets();

        System.out.println("\nSearch by Customer:");
        tickets.searchByCustomer("Riya");

        System.out.println("\nSearch by Movie:");
        tickets.searchByMovie("Inception");

        tickets.countTickets();

        System.out.println("\nAfter Removing Ticket 102:");
        tickets.removeTicket(102);
        tickets.displayTickets();
        tickets.countTickets();
    }
}

