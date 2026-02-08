package com.designpattern.smartuniversitylibrarymanagementsystem.notifications;
public class UserObserver implements Observer {

    private String userName;

    public UserObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println("🔔 Notification for " + userName + ": " + message);
    }
}
