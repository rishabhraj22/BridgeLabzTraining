package com.dme.day_01.hackerrank;

import java.util.*;

public class ArrayManipulation_09 {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] arr = new int[n];

        for(List<Integer> q : queries){
            int a = q.get(0);
            int b = q.get(1);
            int k = q.get(2);

            // adding k from index a to b
            for(int i = a-1; i <= b-1; i++){
                arr[i] += k;
            }
        }

        int maximum = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }

        return maximum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();

        for(int i = 0; i < m; i++){
            List<Integer> query = new ArrayList<>();

            query.add(sc.nextInt());
            query.add(sc.nextInt());
            query.add(sc.nextInt());
            queries.add(query);
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);
    }
}