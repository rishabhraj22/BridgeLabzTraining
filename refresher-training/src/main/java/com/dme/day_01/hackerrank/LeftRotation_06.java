package com.dme.day_01.hackerrank;

import java.util.*;

public class LeftRotation_06 {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> rotatedArray = new ArrayList<>();

        //adding elements from d to end
        for(int i = d; i<a.size(); i++){
            rotatedArray.add(a.get(i));
        }

        // adding first d elements
        for(int i = 0; i<d; i++){
            rotatedArray.add(a.get(i));
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }

        List<Integer> result = rotLeft(a, d);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}