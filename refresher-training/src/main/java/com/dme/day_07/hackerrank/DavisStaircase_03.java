package com.dme.day_07.hackerrank;

import java.util.*;

public class DavisStaircase_03 {

    public static int stepPerms(int n) {

        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        return (stepPerms(n-1) + stepPerms(n-2) + stepPerms(n-3)) % 1000000007;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while(s-- > 0){
            int n = sc.nextInt();
            int result = stepPerms(n);
            System.out.println(result);
        }
    }
}
