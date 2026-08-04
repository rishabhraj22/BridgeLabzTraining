package com.dme.day_03.hackerrank;

import java.util.*;

public class PrintLinkedList_01 {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void printLinkedList(Node head) {
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node last = null;

        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                last = newNode;
            }else{
                last.next = newNode;
                last = newNode;
            }
        }
        printLinkedList(head);
    }
}