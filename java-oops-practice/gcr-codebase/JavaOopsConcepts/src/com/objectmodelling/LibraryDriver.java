package com.objectmodelling;

public class LibraryDriver {

    public static void main(String[] args) {

        // Creating Book objects
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Data Structures", "Mark Allen");
        Book book3 = new Book("Python Basics", "Guido van Rossum");

        // Creating Library objects
        Library centralLibrary = new Library("Central Library");
        Library cityLibrary = new Library("City Library");

        // Adding books to libraries
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        cityLibrary.addBook(book2);
        cityLibrary.addBook(book3);

        // Displaying books in each library
        centralLibrary.displayLibraryBooks();
        cityLibrary.displayLibraryBooks();
    }
}

