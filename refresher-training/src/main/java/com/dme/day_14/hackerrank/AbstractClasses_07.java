package com.dme.day_14.hackerrank;

import java.io.*;
import java.util.*;

abstract class Book_07 {
    String title;
    String author;
    int price;
    Book_07(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    abstract void display();
}

class MyBook_07 extends Book_07 {
    MyBook_07(String title, String author, int price) {
        super(title, author, price);
    }
    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class AbstractClasses_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        MyBook_07 book = new MyBook_07(title, author, price);
        book.display();
    }
}