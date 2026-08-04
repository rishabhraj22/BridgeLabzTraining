package com.dme.day_03.hackerrank;

import java.util.Scanner;

public class ReverseLinkedList_04 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
        Node last = null;

        for(int i = 0; i<n; i++){
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = last = newNode;
            } else{
                last.next = newNode;
                last = newNode;
            }
        }
        head = reverse(head);
        printLinkedList(head);
    }
}