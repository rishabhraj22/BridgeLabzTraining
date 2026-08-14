package com.dme.day_11.hackerrank;

import java.util.*;

public class AppendAndDelete_05 {

    public static String appendAndDelete(String s, String t, int k) {
        int common = 0;
        while (common < s.length() && common < t.length() && s.charAt(common) == t.charAt(common)) {
            common++;
        }
        int diff1 = s.length() - common;
        int diff2 = t.length() - common;
        int required = diff1 + diff2;
        if (required > k) {
            return "No";
        }
        if ((k - required) % 2 == 0) {
            return "Yes";
        }
        if (k >= s.length() + t.length()) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String t = sc.nextLine();
        System.out.print("Enter number of operations: ");
        int k = sc.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println("Result: " + result);
    }
}