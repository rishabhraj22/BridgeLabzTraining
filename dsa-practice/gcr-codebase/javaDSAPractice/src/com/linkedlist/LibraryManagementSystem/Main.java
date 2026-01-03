package com.linkedlist.LibraryManagementSystem;

public class Main {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning(1, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtEnd(2, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtPosition(2, 3, "The Alchemist", "Paulo Coelho", "Fiction", false);

        System.out.println("Library Books (Forward):");
        library.displayForward();

        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Joshua Bloch");

        library.updateAvailability(3, true);
        library.removeByBookId(1);

        System.out.println("\nAfter Updates:");
        library.displayForward();

        library.countBooks();
    }
}

