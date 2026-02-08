package com.collectors;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class LibraryBookStatistics {

    static class Book {
        String title;
        String genre;
        int pages;

        Book(String title, String genre, int pages) {
            this.title = title;
            this.genre = genre;
            this.pages = pages;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Book> books = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            System.out.print("Enter genre: ");
            String genre = sc.nextLine();
            System.out.print("Enter number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine();

            books.add(new Book(title, genre, pages));
        }

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                        .collect(groupingBy(b -> b.genre,
                                summarizingInt(b -> b.pages)));

        System.out.println("\nBook statistics by genre:");
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages: " + stats.getSum());
            System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Max Pages: " + stats.getMax());
        });
    }
}
