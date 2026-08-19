package com.dme.day_14.hackerrank;

import java.util.*;

abstract class Book_06 {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book_06 {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class JavaAbstractClass_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
    }
}