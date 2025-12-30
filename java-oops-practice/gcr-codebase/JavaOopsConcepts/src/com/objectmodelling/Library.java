package com.objectmodelling;

import java.util.ArrayList;

public class Library {

    // Declaring library name
    String libraryName;

    // Library has a list of Book objects
    ArrayList<Book> books;

    // Parameterized constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display library details
    public void displayLibraryBooks() {

        System.out.println("\nLibrary Name: " + libraryName);
        System.out.println("Books in Library:");

        // Looping through books
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }
    }
}

