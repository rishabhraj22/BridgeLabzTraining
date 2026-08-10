package com.dme.day_07.hackerrank;

import java.util.*;

public class SuperDigit_04 {

    public static int superDigit(String n, int k) {
        long sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += n.charAt(i) - '0';
        }
        sum = sum*k;
        return superDigit(sum);
    }

    private static int superDigit(long n) {
        if(n < 10){
            return (int) n;
        }
        long sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        int result = superDigit(n, k);
        System.out.println(result);
    }
}
