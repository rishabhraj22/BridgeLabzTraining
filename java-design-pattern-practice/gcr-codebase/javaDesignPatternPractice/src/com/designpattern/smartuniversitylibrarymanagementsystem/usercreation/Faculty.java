package com.designpattern.smartuniversitylibrarymanagementsystem.usercreation;
public class Faculty implements User {

    @Override
    public void showRole() {
        System.out.println("Role: Faculty");
    }

    @Override
    public int getBorrowDays() {
        return 30; // faculty get extended borrowing time
    }
}
