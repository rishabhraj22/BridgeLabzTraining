package com.dme.day_11.hackerrank;

import java.util.*;

public class BeautifulDays_04 {

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int a = i; a <= j; a++) {
            String str = String.valueOf(a);
            String reversed = new StringBuilder(str).reverse().toString();
            int rev = Integer.parseInt(reversed);
            int diff = Math.abs(a - rev);
            if (diff % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting day: ");
        int i = sc.nextInt();
        System.out.print("Enter ending day: ");
        int j = sc.nextInt();
        System.out.print("Enter divisor: ");
        int k = sc.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println("Number of beautiful days: " + result);
    }
}