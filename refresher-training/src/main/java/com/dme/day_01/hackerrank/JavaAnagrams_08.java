package com.dme.day_01.hackerrank;

import java.io.*;
import java.util.*;

public class JavaAnagrams_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        } else{
            System.out.println("Not Anagrams");
        }
    }
}

