package com.dme.day_16.hackerrank;

import java.util.*;

public class JavaStaticInitializerBlock_03 {
    static int B;
    static int H;
    static boolean valid = true;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            valid = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static void main(String[] args) {
        if (valid) {
            System.out.println(B * H);
        }
    }
}
