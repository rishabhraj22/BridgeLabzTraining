package com.dme.day_01.hackerrank;

import java.util.*;

public class ReverseArray_05 {

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversedArray = new ArrayList<>();
        for(int i = a.size()-1; i >= 0; i--){
            reversedArray.add(a.get(i));
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for(int i = 0; i<n; i++){
            a.add(sc.nextInt());
        }

        List<Integer> result = reverseArray(a);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}