package com.constructor.level1;

public class BookDriver {

    public static void main(String[] args) {

        // Creating object using default constructor
        Book book1 = new Book();
        book1.display();

        System.out.println();

        // Creating object using parameterized constructor
        Book book2 = new Book("Java Programming", "James Gosling", 499.99);
        book2.display();
    }
}

