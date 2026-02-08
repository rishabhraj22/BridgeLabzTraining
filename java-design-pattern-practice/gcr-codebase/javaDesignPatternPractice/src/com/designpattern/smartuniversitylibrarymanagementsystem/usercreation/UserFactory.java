package com.designpattern.smartuniversitylibrarymanagementsystem.usercreation;
public class UserFactory {

    public static User createUser(String role) {

        if (role == null) {
            return null;
        }

        switch (role.toLowerCase()) {
            case "student":
                return new Student();
            case "faculty":
                return new Faculty();
            case "librarian":
                return new Librarian();
            default:
                return null;
        }
    }
}
