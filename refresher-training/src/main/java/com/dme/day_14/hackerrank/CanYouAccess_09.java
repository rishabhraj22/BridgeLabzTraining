package com.dme.day_14.hackerrank;

import java.io.*;
import java.util.*;

public class CanYouAccess_09 {

    static class Inner {
        private class Private {
            private void powerof2(int num) {
                if ((num & (num-1)) == 0) {
                    System.out.println(num + " is power of 2");
                } else {
                    System.out.println(num + " is not a power of 2");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Inner inner = new Inner();
        Inner.Private privateObj = inner.new Private();
        privateObj.powerof2(num);
        System.out.println("An instance of class: " + privateObj.getClass().getCanonicalName() + " has been created");
    }
}
