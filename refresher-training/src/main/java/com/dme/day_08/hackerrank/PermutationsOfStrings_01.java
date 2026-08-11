package com.dme.day_08.hackerrank;

import java.util.*;

public class PermutationsOfStrings_01 {

    public static boolean nextPermutation(List<String> s) {

        int i = s.size()-2;
        while (i >= 0 && s.get(i).compareTo(s.get(i+1)) >= 0) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = s.size()-1;
        while (s.get(j).compareTo(s.get(i)) <= 0) {
            j--;
        }
        String temp = s.get(i);
        s.set(i, s.get(j));
        s.set(j, temp);
        int left = i+1;
        int right = s.size()-1;
        while (left < right) {
            temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            left++;
            right--;
        }
        return true;
    }

    public static void print(List<String> s) {
        for (String str : s) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("ab");
        s.add("bc");
        s.add("cd");
        Collections.sort(s);
        do {
            print(s);
        } while (nextPermutation(s));
    }
}
