package com.BookShelf;
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryCatalog catalog = new LibraryCatalog();

        int choice;

        do {
            System.out.println("\n===== 📚 Library Organizer Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    Book book = new Book(title, author, isbn);
                    catalog.addBook(genre, book);
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String removeGenre = sc.nextLine();

                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = sc.nextLine();

                    catalog.removeBook(removeGenre, removeIsbn);
                    break;

                case 3:
                    catalog.displayCatalog();
                    break;

                case 4:
                    System.out.println("👋 Exiting Library System. Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
