package com.ExamCell;
public class Student {

    private int rollNo;
    private String name;
    private int score;

    public Student(int rollNo, String name, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo +
                           ", Name: " + name +
                           ", Score: " + score);
    }
}
