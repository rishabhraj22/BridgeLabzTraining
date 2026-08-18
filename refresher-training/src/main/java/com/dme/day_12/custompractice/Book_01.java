package com.dme.day_12.custompractice;

class Book {

    String title;
    String author;
    String isBn;
    static int totalBooksInLibrary = 0;
    static int totalBooksCheckedOut = 0;

    Book(String title, String author, String isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
        totalBooksInLibrary++;
    }

    void checkOut() {
        totalBooksCheckedOut++;
    }
    void returnBook() {
        totalBooksCheckedOut--;
    }
}

class Main_01 {

    public static void main(String[] args) {

        Book b1 = new Book("Java", "James", "ISBN101");
        Book b2 = new Book("Python", "Guido", "ISBN102");
        Book b3 = new Book("C++", "Bjarne", "ISBN103");
        Book b4 = new Book("DSA", "Robert", "ISBN104");
        Book b5 = new Book("Spring", "Rod", "ISBN105");

        b1.checkOut();
        b2.checkOut();
        b3.checkOut();
        b2.returnBook();

        System.out.println("Total books in library: " + Book.totalBooksInLibrary);
        System.out.println("Total books checked out: " + Book.totalBooksCheckedOut);
    }
}
