package com.designpattern.smartuniversitylibrarymanagementsystem.usercreation;
public class Librarian implements User {

    @Override
    public void showRole() {
        System.out.println("Role: Librarian");
    }

    @Override
    public int getBorrowDays() {
        return 0; // librarians manage inventory, not borrow
    }
}
