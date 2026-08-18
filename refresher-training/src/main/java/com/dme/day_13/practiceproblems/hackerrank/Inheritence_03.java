package com.dme.day_13.practiceproblems.hackerrank;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {
    private int[] scores;
    Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }
    char calculate() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        int average = sum / scores.length;
        if (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

public class Inheritence_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int idNumber = sc.nextInt();
        int numScores = sc.nextInt();
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = sc.nextInt();
        }
        Student student = new Student(firstName, lastName, idNumber, scores);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
    }
}
