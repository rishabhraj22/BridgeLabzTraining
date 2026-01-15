package com.EventManager;
import java.util.Scanner;

public class EventManager {

    // Quick Sort
    public static void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tickets, low, high);

            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    // Partition logic
    public static int partition(Ticket[] tickets, int low, int high) {
        double pivot = tickets[high].getPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].getPrice() < pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Ticket[] tickets = new Ticket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Ticket " + (i + 1));

            System.out.print("Ticket ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Event Name: ");
            String eventName = sc.nextLine();

            System.out.print("Ticket Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            tickets[i] = new Ticket(id, eventName, price);
        }

        // Sorting tickets by price using Quick Sort
        quickSort(tickets, 0, n - 1);

        System.out.println("\n🎯 Tickets Sorted by Price (Low to High):");
        for (Ticket t : tickets) {
            t.display();
        }

        // Showing Top 3 Cheapest (example of real use)
        System.out.println("\n🔥 Top Cheapest Tickets:");
        for (int i = 0; i < Math.min(3, n); i++) {
            tickets[i].display();
        }
    }
}
