package com.LibraryScenario;

class Library {

    void processLoan(User user, Book book) {
        Loan loan = new Loan(user, book);
        loan.borrowBook();
    }

    void processReturn(User user, Book book) {
        Loan loan = new Loan(user, book);
        loan.returnBook();
    }
}

