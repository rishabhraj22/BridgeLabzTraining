package com.linkedlist.SocialMediaFriendConnection;

public class Main {

    public static void main(String[] args) {

        SocialMediaLinkedList network = new SocialMediaLinkedList();

        network.addUser(1, "Riya", 21);
        network.addUser(2, "Aman", 22);
        network.addUser(3, "Kunal", 20);
        network.addUser(4, "Neha", 23);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(3, 4);

        System.out.println();
        network.displayFriends(1);

        System.out.println();
        network.findMutualFriends(1, 2);

        System.out.println();
        network.searchUserByName("Neha");

        System.out.println();
        network.countFriendsForAllUsers();

        System.out.println();
        network.removeFriendConnection(1, 3);
        network.displayFriends(1);
    }
}

