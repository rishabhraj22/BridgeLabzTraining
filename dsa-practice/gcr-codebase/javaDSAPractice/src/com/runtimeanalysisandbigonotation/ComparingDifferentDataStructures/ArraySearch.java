package com.runtimeanalysisandbigonotation.ComparingDifferentDataStructures;
public class ArraySearch {

    public static boolean search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
