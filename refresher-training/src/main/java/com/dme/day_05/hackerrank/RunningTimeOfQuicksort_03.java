package com.dme.day_05.hackerrank;

import java.util.*;

public class RunningTimeOfQuicksort_03 {

    static int quickSwaps = 0;

    public static int insertionShifts(int[] arr) {
        int shifts = 0;
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                shifts++;
                j--;
            }
            arr[j+1] = key;
        }
        return shifts;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                quickSwaps++;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        quickSwaps++;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            copy[i] = arr[i];
        }
        int shifts = insertionShifts(copy);
        quickSort(arr, 0, n - 1);
        System.out.println(shifts - quickSwaps);
    }
}