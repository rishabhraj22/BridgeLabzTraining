package com.linkedlist.SocialMediaFriendConnection;

public class SocialMediaLinkedList {

    private User head;

    /* Add new user */
    public void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    /* Search user by ID */
    private User findUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    /* Search user by Name */
    public void searchUserByName(String name) {
        User temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    /* Search user by ID */
    public void searchUserById(int id) {
        User user = findUserById(id);
        if (user == null)
            System.out.println("User not found");
        else
            displayUser(user);
    }

    /* Add friend connection (bidirectional) */
    public void addFriendConnection(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        addFriend(u1, id2);
        addFriend(u2, id1);

        System.out.println("Friend connection added");
    }

    private void addFriend(User user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendsHead;
        user.friendsHead = newFriend;
    }

    /* Remove friend connection (bidirectional) */
    public void removeFriendConnection(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        removeFriend(u1, id2);
        removeFriend(u2, id1);

        System.out.println("Friend connection removed");
    }

    private void removeFriend(User user, int friendId) {
        FriendNode temp = user.friendsHead;
        FriendNode prev = null;

        while (temp != null) {
            if (temp.friendId == friendId) {
                if (prev == null)
                    user.friendsHead = temp.next;
                else
                    prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    /* Display friends of a user */
    public void displayFriends(int userId) {
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendsHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    /* Find mutual friends */
    public void findMutualFriends(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friendsHead;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friendsHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Friend ID: " + f1.friendId);
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("No mutual friends");
    }

    /* Count friends for each user */
    public void countFriendsForAllUsers() {
        User temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendsHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private void displayUser(User u) {
        System.out.println(
                "User ID: " + u.userId +
                ", Name: " + u.name +
                ", Age: " + u.age
        );
    }
}

