package com.dme.day_03.hackerrank;

import java.util.Scanner;

public class InsertNodeAtHead_02 {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node insertNodeAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
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
            head = insertNodeAtHead(head, data);
        }
        printLinkedList(head);
    }
}