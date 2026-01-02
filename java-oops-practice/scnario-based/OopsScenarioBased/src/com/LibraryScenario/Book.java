package com.LibraryScenario;

class Book {
    private String bookId;
    private String title;
    private boolean isAvailable;

    Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    boolean isAvailable() {
        return isAvailable;
    }

    void markBorrowed() {
        isAvailable = false;
    }

    void markReturned() {
        isAvailable = true;
    }

    String getTitle() {
        return title;
    }
}
