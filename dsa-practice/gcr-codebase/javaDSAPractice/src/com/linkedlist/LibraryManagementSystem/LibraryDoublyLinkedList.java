package com.linkedlist.LibraryManagementSystem;

public class LibraryDoublyLinkedList {

    private Book head;
    private Book tail;

    /* 1. Add at Beginning */
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        Book newBook = new Book(id, title, author, genre, available);

        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    /* 2. Add at End */
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        Book newBook = new Book(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    /* 3. Add at Specific Position (1-based index) */
    public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Book newBook = new Book(id, title, author, genre, available);
        newBook.next = temp.next;
        newBook.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newBook;
        } else {
            tail = newBook;
        }

        temp.next = newBook;
    }

    /* 4. Remove Book by ID */
    public void removeByBookId(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        Book temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
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

        System.out.println("Book removed successfully");
    }

    /* 5. Search by Title */
    public void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with given title");
        }
    }

    /* 6. Search by Author */
    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found for this author");
        }
    }

    /* 7. Update Availability */
    public void updateAvailability(int id, boolean status) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    /* 8. Display Forward */
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        Book temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    /* 9. Display Reverse */
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        Book temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    /* 10. Count Books */
    public void countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total books in library: " + count);
    }

    private void displayBook(Book b) {
        System.out.println(
                "ID: " + b.bookId +
                ", Title: " + b.title +
                ", Author: " + b.author +
                ", Genre: " + b.genre +
                ", Available: " + (b.isAvailable ? "Yes" : "No")
        );
    }
}

