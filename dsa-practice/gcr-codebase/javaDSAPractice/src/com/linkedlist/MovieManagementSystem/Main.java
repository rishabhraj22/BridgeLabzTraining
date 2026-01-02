package com.linkedlist.MovieManagementSystem;

public class Main {

    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 9.0);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.8);
        movies.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.8);

        System.out.println("Movies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director:");
        movies.searchByDirector("Christopher Nolan");

        movies.updateRating("Avatar", 8.2);
        movies.removeByTitle("Inception");

        System.out.println("\nAfter Updates:");
        movies.displayForward();
    }
}

