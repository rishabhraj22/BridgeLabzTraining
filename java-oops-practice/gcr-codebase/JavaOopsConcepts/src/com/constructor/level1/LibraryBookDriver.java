package com.constructor.level1;

public class LibraryBookDriver {

    public static void main(String[] args) {

        // Creating library book object
        LibraryBook book = new LibraryBook("Data Structures", "Mark Allen", 650);

        // Displaying book status
        book.displayStatus();

        System.out.println();

        // Borrowing the book
        book.borrowBook();

        System.out.println();

        // Trying to borrow again
        book.borrowBook();

        System.out.println();

        // Displaying final status
        book.displayStatus();
    }
}

