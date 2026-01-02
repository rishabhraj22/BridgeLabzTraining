package com.linkedlist.StudentRecordManagement;

public class Main {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Riya", 20, 'A');
        list.addAtEnd(102, "Aman", 21, 'B');
        list.addAtPosition(2, 103, "Kunal", 19, 'A');

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nSearch Student:");
        list.searchByRollNo(102);

        list.updateGrade(103, 'A');
        list.deleteByRollNo(101);

        System.out.println("\nAfter Updates:");
        list.displayAll();
    }
}

