package com.linkedlist.OnlineTicketReservation;

public class CircularTicketList {

    private Ticket head;
    private Ticket tail;

    /* 1. Add ticket at end */
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        Ticket newTicket = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
            return;
        }

        tail.next = newTicket;
        newTicket.next = head;
        tail = newTicket;
    }

    /* 2. Remove ticket by Ticket ID */
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        // Single node case
        if (head.ticketId == id && head == tail) {
            head = tail = null;
            System.out.println("Ticket removed");
            return;
        }

        Ticket curr = head;
        Ticket prev = tail;

        do {
            if (curr.ticketId == id) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found");
    }

    /* 3. Display all tickets */
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    /* 4. Search by Customer Name */
    public void searchByCustomer(String name) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for this customer");
    }

    /* 5. Search by Movie Name */
    public void searchByMovie(String movie) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for this movie");
    }

    /* 6. Count total tickets */
    public void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total booked tickets: " + count);
    }

    private void displayTicket(Ticket t) {
        System.out.println(
                "Ticket ID: " + t.ticketId +
                ", Customer: " + t.customerName +
                ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber +
                ", Time: " + t.bookingTime
        );
    }
}

