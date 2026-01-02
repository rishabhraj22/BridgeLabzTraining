package com.LibraryScenario;

public class LibraryTest {
    public static void main(String[] args) {

        Book book1 = new Book("B101", "Clean Code");
        User user1 = new User("U201", "Ravi");

        Library library = new Library();

        library.processLoan(user1, book1);
        library.processReturn(user1, book1);
    }
}

