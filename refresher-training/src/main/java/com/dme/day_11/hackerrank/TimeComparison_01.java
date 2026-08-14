package com.dme.day_11.hackerrank;

import java.util.*;

public class TimeComparison_01 {

    public static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour = hour + 12;
            }
        }
        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time (hh:mm:ssAM/PM): ");
        String s = sc.nextLine();
        String result = timeConversion(s);
        System.out.println("24-hour format: " + result);
    }
}