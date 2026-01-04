package com.hashmapshashfunctions.PairWithGivenSumInAnArray;
public class PairWithGivenSumTest {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean exists = PairWithGivenSum.hasPairWithSum(arr, target);

        if (!exists) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
