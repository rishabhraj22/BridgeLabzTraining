package com.LibraryScenario;

class Loan {
    private User user;
    private Book book;

    Loan(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    void borrowBook() {
        if (book.isAvailable()) {
            book.markBorrowed();
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available");
        }
    }

    void returnBook() {
        book.markReturned();
        System.out.println(user.getName() + " returned " + book.getTitle());
    }
}

