package com.SmartShelf;
import java.util.Scanner;

public class SmartShelf {

    // Insertion Sort based on Book Title (Alphabetical Order)
    public static void insertionSort(Book[] books, int count) {

        for (int i = 1; i < count; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift books that are greater than key (alphabetically)
            while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Book[] books = new Book[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            books[count] = new Book(id, title, author);
            count++;

            // Real-time sorting after each insertion
            insertionSort(books, count);
        }

        System.out.println("\n SmartShelf – Books Sorted Alphabetically:");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}
