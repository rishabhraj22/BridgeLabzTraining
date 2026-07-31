package com.dme.day_01.hackerrank;

import java.util.*;

public class PlusMinus_02 {

    public static void plusMinus(List<Integer> arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int n = arr.size();

        for (int a : arr) {
            if (a > 0) {
                pos++;
            } else if (a < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f%n", (double) pos / n);
        System.out.printf("%.6f%n", (double) neg / n);
        System.out.printf("%.6f%n", (double) zero / n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }
        plusMinus(arr);
    }
}