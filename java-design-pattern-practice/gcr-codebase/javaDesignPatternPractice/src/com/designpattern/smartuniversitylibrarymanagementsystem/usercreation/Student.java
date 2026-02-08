package com.designpattern.smartuniversitylibrarymanagementsystem.usercreation;
public class Student implements User {

    @Override
    public void showRole() {
        System.out.println("Role: Student");
    }

    @Override
    public int getBorrowDays() {
        return 14; // students can borrow for 14 days
    }
}
