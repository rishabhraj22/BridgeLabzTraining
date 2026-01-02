package com.linkedlist.StudentRecordManagement;

public class StudentLinkedList {

    private Student head;

    /* Add at Beginning */
    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    /* Add at End */
    public void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /* Add at Specific Position (1-based index) */
    public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /* Delete by Roll Number */
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    /* Search by Roll Number */
    public void searchByRollNo(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    /* Update Grade */
    public void updateGrade(int rollNo, char newGrade) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    /* Display All Records */
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        Student temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    private void displayStudent(Student s) {
        System.out.println(
                "Roll No: " + s.rollNo +
                ", Name: " + s.name +
                ", Age: " + s.age +
                ", Grade: " + s.grade
        );
    }
}

