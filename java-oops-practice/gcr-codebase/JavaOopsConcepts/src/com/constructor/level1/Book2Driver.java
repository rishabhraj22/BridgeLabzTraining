package com.constructor.level1;

public class Book2Driver {

    public static void main(String[] args) {

        // Creating EBook object
        EBook ebook =
                new EBook("ISBN12345", "Java Programming", "James Gosling");

        // Displaying eBook details
        ebook.displayDetails();

        System.out.println();

        // Updating author name
        ebook.setAuthor("Oracle Team");

        // Displaying updated details
        ebook.displayDetails();
    }
}

