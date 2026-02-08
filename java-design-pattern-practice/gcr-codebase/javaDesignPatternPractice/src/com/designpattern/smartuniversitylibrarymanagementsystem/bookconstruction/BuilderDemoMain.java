package com.designpattern.smartuniversitylibrarymanagementsystem.bookconstruction;
import java.util.Scanner;

public class BuilderDemoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Smart University Library System - Builder Demo");

        System.out.print("Enter book title (mandatory): ");
        String title = sc.nextLine();

        Book.BookBuilder builder = new Book.BookBuilder(title);

        System.out.print("Enter authors (optional, press Enter to skip): ");
        String authors = sc.nextLine();
        if (!authors.isEmpty()) {
            builder.authors(authors);
        }

        System.out.print("Enter edition (optional, press Enter to skip): ");
        String edition = sc.nextLine();
        if (!edition.isEmpty()) {
            builder.edition(edition);
        }

        System.out.print("Enter genre (optional, press Enter to skip): ");
        String genre = sc.nextLine();
        if (!genre.isEmpty()) {
            builder.genre(genre);
        }

        System.out.print("Enter publisher (optional, press Enter to skip): ");
        String publisher = sc.nextLine();
        if (!publisher.isEmpty()) {
            builder.publisher(publisher);
        }

        Book book = builder.build();
        book.showDetails();

        sc.close();
    }
}
