package com.dme.day_01.hackerrank;

import java.util.*;

public class SimpleArraySum_01 {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int a : ar) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> ar = new ArrayList<>();

        for(int i = 0; i<n; i++){
            ar.add(sc.nextInt());
        }

        int result = simpleArraySum(ar);
        System.out.println(result);
    }
}
