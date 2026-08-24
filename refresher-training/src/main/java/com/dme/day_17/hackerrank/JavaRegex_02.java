package com.dme.day_17.hackerrank;
import java.io.*;
import java.util.*;
import java.util.regex.*;

class MyRegex {
    String pattern = "^(([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";
}

public class JavaRegex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern pattern = Pattern.compile(myRegex.pattern);
        while (sc.hasNextLine()) {
            String ip = sc.nextLine();
            Matcher matcher = pattern.matcher(ip);
            System.out.println(matcher.matches());
        }
    }
}
