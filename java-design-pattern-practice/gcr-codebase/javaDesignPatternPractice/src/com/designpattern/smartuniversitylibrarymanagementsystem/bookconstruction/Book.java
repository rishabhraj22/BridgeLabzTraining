package com.designpattern.smartuniversitylibrarymanagementsystem.bookconstruction;
public class Book {

    // Mandatory
    private String title;

    // Optional
    private String authors;
    private String edition;
    private String genre;
    private String publisher;

    // Private constructor (only Builder can create)
    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
    }

    // Display book details
    public void showDetails() {
        System.out.println("\n📘 Book Details:");
        System.out.println("Title: " + title);

        if (authors != null && !authors.isEmpty()) {
            System.out.println("Authors: " + authors);
        }
        if (edition != null && !edition.isEmpty()) {
            System.out.println("Edition: " + edition);
        }
        if (genre != null && !genre.isEmpty()) {
            System.out.println("Genre: " + genre);
        }
        if (publisher != null && !publisher.isEmpty()) {
            System.out.println("Publisher: " + publisher);
        }
    }

    // Static inner Builder class
    public static class BookBuilder {

        // Mandatory
        private String title;

        // Optional
        private String authors;
        private String edition;
        private String genre;
        private String publisher;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder authors(String authors) {
            this.authors = authors;
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
