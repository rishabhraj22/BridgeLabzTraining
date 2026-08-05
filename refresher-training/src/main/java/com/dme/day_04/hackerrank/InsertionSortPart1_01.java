package com.dme.day_04.hackerrank;

import java.util.*;

public class InsertionSortPart1_01 {

    public static void insertionSort1(int n, List<Integer> arr) {

        int key = arr.get(n - 1);
        int i = n - 2;

        while(i >= 0 && arr.get(i) > key){
            arr.set(i + 1, arr.get(i));
            printArray(arr);
            i--;
        }
        arr.set(i + 1, key);
        printArray(arr);
    }

    public static void printArray(List<Integer> arr) {

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        insertionSort1(n, arr);
    }
}