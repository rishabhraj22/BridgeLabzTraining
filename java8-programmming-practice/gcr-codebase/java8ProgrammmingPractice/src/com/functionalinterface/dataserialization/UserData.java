package com.functionalinterface.dataserialization;
import java.io.Serializable;

public class UserData implements Serializable {

    private String username;
    private int age;

    public UserData(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getInfo() {
        return "UserData [username=" + username + ", age=" + age + "]";
    }
}
