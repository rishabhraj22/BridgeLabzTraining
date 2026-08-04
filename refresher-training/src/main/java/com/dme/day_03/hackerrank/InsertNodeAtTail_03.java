package com.dme.day_03.hackerrank;

import java.util.Scanner;

public class InsertNodeAtTail_03 {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node insertNodeAtTail(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    static void printLinkedList(Node head) {
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;

        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            head = insertNodeAtTail(head, data);
        }
        printLinkedList(head);
    }
}