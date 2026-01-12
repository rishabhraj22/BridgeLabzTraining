package com.BookShelf;
import java.util.*;

public class LibraryCatalog {

    private HashMap<String, LinkedList<Book>> genreMap;
    private HashSet<String> isbnSet; // To avoid duplication

    public LibraryCatalog() {
        genreMap = new HashMap<>();
        isbnSet = new HashSet<>();
    }

    // Add book
    public void addBook(String genre, Book book) {
        if (isbnSet.contains(book.getIsbn())) {
            System.out.println("❌ Duplicate book! This ISBN already exists.");
            return;
        }

        genreMap.putIfAbsent(genre, new LinkedList<>());
        genreMap.get(genre).add(book);
        isbnSet.add(book.getIsbn());

        System.out.println("✅ Book added successfully.");
    }

    // Remove book by ISBN
    public void removeBook(String genre, String isbn) {
        LinkedList<Book> books = genreMap.get(genre);

        if (books == null || books.isEmpty()) {
            System.out.println("❌ No books found in this genre.");
            return;
        }

        Iterator<Book> iterator = books.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getIsbn().equals(isbn)) {
                iterator.remove();
                isbnSet.remove(isbn);
                found = true;
                System.out.println("✅ Book removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Book not found.");
        }
    }

    // Display all books
    public void displayCatalog() {
        if (genreMap.isEmpty()) {
            System.out.println("Library catalog is empty.");
            return;
        }

        for (String genre : genreMap.keySet()) {
            System.out.println("\nGenre: " + genre);
            LinkedList<Book> books = genreMap.get(genre);

            for (Book b : books) {
                System.out.println("  " + b);
            }
        }
    }
}
