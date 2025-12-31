package com.inheritence.LibraryManagement;

public class LibraryTest {
    public static void main(String[] args) {

        Author book1 = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java and API design"
        );

        book1.displayInfo();
    }
}

