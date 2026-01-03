package com.linkedlist.SocialMediaFriendConnection;

public class User {

    int userId;
    String name;
    int age;

    FriendNode friendsHead; // list of friend IDs
    User next;              // next user in main list

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }
}

