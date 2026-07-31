package com.dme.day_01.hackerrank;

import java.io.*;
import java.util.*;

public class JavaStringTokens_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if(s.length() == 0){
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);

        for(String t : tokens){
            System.out.println(t);
        }
    }
}

