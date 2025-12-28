package com.constructor.level1;

public class PersonDriver {

    public static void main(String[] args) {

        // Creating original person object
        Person p1 = new Person("Ravi", 25);

        // Creating copy of person object
        Person p2 = new Person(p1);

        // Displaying original person details
        System.out.println("Original Person:");
        p1.display();

        System.out.println();

        // Displaying copied person details
        System.out.println("Copied Person:");
        p2.display();
    }
}

