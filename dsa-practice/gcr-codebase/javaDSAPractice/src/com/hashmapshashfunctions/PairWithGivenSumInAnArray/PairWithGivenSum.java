package com.hashmapshashfunctions.PairWithGivenSumInAnArray;
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    // Method to check if a pair exists
    public static boolean hasPairWithSum(int[] arr, int target) {

        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}
