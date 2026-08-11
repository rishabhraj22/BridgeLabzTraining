package com.dme.day_08.hackerrank;

import java.util.*;

public class GenerateSubset_03 {

    static void generate(int[] arr, int idx, int k, ArrayList<Integer> list) {
        if (list.size() == k) {
            System.out.println(list);
            return;
        }
        if (idx == arr.length) {
            return;
        }
        list.add(arr[idx]);
        generate(arr, idx+1, k, list);
        list.remove(list.size()-1);
        generate(arr, idx+1, k, list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        generate(arr, 0, k, new ArrayList<>());
    }
}