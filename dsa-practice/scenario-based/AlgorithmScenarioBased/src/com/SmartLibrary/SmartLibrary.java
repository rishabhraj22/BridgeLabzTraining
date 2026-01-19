package com.SmartLibrary;
import java.util.Scanner;

public class SmartLibrary {

    // Insertion Sort by book title (alphabetical)
    public static void insertionSort(BorrowedBook[] books, int count) {

        for (int i = 1; i < count; i++) {
            BorrowedBook key = books[i];
            int j = i - 1;

            // Shift books that come later alphabetically
            while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books to borrow: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        BorrowedBook[] borrowed = new BorrowedBook[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nIssuing Book " + (i + 1));

            System.out.print("Book Title: ");
            String title = sc.nextLine();

            System.out.print("Author Name: ");
            String author = sc.nextLine();

            borrowed[count] = new BorrowedBook(title, author);
            count++;

            // Maintain sorted order after each insertion
            insertionSort(borrowed, count);
        }

        System.out.println("\n📖 Borrowed Books (Sorted Alphabetically):");
        for (int i = 0; i < count; i++) {
            borrowed[i].display();
        }
    }
}
