package com.dme.day_15.hackerrank;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class JavaInterface_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisor_sum(n));

        sc.close();
    }
}
