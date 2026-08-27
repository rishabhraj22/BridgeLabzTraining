package com.dme.day_16.hackerrank;

import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
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
        System.out.println(myCalculator.divisorSum(n));
    }
}
