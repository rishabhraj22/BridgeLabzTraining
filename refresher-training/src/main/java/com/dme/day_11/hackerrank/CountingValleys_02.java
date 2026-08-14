package com.dme.day_11.hackerrank;

import java.util.*;

public class CountingValleys_02 {

    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valleys = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                level++;
            } else {
                level--;
            }
            if (level == 0 && path.charAt(i) == 'U') {
                valleys++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int steps = sc.nextInt();
        System.out.print("Enter path: ");
        String path = sc.next();
        int result = countingValleys(steps, path);
        System.out.println("Number of valleys: " + result);
    }
}