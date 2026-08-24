package com.dme.day_17.hackerrank;

import java.util.Scanner;

public class ValidUsernameRegularExpression_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            if (username.matches(regex)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
