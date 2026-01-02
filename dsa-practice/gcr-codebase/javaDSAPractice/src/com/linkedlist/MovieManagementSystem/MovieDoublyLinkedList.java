package com.linkedlist.MovieManagementSystem;

public class MovieDoublyLinkedList {

    private Movie head;
    private Movie tail;

    /* 1. Add at Beginning */
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /* 2. Add at End */
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    /* 3. Add at Specific Position (1-based index) */
    public void addAtPosition(int position, String title, String director, int year, double rating) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Movie newNode = new Movie(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    /* 4. Remove Movie by Title */
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("Movie list is empty");
            return;
        }

        Movie temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie removed successfully");
    }

    /* 5. Search by Director */
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director");
        }
    }

    /* 6. Search by Rating */
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with given rating");
        }
    }

    /* 7. Update Rating by Title */
    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    /* 8. Display Forward */
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        Movie temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    /* 9. Display Reverse */
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available");
            return;
        }

        Movie temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(Movie m) {
        System.out.println(
                "Title: " + m.title +
                ", Director: " + m.director +
                ", Year: " + m.year +
                ", Rating: " + m.rating
        );
    }
}

